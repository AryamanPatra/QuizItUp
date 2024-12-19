package com.project.quizitup.model;

import java.util.List;

import com.project.quizitup.utils.StringListConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Entity(name="result")
@Data
public class Result {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="attendee_username",nullable=false)
    private String attendeeUsername;

    @Column(name="score")
    private float score;

    @Column(name="total_score")
    private float totalScore;

    @Column(name="time_taken")
    private int timeTaken;

    @ManyToOne 
    @JoinColumn(name="quiz_id")
    private Quiz quiz;

    @Convert(converter = StringListConverter.class)
    @Column(name="choice_list")
    private List<String> choiceList;

    private float percentage;

    private float percentile;

}
