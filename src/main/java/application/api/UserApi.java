package application.api;

import application.domain.InvalidAgeException;
import application.dto.UserDTO;
import application.service.UserService;
import application.service.UserServiceImpl;
import jakarta.servlet.http.HttpServlet;

import java.net.http.HttpRequest;
import java.util.List;

public class UserApi implements Api  {

    private final UserService userService = new UserServiceImpl();

    @Override
    public void createUser(UserDTO userDTO) throws UserValidationException, InvalidAgeException {
        Validator.validateUserDTO(userDTO);
        userService.createUser(userDTO);
    }

    @Override
    public List<UserDTO> getAllUser() {
        return userService.getAllUsers();
    }
}
