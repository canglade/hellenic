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
    public static final String  ATTR_DAO_FACTORY = "sessionF";
    private static final String VUE              = "/WEB-INF/connexion.jsp";
    private static final String VUE_ADMIN_DEFAUT = "/WEB-INF/admin/bienvenu.jsp";

    private UserDao             userDao;

    public void init() throws ServletException {
        // Récupération de l'objet SessionFactory
        SessionFactory sf = (SessionFactory) getServletContext().getAttribute( "sessionF" );
        if ( sf == null ) {
            System.out.println( "Erreur : sf error servletCo" );
        }
        // intanciation d'un objet DAO
        this.userDao = new UserDao( sf );

        System.out.println( "Message : Initialisation servlet connexion" );

    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        // appel du form
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        // classe metier
        Identification form = new Identification( userDao );

        // authentification
        boolean result = form.identification( request );

        System.out.println( "Message : authentification = " + result );
        // redirection suivant le resultat
        if ( result ) {
            this.getServletContext().getRequestDispatcher( VUE_ADMIN_DEFAUT ).forward( request, response );
        } else {
            this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        }
    }
}
