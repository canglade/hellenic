package com.hellenic.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hellenic.beans.User;

public class UserDao implements UserDaoInt {
    private SessionFactory sessionF;

    // TODO TYPE SESSION ??????????
    public UserDao( SessionFactory sessionH ) {
        this.sessionF = sessionH;

    }

    @Override
    public User authentification( String login, String pwd ) throws DaoException {

        String hql = "FROM com.hellenic.beans.User user WHERE user.login = " + login + "AND user.pwd = " + pwd;

        Session ses = null;

        ses = sessionF.openSession();
        // session = ses;

        // execute la requette
        Query query = ses.createQuery( hql );
        // met le resultat sous form de list
        List<User> list = (List) query.list();
        ses.close();

        // test le resultat
        if ( list.size() == 1 ) {
            return (User) list.get( 0 );
        } else {
            return null;
        }
    }
}
