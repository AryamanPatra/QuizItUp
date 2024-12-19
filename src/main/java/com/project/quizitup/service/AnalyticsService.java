package com.project.quizitup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.quizitup.model.Analytics;
import com.project.quizitup.repository.AnalyticsRepository;

@Service
public class AnalyticsService {
    
    @Autowired
    AnalyticsRepository analyticsRepository;

    public List<Analytics> getAnalytics() {
        return analyticsRepository.findAll();
    }

    public Analytics saveAnalytics(Analytics analytics) {
        return analyticsRepository.save(analytics);
    }

    public Analytics updateAnalytics(int id, Analytics analytics) {
        Analytics existingAnalytics = analyticsRepository.findById(id).orElseThrow(() -> new RuntimeException("Analytics not found"));
        existingAnalytics.setQuiz(analytics.getQuiz());
        existingAnalytics.setResults(analytics.getResults());
        return analyticsRepository.save(existingAnalytics);
    }

    public String deleteAnalytics(int id) {
        Analytics analytics = analyticsRepository.findById(id).orElse(null);
        if(analytics != null) {
            analyticsRepository.deleteById(id);
            return "Analytics deleted successfully";
        }
        return "Analytics not found";
    }

}
