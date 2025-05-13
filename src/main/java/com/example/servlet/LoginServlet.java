package com.example.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "admin123".equals(password)) {
            response.sendRedirect("admin");
        } else if ("user".equals(username) && "user123".equals(password)) {
            response.sendRedirect("user");
        } else {
            response.getWriter().println("Đăng nhập thất bại. <a href='login.jsp'>Thử lại</a>");
        }
    }
}
