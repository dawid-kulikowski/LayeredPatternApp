package application;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class ServerInitializer {

            private static final Tomcat TOMCAT = new Tomcat();
        TOMCAT.setPort(8080);
        Context context = tomcat.addContext("/", new File(".").getAbsolutePath());

        Tomcat.addServlet(context, "userApi", new UserApi());
    context.addServletMappingDecoded("/user", "userApi");

    tomcat.start();
    tomcat.getConnector();
    tomcat.getServer().await();

}
