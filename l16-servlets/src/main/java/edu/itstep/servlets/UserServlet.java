package edu.itstep.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    private List<String> users = new ArrayList<>();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        users.add(req.getParameter("firstName") + " " + req.getParameter("lastName"));
        PrintWriter writer = resp.getWriter();
        writer.println(req.getParameter("firstName"));
        writer.println(req.getParameter("lastName"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        users.add(req.getParameter("firstName") + " " + req.getParameter("lastName"));
        PrintWriter writer = resp.getWriter();
        writer.println(req.getParameter("firstName"));
        writer.println(req.getParameter("lastName"));
        resp.getWriter().println(users);
    }
}
