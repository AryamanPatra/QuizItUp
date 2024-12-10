package com.project.quizitup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.quizitup.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{
    
}
