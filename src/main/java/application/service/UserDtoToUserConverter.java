package application.service;

import application.domain.InvalidAgeException;
import application.domain.User;
import application.dto.UserDTO;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class UserDtoToUserConverter {
    public static User convert(UserDTO userDTO) throws InvalidAgeException {
        return new User(userDTO.name, userDTO.surname, userDTO.age);
    }
}


