package com.work.notebook.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Work {
    @Id
    private String idWork;
            private String nameWork;
                    private int WorkingYears;}
