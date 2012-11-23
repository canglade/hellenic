package com.hellenic.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Bien extends HttpServlet {
    public static final String VUE = "/WEB-INF/bien.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        // TODO chercher les 10 1er bien
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
