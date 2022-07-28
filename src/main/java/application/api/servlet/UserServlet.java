package application.api.servlet;

import application.api.UserApi;
import application.api.UserValidationException;
import application.domain.InvalidAgeException;
import application.dto.UserDTO;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {

    private static final Gson JSON_PARSER = new Gson();

    private static final UserApi USER_API = new UserApi();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        UserDTO userDTO = JSON_PARSER.fromJson(req.getReader(), UserDTO.class);

        try {
            USER_API.createUser(userDTO);
        } catch (UserValidationException | InvalidAgeException e) {
            resp.getWriter().println(e.getMessage());
            resp.setStatus(400);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        List<UserDTO> allUser = USER_API.getAllUser();

        String json = JSON_PARSER.toJson(allUser.toArray(), UserDTO[].class);

        try (PrintWriter writer = resp.getWriter()){
            writer.println(json);
        } catch (IOException e) {
            resp.setStatus(500);
        }
    }
        }

