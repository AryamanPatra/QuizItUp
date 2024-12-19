package com.project.quizitup.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="quiz")
@Entity
@Data
public class Quiz {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable=false,unique=true)
    private String title;
    @Column
    private String description;
    @Column(nullable=false)
    private int duration; // in minutes

    @Column(nullable=false)
    private boolean enableNegativeMarking;
    @Column(nullable=false)
    private boolean enableShuffle;
    
    @OneToOne
    @JoinColumn(name="creator_id")
    private User creator; // Reference to User who creator

    @ManyToMany
    @JoinTable(
        name = "quiz_question",
        joinColumns = @JoinColumn(name="quiz_id"),
        inverseJoinColumns = @JoinColumn(name="question_id")
    )
    private List<Question> questions; // List of questions in the quiz


    @Column(name="reference_id",nullable=false,unique=true)
    private String referenceId;

    @OneToOne
    @JoinColumn(name="analytics_id")
    private Analytics analytics; // Reference to Analytics of the quiz

}
