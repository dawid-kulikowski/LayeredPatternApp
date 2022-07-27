package application.domain;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Age should be higher than 18");
    }

}
