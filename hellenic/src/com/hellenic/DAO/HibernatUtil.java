package com.hellenic.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernatUtil {

    private SessionFactory sessionFactory;

    public void HibernatUtil() {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

        } catch ( Throwable ex ) {
            throw new ExceptionInInitializerError( ex );
        }
    }

    public Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }

    public SessionFactory getSessionF() throws HibernateException {
        return sessionFactory;
    }
}