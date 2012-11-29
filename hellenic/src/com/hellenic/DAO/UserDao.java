package com.hellenic.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.mapping.List;

import com.hellenic.beans.User;

public class UserDao implements UserDaoInt {
    private Session session;

    // TODO TYPE SESSION ??????????
    public UserDao( Session sessionH ) {
        this.session = sessionH;
    }

    @Override
    public User authentification( String login, String pwd ) throws DaoException {
        String hql = "FROM com.hellenic.beans.User user WHERE user.login = " + login + "AND user.pwd = " + pwd;

        // execute la requette
        Query query = session.createQuery( hql );
        // met le resultat sous form de list
        List list = (List) query.list();

        // test le resultat
        if ( list.size = 0 ) { // TODO ressoudre pb list
            return (User) list.get( 0 );
        } else {
            return null;
        }
    }
}
