package com.hellenic.DAO;

import org.hibernate.mapping.List;

import com.hellenic.beans.Propriete;

public interface ProprieteDaoInt {
    Propriete get( String ref ) throws DaoException;

    List getAll() throws DaoException;

    // boolean delete(String ref) throws DaoException;

    // boolean create() throws DaoException
}
