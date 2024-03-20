package com.cg.jspjstl.dictionarybasic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SimpleDictionaryServlet", urlPatterns = {"/SimpleDictionary"})
public class SimpleDictionaryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");

        String search = request.getParameter("search");
        String result = dic.get(search);

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Simple Dictionary</title>");
        out.println("</head>");
        out.println("<body>");

        if (result != null) {
            out.println("<p>Word: " + search + "</p>");
            out.println("<p>Result: " + result + "</p>");
        } else {
            out.println("<p>Not found</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
