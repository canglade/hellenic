package com.hellenic.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;

import com.hellenic.DAO.ReservationDao;
import com.hellenic.beans.ReservationBean;
import com.hellenic.metier.ReservationsBO;

public class Reservation extends HttpServlet {
    private static final String ATTR_DAO_FACTORY = "sessionF";
    private static final String VUE              = "/WEB-INF/admin/reservationsBO.jsp";

    private ReservationsBO      reservationsBOM;

    public void init() throws ServletException {
        // Récupération de l'objet SessionFactory
        SessionFactory sf = (SessionFactory) getServletContext().getAttribute( "sessionF" );

        // intanciation d'un objet DAO
        ReservationDao reservationDao = new ReservationDao( sf );

        // intanciation de la classe metier
        reservationsBOM = new ReservationsBO( reservationDao );

        System.out.println( "Message : Initialisation servlet Reservation" );
    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        // appel du form
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        // TODO faire l'enregistrement de la reservation après vérification des
        // saisies

        ArrayList<ReservationBean> result = reservationsBOM.affichageResa();
        System.out.println( "Message : reservation = " + result );
        // redirection suivant le resultat
        if ( result != null ) {
            this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        }

    }
}
