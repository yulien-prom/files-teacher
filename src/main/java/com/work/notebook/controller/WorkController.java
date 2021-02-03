package com.work.notebook.controller;

import com.work.notebook.model.Work;
import com.work.notebook.service.Implementation.WorkServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Work")
public class WorkController {

    @Autowired
    WorkServiceImplementation workServiceImplementation;

    @GetMapping
   public List<Work> getAllWork(){
        return workServiceImplementation.getAllJobs();
    }
    @GetMapping("/{Idwork}")
    public Optional<Work>getWorkById(@PathVariable String idWork) {
        return workServiceImplementation.getAllJobsById(idWork);

    }
@PostMapping
    public String saveWork(@RequestBody Work workL) {
        return workServiceImplementation.saveWork(workL);

}

    }
