package com.animalia.animalclassification.animalclassificationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalClassificationClass {
    private Integer id;
    private String name;
    private String description;
    private Integer subphylum_id;
    private Integer level;
    private String path;
}