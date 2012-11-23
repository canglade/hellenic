package com.hellenic.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellenic.metier.Identification;

public class Connexion extends HttpServlet {
    private static final String VUE              = "/WEB-INF/connexion.jsp";
    private static final String VUE_ADMIN_DEFAUT = "/WEB-INF/admin/bienvenu.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        Identification form = new Identification();

        if ( form.Identification( request ) ) {
            this.getServletContext().getRequestDispatcher( VUE_ADMIN_DEFAUT ).forward( request, response );
        } else {
            this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        }
    }
}
