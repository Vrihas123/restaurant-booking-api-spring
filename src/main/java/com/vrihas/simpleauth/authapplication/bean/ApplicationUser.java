package com.vrihas.simpleauth.authapplication.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application_user")
public class ApplicationUser {

    @Id
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


}
