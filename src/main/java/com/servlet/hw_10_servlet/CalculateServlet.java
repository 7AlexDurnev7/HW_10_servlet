package com.servlet.hw_10_servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.stream.Stream;

@WebServlet(name = "Calculate_Servlet", value = "/calculateServlet")
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/calculate.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int number_1 = Integer.parseInt(request.getParameter("number_1"));
        int number_2 = Integer.parseInt(request.getParameter("number_2"));
        int number_3 = Integer.parseInt(request.getParameter("number_3"));
        request.setAttribute("result", getMaxNum(number_1, number_2, number_3));
        getServletContext().getRequestDispatcher("/calculate.jsp").forward(request, response);
    }

    // Method to find maximum number
    public static Integer getMaxNum (int number_1, int number_2, int number_3) {
        return Stream.of(number_1, number_2, number_3).reduce(Math::max).get();
    }

}
