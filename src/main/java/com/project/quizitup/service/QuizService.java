package com.project.quizitup.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.quizitup.model.Quiz;
import com.project.quizitup.repository.QuizRepository;

import jakarta.persistence.PrePersist;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;

    public Quiz saveQuiz(Quiz quiz) {
        quiz.setReferenceId(generateReferenceId());
        return quizRepository.save(quiz);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz updateQuiz(int id, Quiz quiz) {
        Quiz existingQuiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        existingQuiz.setTitle(quiz.getTitle());
        existingQuiz.setDescription(quiz.getDescription());
        existingQuiz.setDuration(quiz.getDuration());
        existingQuiz.setEnableNegativeMarking(quiz.isEnableNegativeMarking());
        existingQuiz.setEnableShuffle(quiz.isEnableShuffle());
        existingQuiz.setCreator(quiz.getCreator());
        existingQuiz.setQuestions(quiz.getQuestions());
        return quizRepository.save(existingQuiz);
    }

    public String deleteQuiz(int id){
        Quiz quiz = quizRepository.findById(id).orElse(null);
        if (quiz!=null){
            quizRepository.delete(quiz);
            return "Quiz deleted successfully";
        }
        return "No quiz found";
    }

    @PrePersist
    private String generateReferenceId() {
        String uuid;
        do {
            uuid = UUID.randomUUID().toString();
        } while (quizRepository.existsByReferenceId(uuid));
        return uuid;
    }

    public Quiz getQuizById(int id) {
        return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
    }

}
