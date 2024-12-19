package com.project.quizitup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quizitup.model.Analytics;
import com.project.quizitup.service.AnalyticsService;

@RestController
@RequestMapping("/analyticsApi")
public class AnalyticsController {
    
    @Autowired
    AnalyticsService analyticsService;

    @GetMapping("/allAnalytics")
    public List<Analytics> getAnalytics() {
        return analyticsService.getAnalytics();
    }

    @PostMapping("/saveAnalytics")
    public Analytics saveAnalytics(@RequestBody Analytics analytics) {
        return analyticsService.saveAnalytics(analytics);
    }

    @PutMapping("/updateAnalytics/{id}")
    public Analytics updateAnalytics(@PathVariable int id, @RequestBody Analytics analytics) {
        return analyticsService.updateAnalytics(id, analytics);
    }

    @DeleteMapping("/deleteAnalytics/{id}")
    public String deleteAnalytics(@PathVariable Integer id) {
        return analyticsService.deleteAnalytics(id);
    }

}
