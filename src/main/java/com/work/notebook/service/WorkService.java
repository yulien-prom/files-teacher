package com.work.notebook.service;

import com.work.notebook.model.Work;

import java.util.List;
import java.util.Optional;

public interface WorkService {
    List<Work> getAllJobs();
    Optional<Work> getAllJobsById(String IdWork);
    String saveWork (Work workL);

}
