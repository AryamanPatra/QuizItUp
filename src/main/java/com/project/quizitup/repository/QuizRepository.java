package com.project.quizitup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizitup.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>{
    
}
