package application;

import application.api.UserApi;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Application {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        Context context = tomcat.addContext("/", new File(".").getAbsolutePath());
    Tomcat.addServlet(context, "userApi", new UserApi());
    context.addServletMappingDecoded("/user", "userApi");

    tomcat.start();
    tomcat.getConnector();
    tomcat.getServer().await();
    }
}
