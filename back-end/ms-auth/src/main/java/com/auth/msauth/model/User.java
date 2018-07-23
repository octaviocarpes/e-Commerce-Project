package com.auth.msauth.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter @Setter
@Table(name= "users", schema = "ecommerce")
public class User {

    @Id
    @Column(name = "id", columnDefinition = "VARCHAR")
    private String id;

    @Column(name = "name", columnDefinition = "VARCHAR")
    private String name;

    @Column(name = "email", columnDefinition = "VARCHAR")
    private String email;

    @Column(name = "password", columnDefinition = "VARCHAR")
    private String password;

    public User() {
        this.id = UUID.randomUUID().toString();
    }
}
