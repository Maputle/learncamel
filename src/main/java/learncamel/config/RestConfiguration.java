package learncamel.config;

import org.apache.camel.builder.RouteBuilder;

import static org.apache.camel.model.rest.RestBindingMode.auto;

public class RestConfiguration extends RouteBuilder {
    public void configure() throws Exception {

        //Configure the rest stuff
        restConfiguration()
                .component("restlet")
                .host("localhost")
                .port(8181)
                .bindingMode(auto)
                .enableCORS(true)
                .dataFormatProperty("prettyPrint", "true")
                .apiContextPath("/api-docs")
                .apiProperty("cors", "true");

        rest("/users/create")
                .post()
                .consumes("application/json")
                .produces("application/json")
                .to("direct:createUsers");


    }
}