package com.hellenic.DAO;

import com.hellenic.beans.User;

public interface UserDaoInt {
    User authentification( String login, String pwd ) throws DaoException;

}
