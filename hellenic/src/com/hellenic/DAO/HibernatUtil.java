package com.hellenic.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernatUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch ( Throwable ex ) {
            throw new ExceptionInInitializerError( ex );
        }
    }

    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
}