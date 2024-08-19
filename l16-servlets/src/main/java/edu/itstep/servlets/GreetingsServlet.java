package edu.itstep.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// Newer version of declaring servlets
public class GreetingsServlet extends HttpServlet {


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Initializing Servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String age = req.getParameter("age");
//        String[] names = req.getParameterValues("names");
//
//        resp.setContentType("text/html");
//        resp.getWriter().println("<h1>Hello from servlet</h1>");
//        resp.getWriter().println("""
//                <h2>Your age is %s</h2>
//                """.formatted(age));
//
//        PrintWriter out = resp.getWriter();
//
//        out.println("<ul>");
//        for (String name : names) {
//            out.println("<li>" + name + "</li>");
//        }
//        out.println("</ul>");
        String message = getServletConfig().getInitParameter("message");
        resp.getWriter().println(message);

    }

    @Override
    public void destroy() {
        System.out.println("Destroying Servlet");
    }
}
