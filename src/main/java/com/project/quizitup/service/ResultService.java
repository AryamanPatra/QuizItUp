package com.project.quizitup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.quizitup.model.Result;
import com.project.quizitup.repository.ResultRepository;

@Service
public class ResultService {
    
    @Autowired
    ResultRepository resultRepository;

    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }

    public List<Result> getResults() {
        return resultRepository.findAll();
    }

    public Result updateResult(int id, Result result) {
        Result existingResult = resultRepository.findById(id).orElseThrow(() -> new RuntimeException("Result not found"));
        existingResult.setQuiz(result.getQuiz());
        existingResult.setAttendeeUsername(result.getAttendeeUsername());
        existingResult.setScore(result.getScore());
        existingResult.setTotalScore(result.getTotalScore());
        existingResult.setTimeTaken(result.getTimeTaken());
        existingResult.setChoiceList(result.getChoiceList());
        existingResult.setPercentage(result.getPercentage());
        existingResult.setPercentile(result.getPercentile());
        return resultRepository.save(existingResult);
        
    }

    public String deleteResult(int id) {
        Result result = resultRepository.findById(id).orElse(null);
        if(result != null) {
            resultRepository.deleteById(id);
            return "Result deleted successfully";
        }
        return "Result not found";
    }

}
