package com.hellenic.DAO;

import java.util.ArrayList;

import org.hibernate.mapping.List;

import com.hellenic.beans.ProprieteBean;

public interface ProprieteDaoInt {
    ProprieteBean get( String ref ) throws DaoException;

    List getAll() throws DaoException;

    ArrayList<ProprieteBean> linstingPropriete( int nb ) throws DaoException;

    // boolean delete(String ref) throws DaoException;

    // boolean create() throws DaoException
}
