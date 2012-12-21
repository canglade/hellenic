package com.hellenic.DAO;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.mapping.List;

import com.hellenic.beans.ProprieteBean;

public class ProprieteDao implements ProprieteDaoInt {

    private SessionFactory sessionF;

    public ProprieteDao( SessionFactory sessionF ) {
        this.sessionF = sessionF;
        System.out.println( "Message : Instanciation d'un objet ProprieteDao" );
    }

    @Override
    public ProprieteBean get( String ref ) throws DaoException {
        // TODO faire requette HQL
        return null;
    }

    @Override
    public List getAll() throws DaoException {
        // TODO faire requette HQ
        return null;
    }

    @Override
    public ArrayList<ProprieteBean> linstingPropriete( int nb ) throws DaoException {
        String hql = "FROM metier.Propriete";
        ArrayList<ProprieteBean> result = null;

        try {
            // ouverture session hibernate
            Session sess = sessionF.openSession();

            // execution de la requete
            Query query = sess.createQuery( hql );

            // selection de nb propriete
            query.setMaxResults( nb );

            // stockage dans un arrayList
            result = (ArrayList<ProprieteBean>) query.list();

            // libération des resources
            sess.close();
        } catch ( DaoException ex ) {
            System.out.println( "Erreur : execution authentification dans ProprieteDao" );
        }
        return result;

    }

}
