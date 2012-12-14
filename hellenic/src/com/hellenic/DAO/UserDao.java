package com.hellenic.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hellenic.beans.User;

public class UserDao implements UserDaoInt {
    private SessionFactory sessionF;

    public UserDao( SessionFactory sessionF ) {
        this.sessionF = sessionF;
    }

    @Override
    public User authentification( String login, String pwd ) throws DaoException {
        String hql = "FROM com.hellenic.beans.User user WHERE user.login = " + login + "AND user.pwd = " + pwd;
        List<User> list = null;

        try {
            // ouverture d'une session hibernate
            Session ses = sessionF.openSession();

            // execute la requette
            Query query = ses.createQuery( hql );

            // met le resultat sous form de list
            list = (List) query.list();

            // libération des resources ????
            ses.close();
        } catch ( DaoException ex ) {
            System.out.println( "Erreur : execution authentification dans UserDao" );
        }

        // test le resultat
        if ( list.size() == 1 ) {
            return (User) list.get( 0 );
        } else {
            return null;
        }
    }
}
