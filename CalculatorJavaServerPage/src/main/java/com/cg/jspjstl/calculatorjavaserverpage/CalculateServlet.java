package com.cg.jspjstl.calculatorjavaserverpage;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/CalculateServlet")
public class CalculateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int operand1 = Integer.parseInt(request.getParameter("operand1"));
        int operand2 = Integer.parseInt(request.getParameter("operand2"));
        String operator = request.getParameter("operator");
        double result;
        String errorMessage = null;
        switch (operator) {
            case "add":
                result = operand1 + operand2;
                break;
            case "subtract":
                result = operand1 - operand2;
                break;
            case "multiply":
                result = operand1 * operand2;
                break;
            case "divide":
                if (operand2 != 0) {
                    result = (double) operand1 / operand2;
                } else {
                    errorMessage = "Error: Cannot divide by zero!";
                    result = 0;
                }
                break;
            default:
                errorMessage = "Error: Invalid operator!";
                result = 0;
        }
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<meta charset=\"UTF-8\">");
//        out.println("<title>Calculation Result</title>");
//        out.println("</head>");
//        out.println("<body>");
//        if (errorMessage != null) {
//            out.println("<h2>" + errorMessage + "</h2>");
//        } else {
//            out.println("<h2>Result: " + result + "</h2>");
//        }
//        out.println("<a href=\"calculator.jsp\">Back to Calculator</a>");
//        out.println("</body>");
//        out.println("</html>");
        request.setAttribute("result",result);
        request.setAttribute("errorMessage", errorMessage);
        request.getRequestDispatcher("/result.jsp")
                .forward(request, response);

    }
}
