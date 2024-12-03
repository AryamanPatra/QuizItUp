package com.project.quizitup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizitup.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
    
}
