package org.practice;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //fetch data from AddServlet
        //convert to integer
        int k = (int) request.getAttribute("k");
        k = k*k;
        PrintWriter out = response.getWriter();
        out.println("Result is "+k);
    }
}
