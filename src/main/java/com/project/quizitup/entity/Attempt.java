package com.project.quizitup.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Attempt {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="quiz_id", nullable=false)
    private int quizId;

    @Column(name="attendee_name",nullable=false)
    private String attendeeName;

    @Column(name="answer_set",nullable=false)
    private List<Integer> answerSet;

    
    // Constructors
    public Attempt() {
    }
    

    public Attempt(int quizId, String attendeeName, List<Integer> answerSet) {
        this.quizId = quizId;
        this.attendeeName = attendeeName;
        this.answerSet = answerSet;
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getAttendeeName() {
        return attendeeName;
    }

    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }

    public List<Integer> getAnswerSet() {
        return answerSet;
    }

    public void setAnswerSet(List<Integer> answerSet) {
        this.answerSet = answerSet;
    }

    

}
