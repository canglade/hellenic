package com.hellenic.DAO;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;

public class InitiatilisationSessionHibernat implements ServletContextListener {
    private HibernatUtil hibernatUtil;

    @Override
    public void contextInitialized( ServletContextEvent event ) {
        // Récupération du ServletContext lors du chargement de l'application
        ServletContext servletContext = event.getServletContext();

        // TODO CREATION SESSION HIBERNAT ??????????????????
        this.hibernatUtil = new HibernatUtil();

        System.out.println( "mouahahaha" );
        /* Enregistrement dans un attribut ayant pour portée toute l'application */
        try {
            SessionFactory sf = hibernatUtil.getSessionF();

            servletContext.setAttribute( "sessionHibernat", sf );
            System.out.println( "attribut sessionHibernat mémo " + sf.toString() );
        } catch ( Exception ex ) {
            System.out.println( "ok flroejnrpoé" );
        }

    }

    @Override
    public void contextDestroyed( ServletContextEvent event ) {

    }

}
