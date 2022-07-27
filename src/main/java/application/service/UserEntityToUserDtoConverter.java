package application.service;

import application.dto.UserDTO;
import application.persistance.UserEntity;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)

public final class UserEntityToUserDtoConverter {

    public static List<UserDTO> convert(Collection<UserEntity> userEntities) {
        return userEntities.stream()
                .map(userEntity -> new UserDTO(
                        userEntity.name,
                        userEntity.surname,
                        userEntity.age)
                )
                .toList();
    }

}
