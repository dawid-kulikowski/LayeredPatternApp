package application.api;
import application.dto.UserDTO;

public class Validator {
    public static void validateUserDTO(UserDTO userDTO) throws UserValidationException {
        if (userDTO == null) {
            throw new UserValidationException("each");
        }
    validateField("name", userDTO.name);
    validateField("surname", userDTO.surname);
    validateField("age", userDTO.age);

    }

    private static void validateField(String fieldName, String value) throws UserValidationException{
        if (value == null || value.isEmpty()) {
            throw new UserValidationException(fieldName);
        }
    }

    private static void validateField(String fieldName, int value) throws UserValidationException {
        if (value <= 0) {
            throw new UserValidationException(fieldName);
        }
    }

}
