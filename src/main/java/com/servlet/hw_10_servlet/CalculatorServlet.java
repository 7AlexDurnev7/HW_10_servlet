package com.servlet.hw_10_servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.sendRedirect(request.getContextPath() + "/calculator.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            double number_1 = Double.parseDouble(request.getParameter("number_1"));
            double number_2 = Double.parseDouble(request.getParameter("number_2"));
            String operation = request.getParameter("operation");

            double result =
               switch (operation) {
                    case "+" -> number_1 + number_2;
                    case "-" -> number_1 - number_2;
                    case "*" -> number_1 * number_2;
                    case "/" -> number_1 / number_2;
                    case "%" -> number_1 / 100 * number_2;
                    case "^" -> Math.pow(number_1,number_2);
                default -> throw new Exception();
            };

            HttpSession session = request.getSession();
            session.setAttribute("result", result);
            session.setAttribute("number_1", number_1);
            session.setAttribute("number_2", number_2);
            response.sendRedirect(request.getContextPath() + "/calculator.jsp");

        } catch (Exception ex) {
            ServletContext sContext = getServletContext();
            RequestDispatcher rDispatcher =
                    sContext.getRequestDispatcher("/error.jsp");
            rDispatcher.forward(request, response);
            //throw new RuntimeException(ex);

        }
    }
}
