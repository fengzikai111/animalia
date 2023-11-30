package com.animalia.animalclassification.animalclassificationservice.entity;


import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AnimalClassificationSpeciesVO {
    //entity也是列表，因为一个物种可能有多个entity
    private List<AnimalClassificationSpeciesEntityVO> entities;
}