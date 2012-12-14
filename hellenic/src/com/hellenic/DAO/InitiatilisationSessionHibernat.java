package com.hellenic.DAO;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;

public class InitiatilisationSessionHibernat implements ServletContextListener {
    private HibernatUtil hibernatUtil;

    @Override
    public void contextInitialized( ServletContextEvent event ) {
        System.out.println( "Message : Listener Initialisation" );

        // Récupération du ServletContext lors du chargement de l'application
        ServletContext servletContext = event.getServletContext();

        // instanciation d'un objet hibernate util
        this.hibernatUtil = new HibernatUtil();

        try {
            // recuperation de la SessionFactory Hibernat
            SessionFactory sf = hibernatUtil.getSessionF();

            // Enregistrement dans un attribut ayant pour portée toute
            // l'application
            servletContext.setAttribute( "sessionF", sf );

            System.out.println( "Message : attribution sessionHibernat " + sf.toString() );
        } catch ( Exception ex ) {
            System.out.println( "Erreur : attribution SessionFactory Hibernat" );
        }
    }

    @Override
    public void contextDestroyed( ServletContextEvent event ) {
        System.out.println( "Message : Listener Destruction" );
    }

}
