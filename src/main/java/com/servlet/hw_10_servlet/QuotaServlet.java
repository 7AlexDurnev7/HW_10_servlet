package com.servlet.hw_10_servlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/quota-servlet")
public class QuotaServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Bad programmers worry about the code. " +
                "Good program- mers worry about data structures " +
                "and their relationships\n";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(message);
//        System.out.println("quota worked");
    }

    public void destroy() {
    }
}