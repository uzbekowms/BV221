package edu.itstep.servlets;

import edu.itstep.servlets.models.User;
import edu.itstep.servlets.services.Calculator;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/example")
public class ExampleServlet extends HttpServlet {

    private final Calculator calculator = new Calculator();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        System.out.println(num1);
        System.out.println(num2);
        req.getSession().setAttribute("result", calculator.add(num1, num2));

        req.getSession().setAttribute("name", "Oleg");
        req.setAttribute("user", new User(1, "Petro"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.equals("admin") && password.equals("admin")) {
            req.getRequestDispatcher("/admin.jsp").forward(req, resp);
        }

        resp.getWriter().println("Неправильне ім'я користувача або пароль");

        req.getRequestDispatcher("/WEB-INF/pages/example.jsp").forward(req, resp);


    }
}
