package application.api;

import jakarta.servlet.http.HttpServlet;

import java.net.http.HttpRequest;
import java.util.List;

public class RestApi  implements Api  {

    @Override
    public void createUser() {

    }

    @Override
    public List<String> getUsers() {
        return null;
    }

    @Override
    public String getUser() {
        return null;
    }

    @Override
    public void updateUser(String user) {

    }
}
