package com.project.quizitup.entity;

import java.util.List;

import com.project.quizitup.entity.converter.StringListConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="question_tbl")
public class Question {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false)
    private String question;

    @Convert(converter=StringListConverter.class)
    @Column(name="choice_set",nullable=false)
    private List<String> choiceSet;


    // Constructors
    public Question() {
    }
    
    public Question(String question, List<String> choiceSet) {
        this.question = question;
        this.choiceSet = choiceSet;
    }


    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public List<String> getChoiceSet() {
        return choiceSet;
    }
    public void setChoiceSet(List<String> choiceSet) {
        this.choiceSet = choiceSet;
    }

    
}
