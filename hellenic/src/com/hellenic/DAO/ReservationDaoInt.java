package com.hellenic.DAO;

import java.util.ArrayList;

import com.hellenic.beans.ProprieteBean;
import com.hellenic.beans.ReservationBean;

public interface ReservationDaoInt {
    ArrayList<ReservationBean> getAll() throws DaoException;

    boolean create( String nom, String prenom, String email, String telephone, String date, ProprieteBean propriete )
            throws DaoException;

    boolean delete( String id ) throws DaoException;

}
