package com.hellenic.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;

import com.hellenic.DAO.ProprieteDao;
import com.hellenic.beans.ProprieteBean;
import com.hellenic.metier.Propriete;

public class Accueil extends HttpServlet {
    public static final String VUE               = "/WEB-INF/accueil.jsp";
    public static final int    ATTR_NB_PROPRIETE = 8;
    public static final String ATTR_DAO_FACTORY  = "sessionF";

    private Propriete          proprieteM;

    public void init() throws ServletException {
        // Récupération de l'objet SessionFactory
        SessionFactory sf = (SessionFactory) getServletContext().getAttribute( ATTR_DAO_FACTORY );

        // intanciation d'un objet DAO
        ProprieteDao prorieteDao = new ProprieteDao( sf );

        if ( sf == null ) {
            System.out.println( "ERREUR SERVLET" );
        }
        // intanciation de la classe metier
        proprieteM = new Propriete( prorieteDao );

        System.out.println( "Message : Initialisation servlet propriete" );
    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

        ArrayList<ProprieteBean> list = proprieteM.listingPropriete( ATTR_NB_PROPRIETE );

        request.setAttribute( "lesProprietes", list );

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
