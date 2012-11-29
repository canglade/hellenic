package com.hellenic.DAO;

import org.hibernate.mapping.List;

import com.hellenic.beans.Propriete;

public class ReservationDao implements ReservationDaoInt {

    @Override
    public List getAll() throws DaoException {
        // TODO faire requette HQL
        return null;
    }

    @Override
    public boolean create( String nom, String prenom, String email, String telephone, String date, Propriete propriete )
            throws DaoException {
        // TODO faire requette HQL
        return false;
    }

    @Override
    public boolean delete( int id ) throws DaoException {
        // TODO faire requette HQL
        return false;
    }

}
