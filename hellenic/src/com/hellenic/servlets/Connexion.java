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

    private Identification      identificationM;

    public void init() throws ServletException {
        // Récupération de l'objet SessionFactory
        SessionFactory sf = (SessionFactory) getServletContext().getAttribute( "sessionF" );

        // intanciation d'un objet DAO
        UserDao userDao = new UserDao( sf );

        // intanciation de la classe metier
        identificationM = new Identification( userDao );

        System.out.println( "Message : Initialisation servlet connexion" );
    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        // appel du form
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        // authentification
        boolean result = identificationM.identification( request );

        System.out.println( "Message : authentification = " + result );
        // redirection suivant le resultat
        if ( result ) {
            this.getServletContext().getRequestDispatcher( VUE_ADMIN_DEFAUT ).forward( request, response );
        } else {
            this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        }
    }
}
