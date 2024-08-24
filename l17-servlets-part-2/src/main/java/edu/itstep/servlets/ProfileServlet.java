package edu.itstep.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String username = (String) req.getSession().getAttribute("username");
        resp.setContentType("text/html");
        HttpSession session = req.getSession();
        resp.getWriter().println(session.isNew());
        if (username == null) {
            writer.println("<h1>You are not logged in</h1>");
            return;
        }
        writer.println("<h1>You are logged in %s</h1>".formatted(username));

        resp.getWriter().println(session.getId());
        session.setMaxInactiveInterval(10);
    }
}
