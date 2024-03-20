package com.cg.jspjstl.imagelist;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CustomerListServlet", urlPatterns = {"/CustomerList"})
public class CustomerListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = getCustomerList(); // Lấy danh sách khách hàng

        // Chuyển hướng dữ liệu sang JSP
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/customerList.jsp").forward(request, response);
    }

    // Phương thức giả lập để lấy danh sách khách hàng (thay thế bằng cách lấy từ nguồn dữ liệu thực tế)
    private List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        // Thêm khách hàng vào danh sách
        customerList.add(new Customer("John", "01/01/1990", "123 Main St", "image1.jpg"));
        customerList.add(new Customer("Jane", "02/02/1991", "456 Elm St", "image2.jpg"));
        customerList.add(new Customer("John Doe", "1990-01-15", "123 Main St, Anytown", "images/john.jpg"));
        customerList.add(new Customer("Alice Smith", "1985-05-20", "456 Oak St, Anycity", "images/alice.jpg"));
        customerList.add(new Customer("Bob Johnson", "1978-09-10", "789 Elm St, Anywhere", "images/bob.jpg"));
        // Thêm các khách hàng khác vào đây...
        return customerList;
    }
}

