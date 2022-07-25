package application.api;

import java.util.List;

public interface Api {
    void createUser();
    List<String> getUsers();
    String getUser();
    void updateUser(String user);
}
