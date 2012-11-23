package com.hellenic.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Identification implements Filter {
    private static final String VUE_CONNEXION                 = "/connexion.jsp";
    private static final String ATTR_SESSION_AUTHANTIFICATION = "authantification";

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter( ServletRequest rep, ServletResponse res, FilterChain chain ) throws IOException,
            ServletException {

        // cast la requet et la reponse
        HttpServletRequest request = (HttpServletRequest) rep;
        HttpServletResponse response = (HttpServletResponse) res;

        // réqupération de la session depuis la requete
        HttpSession session = request.getSession();

        // test de la présence de l'attribut authantification dans la session
        if ( session.getAttribute( ATTR_SESSION_AUTHANTIFICATION ) == null ) {
            // redirection sur le form de connexion
            response.sendRedirect( request.getContextPath() + VUE_CONNEXION );
        } else {
            // poursui la demande
            chain.doFilter( request, response );
        }
    }

    @Override
    public void init( FilterConfig arg0 ) throws ServletException {
        // TODO Auto-generated method stub

    }

}
