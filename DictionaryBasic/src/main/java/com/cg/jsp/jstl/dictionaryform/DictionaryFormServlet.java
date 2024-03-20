package com.cg.jsp.jstl.dictionaryform;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DictionaryFormServlet", urlPatterns = {"/DictionaryForm"})
public class DictionaryFormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
        out.println("<title>Simple Dictionary</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Vietnamese Dictionary</h2>");
        out.println("<form action=\"DictionaryServlet\" method=\"post\">");
        out.println("<input type=\"text\" name=\"search\" placeholder=\"Enter your word: \"/>");
        out.println("<input type=\"submit\" id=\"submit\" value=\"Search\"/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}

