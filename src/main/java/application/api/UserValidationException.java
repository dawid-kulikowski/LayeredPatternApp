package application.api;

import application.domain.InvalidAgeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserValidationException extends Exception{
    private static final Logger LOGGER = LogManager.getLogger(UserValidationException.class);

    UserValidationException(String field){
        super(String.format("User validation failed. Field %s cannot be empty.",field));
    LOGGER.error(getMessage());
    }
}
