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

import com.project.quizitup.model.Result;
import com.project.quizitup.service.ResultService;

@RestController
@RequestMapping("/resultApi")
public class ResultController {
    
    @Autowired
    ResultService resultService;
    
    @GetMapping("/allResults")
    public List<Result> getResults() {
        return resultService.getResults();
    }

    @PostMapping("/saveResult")
    public Result saveResult(@RequestBody Result result) {
        return resultService.saveResult(result);
    }

    @PutMapping("/updateResult/{id}")
    public Result updateResult(@PathVariable int id, @RequestBody Result result) {
        return resultService.updateResult(id, result);
    }

    @DeleteMapping("/deleteResult/{id}")
    public String deleteResult(@PathVariable int id) {
        return resultService.deleteResult(id);
    }

}
