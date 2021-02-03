package com.work.notebook.service.Implementation;

import com.work.notebook.model.Work;
import com.work.notebook.repository.WorkRepository;
import com.work.notebook.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkServiceImplementation implements WorkService {

    @Autowired
    WorkRepository workLRepository;

    @Override
    public List<Work> getAllJobs() {
        return workLRepository.findAll();
    }

    @Override
    public Optional<Work> getAllJobsById(String IdWork) {
        return workLRepository.findById(IdWork);
    }

    @Override
    public String saveWork(Work workL) {
         workLRepository.save(workL);
         return "completed";


    }
}
