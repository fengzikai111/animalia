package com.animalia.animalclassification.animalclassificationservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalClassificationKingdom {
    private Integer id;
    private String name;
    private String description;
    private Integer level;
    private String path;
}