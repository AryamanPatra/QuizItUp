package com.project.quizitup.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Entity(name="analytics")
@Data
public class Analytics {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name="quiz_id")
    private Quiz quiz;

    @OneToMany
    @JoinColumn(name="analytics_id")
    private List<Result> results;


}
