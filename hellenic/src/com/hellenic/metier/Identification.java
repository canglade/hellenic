package com.hellenic.metier;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.hellenic.beans.User;

public class Identification {
    private static final String ATTR_SESSION_AUTHANTIFICATION = "authantification";
    private static final String CHAMP_LOGIN                   = "login";
    private static final String CHAM_PWD                      = "pwd";

    public boolean Identification( HttpServletRequest request ) {
        boolean isIdentifier = false;
        String login = request.getParameter( CHAMP_LOGIN );
        String pwd = request.getParameter( CHAM_PWD );

        HttpSession session = request.getSession();
        User unUser = new User();

        // TODO faire HQL pour la vérification en BDD du login pwd

        // met l'user en session si identifier
        if ( isIdentifier ) {
            session.setAttribute( ATTR_SESSION_AUTHANTIFICATION, unUser );
        } else {
            session.setAttribute( ATTR_SESSION_AUTHANTIFICATION, null );
        }

        return isIdentifier;
    }
}
