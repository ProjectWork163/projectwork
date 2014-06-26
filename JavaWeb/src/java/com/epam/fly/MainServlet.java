package com.epam.fly;

import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        BaseContact baseContact = new BaseContact();
        // prepare data
        Map<Long, String> flights = baseContact.getFlights();
        // send them to jsp
        request.setAttribute("flights", flights);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("error", "");
        request.getRequestDispatcher("/fly").forward(request, response);
        response.sendRedirect("/fly");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
