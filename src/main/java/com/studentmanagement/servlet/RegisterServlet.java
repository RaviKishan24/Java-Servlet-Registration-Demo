
package com.studentmanagement.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res) throws IOException {

        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        System.out.println("Received name: " + name);

        // Pass the user's name to JSP
        req.setAttribute("name", name);

        // Forward the request to welcome.jsp
        try {
            RequestDispatcher dispatcher =
                    req.getRequestDispatcher("/welcome.jsp");

            dispatcher.forward(req, res);

        } catch (jakarta.servlet.ServletException e) {
            throw new IOException(e);
        }
    }
}
