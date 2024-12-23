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

import com.project.quizitup.model.Question;
import com.project.quizitup.service.QuestionService;

@RestController
@RequestMapping("/questionApi")
public class QuestionController {
    
    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/getQuestion/{id}")
    public Question getQuestionById(@PathVariable int id) {
        return questionService.getQuestionById(id);
    }

    @PostMapping("/saveQuestion")
    public Question saveQuestion(@RequestBody Question question) {
        return questionService.saveQuestion(question);
    }

    @PutMapping("/updateQuestion/{id}")
    public Question updateQuestion(@PathVariable int id, @RequestBody Question question){
        return questionService.updateQuestion(id, question);
    }

    @DeleteMapping("/deleteQuestion/{id}")
    public String deleteQuestion(@PathVariable Integer id) {
        questionService.deleteQuestion(id);
        return "Successfully deleted!";
    }
}
