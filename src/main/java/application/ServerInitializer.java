package application;

import application.api.servlet.UserServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class ServerInitializer {
    private static final Tomcat TOMCAT = new Tomcat();

    static {
        TOMCAT.setPort(8080);
        Context context = TOMCAT.addContext("/", new File(".").getAbsolutePath());

        Tomcat.addServlet(context, "userApi", new UserServlet());
        context.addServletMappingDecoded("/user", "userApi");
    }

    public static void runServer() throws LifecycleException {
        TOMCAT.start();
        TOMCAT.getConnector();
        TOMCAT.getServer().await();

    }
}