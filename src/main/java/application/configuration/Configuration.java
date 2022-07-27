package application.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private static final Properties PROPERTIES = new Properties();
    public static final String APPLICATION_PROPERTIES_FILENAME = "application.properties";


    static {
        try (InputStream resourceAsStream =
                     Thread.currentThread()
                             .getContextClassLoader()
                             .getResourceAsStream(APPLICATION_PROPERTIES_FILENAME)) {
            PROPERTIES.load(resourceAsStream);
        } catch (IOException e) {
            //logger
        }
    }

    public static int getPort() {
        return Integer.parseInt(PROPERTIES.getProperty("server.port"));
    }
}
