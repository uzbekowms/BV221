package edu.itstep.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/delete-cookie")
public class DeleteCookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie[] cookies = req.getCookies();
//        Cookie newCookie = null;
//        for (Cookie cookie : cookies) {
//            if ("name".equals(cookie.getName())) {
//                resp.addCookie(newCookie);
//            }
//        }
//        resp.addCookie(cookie);

    }
}
