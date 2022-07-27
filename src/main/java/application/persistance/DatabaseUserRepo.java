package application.persistance;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUserRepo implements UserRepo {
    private static final List<UserEntity> users = new ArrayList<>();

    @Override
    public void addUser(UserEntity userEntity) {
        users.add(userEntity);
    }

    @Override
    public List<UserEntity> getUsers() {
        return users;
    }
}
