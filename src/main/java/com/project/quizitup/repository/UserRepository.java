package com.project.quizitup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.quizitup.model.User;

@Repository
public interface  UserRepository extends JpaRepository<User, Integer>{
    
}
