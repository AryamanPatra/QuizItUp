package com.project.quizitup.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="users")
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable=false)
    private int id;

    @Column(unique=true,nullable=false,length=45)
    private String username;
    @Column(nullable=false,length=45)
    private String password;
    @Column(name="profile_name",nullable=false,length=45)
    private String profileName;
    @Column(nullable=false,length=45)
    private String email;

}
