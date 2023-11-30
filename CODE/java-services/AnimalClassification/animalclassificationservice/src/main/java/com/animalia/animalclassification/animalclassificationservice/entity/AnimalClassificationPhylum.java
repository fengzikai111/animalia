package com.animalia.animalclassification.animalclassificationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalClassificationPhylum {

    private Integer id;
    private String name;
    private String description;
    private Integer kingdomId;
    private String level;
    private String path;

}
