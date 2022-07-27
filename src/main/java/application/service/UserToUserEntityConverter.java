package application.service;

import application.domain.User;
import application.persistance.UserEntity;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)

public class UserToUserEntityConverter {
    public static UserEntity convert(User user) {
        return new UserEntity(user.getName(), user.getSurname(), user.getAge());
    }
}
