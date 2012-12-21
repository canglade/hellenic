package com.hellenic.DAO;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hellenic.beans.ProprieteBean;
import com.hellenic.beans.ReservationBean;

public class ReservationDao implements ReservationDaoInt {
    private SessionFactory sessionF;

    public ReservationDao( SessionFactory sessionF ) {
        this.sessionF = sessionF;
        System.out.println( "Message : Instanciation d'un objet ReservationDao" );
    }

    @Override
    public ArrayList<ReservationBean> getAll() throws DaoException {
        String hql = "FROM com.hellenic.beans.ReservationBean reservation";
        ArrayList<ReservationBean> list = null;
        System.out.println( "HQL : " + hql );

        try {
            // ouverture d'une session hibernate
            Session ses = sessionF.openSession();

            // ouverture de la transaction
            Transaction tx = ses.beginTransaction();

            // execute la requete
            Query query = ses.createQuery( hql );

            // met le resultat sous form de list
            list = (ArrayList<ReservationBean>) query.list();

            // fermeture transaction
            tx.commit();

            // libération des resources ????
            ses.close();
        } catch ( DaoException ex ) {
            System.out.println( "Erreur : execution dans ReservationDao" );
        }
        return list;
    }

    @Override
    public boolean create( String nom, String prenom, String email, String telephone, String date,
            ProprieteBean propriete )
            throws DaoException {
        // TODO faire requette HQL
        return false;
    }

    @Override
    public boolean delete( String id ) throws DaoException {
        // TODO faire requette HQL

        boolean success = false;

        String hql = "delete FROM com.hellenic.beans.ReservationBean " +
                "reservation WHERE reservation.id='" + id + "'";

        System.out.println( "HQL : " + hql );

        try {
            // ouverture d'une session hibernate
            Session ses = sessionF.openSession();

            // ouverture de la transaction
            Transaction tx = ses.beginTransaction();

            // execute la requete
            Query query = ses.createQuery( hql );
            int result = query.executeUpdate();
            tx.commit();
            ses.close();

            if ( result == 1 ) {
                success = true;
            }
            else {
                success = false;
            }
        } catch ( DaoException ex ) {
            System.out.println( "Erreur : execution suppression dans UserDao" );
        }

        return success;
    }

}
