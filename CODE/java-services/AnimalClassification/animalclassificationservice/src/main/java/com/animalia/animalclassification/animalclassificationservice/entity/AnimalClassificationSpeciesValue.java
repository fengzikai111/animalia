package com.animalia.animalclassification.animalclassificationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalClassificationSpeciesValue {
    /**
     CREATE TABLE Animal_Classification_Species_Value (
     id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
     entity_id INT NOT NULL COMMENT  '信息实体的ID' ，,
     attribute_id INT NOT NULL COMMENT '属性的ID',
     value TEXT COMMENT '属性的值'
     ) COMMENT '动物分类 - 种的属性值';

     */
    private Integer id;
    private Integer entityId;
    private Integer attributeId;
    private String value;

}
