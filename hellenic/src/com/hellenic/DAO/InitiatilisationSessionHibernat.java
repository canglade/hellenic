package com.hellenic.DAO;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitiatilisationSessionHibernat implements ServletContextListener {
    private HibernatUtil hibernatUtil;

    @Override
    public void contextInitialized( ServletContextEvent event ) {
        // Récupération du ServletContext lors du chargement de l'application
        ServletContext servletContext = event.getServletContext();

        // TODO CREATION SESSION HIBERNAT ??????????????????
        this.hibernatUtil = new HibernatUtil();

        /* Enregistrement dans un attribut ayant pour portée toute l'application */
        servletContext.setAttribute( "sessionHibernat", this.hibernatUtil );
    }

    @Override
    public void contextDestroyed( ServletContextEvent event ) {

    }

}
