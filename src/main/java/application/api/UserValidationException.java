package application.api;

public class UserValidationException extends Exception{
    UserValidationException(String field){
        super(String.format("User validation failed. Field %s cannot be empty.",field));
    }
}
