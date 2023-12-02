package com.animalia.animalclassification.animalclassificationservice.entity;

import lombok.Data;

import java.util.List;

@Data
public class AnimalClassificationSpeciesAttributeVO {
    private String type;
    private String attributeName;
    private List<String> values;
}
