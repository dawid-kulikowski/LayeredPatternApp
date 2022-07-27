package application.service;

import application.domain.InvalidAgeException;
import application.domain.User;
import application.dto.UserDTO;
import application.persistance.DatabaseUserRepo;
import application.persistance.UserEntity;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static final DatabaseUserRepo databaseUserRepo = new DatabaseUserRepo();
    @Override
    public void createUser(UserDTO userDTO) throws InvalidAgeException {
        User user = UserDtoToUserConverter.convert(userDTO);

        UserEntity userEntity = UserToUserEntityConverter.convert(user);

        databaseUserRepo.addUser(userEntity);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return UserEntityToUserDtoConverter.convert(databaseUserRepo.getUsers());
    }
}
