package com.hellenic.DAO;

import org.hibernate.mapping.List;

import com.hellenic.beans.Propriete;

public interface ReservationDaoInt {
    List getAll() throws DaoException;

    boolean create( String nom, String prenom, String email, String telephone, String date, Propriete propriete )
            throws DaoException;

    boolean delete( int id ) throws DaoException;

}
