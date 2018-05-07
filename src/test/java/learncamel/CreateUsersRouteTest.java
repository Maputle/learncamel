package learncamel;

import learncamel.routes.CreateUsersRoute;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class CreateUsersRouteTest extends CamelTestSupport {
    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new CreateUsersRoute();
    }

    @Test
    public void createUser(){

        String input = "{\"ID\": 0,\"UserName\": \"string\", \"Password\": \"string\"}";

        String response = (String) template.requestBody("direct:createUsers",input);
        System.out.println("Response : " + response);

    }
}
