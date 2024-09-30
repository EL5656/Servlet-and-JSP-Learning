
package org.practice;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    //service method
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int i = Integer.parseInt(request.getParameter("num1"));//name in index.html
        int j = Integer.parseInt(request.getParameter("num2"));
        int k = i+j;
        PrintWriter out = response.getWriter();
        out.println("The result is "+k);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int i = Integer.parseInt(request.getParameter("num1"));//name in index.html
        int j = Integer.parseInt(request.getParameter("num2"));
        int k = i+j;
        //passing key and value to SqServlet
        request.setAttribute("k",k);

        RequestDispatcher rd = request.getRequestDispatcher("calc");
        rd.forward(request,response);
    }
}
