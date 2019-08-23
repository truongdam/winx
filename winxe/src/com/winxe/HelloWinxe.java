package com.winxe;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWinxe extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse res){
        res.setContentType("text/html");
        try {
            PrintWriter writer = res.getWriter();
            writer.println("<html><body>");
            writer.println("<h6>Hello Winxe port 8080</h6>");
            writer.println("</body></html>");
        } catch (IOException e) {
            System.out.println("Error: " +  e.getMessage());
        }

    }


}