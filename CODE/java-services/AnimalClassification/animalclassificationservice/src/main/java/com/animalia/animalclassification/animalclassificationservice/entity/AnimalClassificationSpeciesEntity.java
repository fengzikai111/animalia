package com.animalia.animalclassification.animalclassificationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalClassificationSpeciesEntity {
    /**
     * CREATE TABLE Animal_Classification_Species_Entity (
     *     Species_id INT   COMMENT '种的ID',
     *     id INT PRIMARY KEY AUTO_INCREMENT COMMENT '信息实体的ID',
     *     entity_type VARCHAR(255) NOT NULL   COMMENT '信息实体的类型，比如动物的基本信息'
     * ) COMMENT '动物分类 - 种的信息实体';
     */
    private Integer speciesId;
    private Integer id;
    private String entityType;

}
