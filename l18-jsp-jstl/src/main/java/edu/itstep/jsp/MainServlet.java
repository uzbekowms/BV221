package edu.itstep.jsp;

import edu.itstep.jsp.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/greetings")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("messaqe", "<script>console.log('Hello world')</script>");
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Petro"));
        users.add(new User(2, "Oleg"));
        req.setAttribute("users", users);
        req.getRequestDispatcher("/greetings.jsp").forward(req, resp);
    }
}
