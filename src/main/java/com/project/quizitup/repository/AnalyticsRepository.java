package com.project.quizitup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.quizitup.model.Analytics;

@Repository
public interface AnalyticsRepository extends JpaRepository<Analytics, Integer>{
    
}
