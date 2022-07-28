package application.domain;

import application.ServerInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;


public class InvalidAgeException extends Exception {
    private static final Logger LOGGER = LogManager.getLogger(InvalidAgeException.class);
    public InvalidAgeException() {
        super("Age should be higher than 18");
        LOGGER.error(getMessage());
    }

}
