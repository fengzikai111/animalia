package com.animalia.animalclassification.animalclassificationservice.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AnimalClassificationSpeciesEntityVO {
    private String entityType;
    private List<AnimalClassificationSpeciesAttributeVO> attributes;
}
