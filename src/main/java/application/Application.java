package application;

import org.apache.catalina.LifecycleException;

public class Application {
    public static void main(String[] args) throws LifecycleException {
        ServerInitializer.runServer();
    }
}
