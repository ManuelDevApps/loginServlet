package com.login.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user= request.getParameter("user");
        String pass = request.getParameter("pass");

        System.out.println("datos :" + user + "  " +pass);

        request.setAttribute("user", user);
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);

    }
}
