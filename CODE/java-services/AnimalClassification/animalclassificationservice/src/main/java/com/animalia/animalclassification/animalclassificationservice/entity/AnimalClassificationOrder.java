package com.animalia.animalclassification.animalclassificationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalClassificationOrder  {
    private Integer id;
    private String name;
    private String description;
    private Integer classId;
    private String level;
    private String path;
}

