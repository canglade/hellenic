package com.hellenic.DAO;

import org.hibernate.mapping.List;

import com.hellenic.beans.Propriete;

public class ProprieteDao implements ProprieteDaoInt {

    @Override
    public Propriete get( String ref ) throws DaoException {
        // TODO faire requette HQL
        return null;
    }

    @Override
    public List getAll() throws DaoException {
        // TODO faire requette HQ
        return null;
    }

}
