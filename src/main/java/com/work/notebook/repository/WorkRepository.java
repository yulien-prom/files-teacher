package com.work.notebook.repository;

import com.work.notebook.model.Work;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRepository extends MongoRepository<Work,String> {


}
