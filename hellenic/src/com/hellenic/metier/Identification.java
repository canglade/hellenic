package com.hellenic.metier;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.hellenic.DAO.UserDao;
import com.hellenic.beans.User;

public class Identification {
    private static final String ATTR_SESSION_AUTHANTIFICATION = "authantification";
    private static final String CHAMP_LOGIN                   = "login";
    private static final String CHAMP_PWD                     = "pwd";

    private UserDao             userDao;

    public Identification( UserDao userDao ) {
        this.userDao = userDao;
    }

    public boolean Identification( HttpServletRequest request ) {
        boolean isIdentifier = false;

        // recupération des GET
        String login = request.getParameter( CHAMP_LOGIN );
        String pwd = request.getParameter( CHAMP_PWD );

        // creation obj session
        HttpSession session = request.getSession();

        User user = new User();
        user = userDao.authentification( login, pwd );

        // sauvegarde en session si l'user existe
        if ( user != null ) {
            // insertion de l'user en session
            session.setAttribute( ATTR_SESSION_AUTHANTIFICATION, user );
            isIdentifier = true;
        } else {
            session.setAttribute( ATTR_SESSION_AUTHANTIFICATION, null );
        }

        return isIdentifier;
    }
}
