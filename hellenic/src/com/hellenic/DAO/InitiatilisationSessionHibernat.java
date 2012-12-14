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
        hibernatUtil = new HibernatUtil();
        if ( hibernatUtil == null ) {
            System.out.println( "Message : hibernatUtil error initialisation" );
        }

        try {
            // recuperation de la SessionFactory Hibernat
            SessionFactory sf = hibernatUtil.getSessionF();
            if ( sf == null ) {
                System.out.println( "Message : sf error initialisation" );
            }
            // Enregistrement dans un attribut ayant pour portée toute
            // l'application
            servletContext.setAttribute( "sessionF", sf );

            System.out.println( "Message : attribution sessionHibernat " );
        } catch ( Exception ex ) {
            System.out.println( "Erreur : attribution SessionFactory Hibernat" );
        }
    }

    @Override
    public void contextDestroyed( ServletContextEvent event ) {
        System.out.println( "Message : Listener Destruction" );
    }

}
