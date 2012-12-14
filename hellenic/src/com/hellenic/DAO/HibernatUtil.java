package com.hellenic.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernatUtil {
    private SessionFactory sessionFactory;

    public void HibernatUtil() {
        try {
            // instanciation d'un objet SessionFactory
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            System.out.println( "Message : Instanciation SessionFactory Hibernate" );
        } catch ( Throwable ex ) {
            System.out.println( "Erreur : instanciation HibernatUtil / SessionFactory" );
            throw new ExceptionInInitializerError( ex );
        }
    }

    // retourne une session hibernate
    public Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }

    // retourne la sessionFactory
    public SessionFactory getSessionF() throws HibernateException {
        return sessionFactory;
    }
}