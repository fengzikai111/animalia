package com.animalia.animalclassification.animalclassificationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalClassificationSpecies {
    private Integer id;
    private String name;
    private String description;
    private Integer order_id;
    private String level;
    private String path;
}
