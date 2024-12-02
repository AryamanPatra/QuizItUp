package com.project.quizitup.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="quiz_tbl")
public class Quiz {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="quiz_name",nullable=false,unique=true)
    private String quizName;
    @Column(name="creator_name",nullable=false,unique=false)
    private String creatorName;
    @Column(name="question_set",nullable=false)
    private List<Integer> questionSet;
    @Column(name="solution_set",nullable=false)
    private List<Integer> solutionSet;

    @Column(name="ref_id",nullable=false,unique=true)
    @GeneratedValue(strategy=GenerationType.UUID)
    private int refId;

    
    public Quiz() {
    }

    public Quiz(String quizName, String creatorName, List<Integer> questionSet, List<Integer> solutionSet) {
        this.quizName = quizName;
        this.creatorName = creatorName;
        this.questionSet = questionSet;
        this.solutionSet = solutionSet;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public List<Integer> getQuestionSet() {
        return questionSet;
    }

    public void setQuestionSet(List<Integer> questionSet) {
        this.questionSet = questionSet;
    }

    public List<Integer> getSolutionSet() {
        return solutionSet;
    }

    public void setSolutionSet(List<Integer> solutionSet) {
        this.solutionSet = solutionSet;
    }

    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }



}
