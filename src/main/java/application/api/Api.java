package application.api;

import application.domain.InvalidAgeException;
import application.dto.UserDTO;

import java.util.List;

public interface Api {
    void createUser(UserDTO userDTO) throws UserValidationException, InvalidAgeException;
    List<UserDTO> getAllUser();
}
