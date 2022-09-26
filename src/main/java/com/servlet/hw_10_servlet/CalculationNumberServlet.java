package com.servlet.hw_10_servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.stream.Stream;

@WebServlet(name = "CalculationNumberServlet", value = "/calculationNumberServlet")
public class CalculationNumberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/calculationNumber.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            double num_1 = Double.parseDouble(request.getParameter("num_1"));
            double num_2 = Double.parseDouble(request.getParameter("num_2"));
            double num_3 = Double.parseDouble(request.getParameter("num_3"));
//        request.setAttribute("result", getMaxNum(num_1, num_2, num_3));
//        request.setAttribute("result", getMinNum(num_1, num_2, num_3));
            String choice = request.getParameter("choice");

            double result =
                    switch (choice) {
                        case "MAX" -> getMaxNum(num_1, num_2, num_3);
                        case "MIN" -> getMinNum(num_1, num_2, num_3);
                        case "AVG" -> getAvgSum(num_1, num_2, num_3);
                        default -> throw new Exception();
                    };

            request.setAttribute("result", result);
//      request.setAttribute("choice", choice);
//      request.setAttribute("num_1", num_1);
//      request.setAttribute("num_2", num_2);
//      request.setAttribute("num_3", num_3);
            getServletContext().getRequestDispatcher("/calculationNumber.jsp").forward(request, response);
            //response.sendRedirect(request.getContextPath() + "/calculationNumber.jsp");
        } catch (Exception ex) {
            // перенаправление запроса на страницу с ошибкой

            throw new RuntimeException(ex);
        }
    }

    // Method to find max number
    public static Double getMaxNum (double number_1, double number_2, double number_3) {
        return Stream.of(number_1, number_2, number_3).reduce(Math::max).get();
    }

    // Method to find minimum number
    public static Double getMinNum (double number_1, double number_2, double number_3) {
        return Stream.of(number_1, number_2, number_3).reduce(Math::min).get();
    }

    // Method to find average sum
    public static Double getAvgSum (double number_1, double number_2, double number_3) {
       return (number_1 + number_2 + number_3) / 3;
    }
}
