package com.project.quizitup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.quizitup.model.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer>{
    
}
