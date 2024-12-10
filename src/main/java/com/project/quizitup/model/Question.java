package com.project.quizitup.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="question")
@Data
public class Question {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="question_title",nullable=false,unique=true)
    private String questionTitle; // The question text
    @Column(name="choice_a",nullable=false)
    private String choiceA;
    @Column(name="choice_b",nullable=false)
    private String choiceB;
    @Column(name="choice_c",nullable=false)
    private String choiceC;
    @Column(name="choice_d",nullable=false)
    private String choiceD;
    @Column(name="correct_answer",nullable=false)
    private String correctAnswer;


}
