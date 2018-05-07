package learncamel.routes;

import learncamel.domain.CreateUsersDAO;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.gson.GsonDataFormat;

public class CreateUsersRoute extends RouteBuilder {
    public void configure() throws Exception {

        GsonDataFormat gsonDataFormat = new GsonDataFormat(CreateUsersDAO.class);

        from("direct:createUsers")
                .id("CreateUsersRoute")
                .to("log:?level=INFO&showBody=true")
                .streamCaching()
                .setHeader("CamelHttpMethod").constant("POST")
                .setHeader("Content-Type").constant("application/json")
                .setHeader("Accept").constant("application/json")
                .marshal(gsonDataFormat)
                .log("The Body is ${body}")
                .removeHeaders("*")
                .log("The headers are ${headers}")
                .to("https://fakerestapi.azurewebsites.net/api/Users")
                .to("log:?level=INFO&showBody=true")
                .convertBodyTo(String.class, "UTF-8")
                .to("direct:forTest");


    }

}
