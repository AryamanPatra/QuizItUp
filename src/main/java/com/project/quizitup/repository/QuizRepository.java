package com.project.quizitup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.quizitup.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer>{
    
    public boolean existsByReferenceId(String uuid);
    
}
