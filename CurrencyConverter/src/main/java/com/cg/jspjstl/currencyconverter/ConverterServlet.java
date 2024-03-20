package com.cg.jspjstl.currencyconverter;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConverterServlet")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // Lấy giá trị USD và tỷ giá từ request
        double usd = Double.parseDouble(request.getParameter("usd"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        // Tính toán giá trị VND
        double vnd = usd * rate;
        // In ra kết quả
        out.println("<html><body>");
        out.println("<h2>Result</h2>");
        out.println("<p>USD: " + usd + "</p>");
        out.println("<p>Rate: " + rate + "</p>");
        out.println("<p>VND: " + vnd + "</p>");
        out.println("</body></html>");
        out.close();
    }
}