package com.project.quizitup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.quizitup.model.Question;
import com.project.quizitup.repository.QuestionRepository;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question getQuestionById(int id) {
        return questionRepository.findById(id).orElse(null);
    }

    public Question updateQuestion(int id, Question question) {
        Question existingQuestion = questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
        existingQuestion.setQuestionTitle(question.getQuestionTitle());
        existingQuestion.setChoiceA(question.getChoiceA());
        existingQuestion.setChoiceB(question.getChoiceB());
        existingQuestion.setChoiceC(question.getChoiceC());
        existingQuestion.setChoiceD(question.getChoiceD());
        existingQuestion.setCorrectAnswer(question.getCorrectAnswer());
        return questionRepository.save(existingQuestion);
    }

    public void deleteQuestion(int id) {
        Question question = questionRepository.findById(id).orElse(null);
        if (question != null) {
            questionRepository.delete(question);
        }

    }
}
