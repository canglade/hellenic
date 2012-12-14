package com.hellenic.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "utilisateur" )
public class User {

    @Id
    @Column( name = "loginuser" )
    private String login;

    @Column( name = "mdpuser" )
    private String pwd;

    @Column( name = "roleuser" )
    private String role;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin( String login ) {
        this.login = login;
    }

    public String getRole() {
        return role;
    }

    public void setRole( String role ) {
        this.role = role;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd( String pwd ) {
        this.pwd = pwd;
    }
}
