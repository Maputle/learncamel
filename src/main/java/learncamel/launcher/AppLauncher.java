package learncamel.launcher;

import learncamel.config.RestConfiguration;
import learncamel.routes.CreateUsersRoute;
import org.apache.camel.main.Main;

public class AppLauncher {

    public static void main(String[] args) throws Exception {

        Main appMainRun = new Main();
        appMainRun.addRouteBuilder(new RestConfiguration());
        appMainRun.addRouteBuilder(new CreateUsersRoute());
        appMainRun.run(args);

    }
}
