package com.hellenic.metier;

import java.util.ArrayList;

import com.hellenic.DAO.ReservationDao;
import com.hellenic.beans.ReservationBean;

public class ReservationsBO {
    private static final String MESSAGE_SUCCESS = "opération de suppression réussie";
    private static final String MESSAGE_FAIL    = "opération de suppression échouée";

    private ReservationDao      reservationDao;

    public ReservationsBO( ReservationDao reservationDao ) {
        this.reservationDao = reservationDao;
        System.out.println( "Message : Instanciation d'un objet reservationDao (METIER)" );
    }

    public ArrayList<ReservationBean> affichageResa() {

        ArrayList<ReservationBean> reservations = new ArrayList<ReservationBean>();

        // affichage en DAO
        reservations = reservationDao.getAll();

        return reservations;
    }

    public String deleteResa( String id ) {
        boolean deleted = false;
        String success = "";

        // suppression en DAO
        deleted = reservationDao.delete( id );
        if ( deleted ) {
            success = MESSAGE_SUCCESS;
        }
        else {
            success = MESSAGE_FAIL;
        }
        return success;
    }
}
