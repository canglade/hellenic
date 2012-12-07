package com.hellenic.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;

import com.hellenic.DAO.UserDao;
import com.hellenic.metier.Identification;

public class Connexion extends HttpServlet {
    public static final String  ATTR_DAO_FACTORY = "sessionHibernat";
    private static final String VUE              = "/WEB-INF/connexion.jsp";
    private static final String VUE_ADMIN_DEFAUT = "/WEB-INF/admin/bienvenu.jsp";

    private UserDao             userDao;

    public void init() throws ServletException {
        // Récupération d'une instance userDao
        // TODO TYPE SESSION ??????

        SessionFactory sf = (SessionFactory) getServletContext().getAttribute( "sessionHibernat" );
        this.userDao = new UserDao( sf );

    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        if ( userDao == null ) {
            System.out.println( "et merde" );
        }
        Identification form = new Identification( userDao );

        if ( form.identification( request ) ) {
            this.getServletContext().getRequestDispatcher( VUE_ADMIN_DEFAUT ).forward( request, response );
        } else {
            this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        }
    }
}
