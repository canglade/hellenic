package com.hellenic.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AfficheBien extends HttpServlet {
    public static final String VUE = "/WEB-INF/affiche-bien.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        // TODO rechercher le bien passer en GET
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}