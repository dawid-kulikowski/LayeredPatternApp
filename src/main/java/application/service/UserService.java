package application.service;

import application.domain.InvalidAgeException;
import application.dto.UserDTO;

import java.util.List;

public interface UserService {
    void createUser(UserDTO userDTO) throws InvalidAgeException;
    List<UserDTO> getAllUsers();
}
