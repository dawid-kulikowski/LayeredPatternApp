package application.persistance;

import java.util.List;

public interface UserRepo {
    void addUser(UserEntity userEntity);
    List<UserEntity> getUsers();
}
