package edu.itstep.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get-cookie")
public class DisplayCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        Cookie[] cookies = req.getCookies();
        if (cookies == null) {
            req.getRequestDispatcher("/error.html").forward(req, resp);
        }
        out.println("<ul>");
        for (Cookie cookie : cookies) {
            out.println("<li>" + cookie.getName() + "=" + cookie.getValue() + "</li>");
        }
        out.println("</ul>");
    }
}
