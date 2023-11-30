package com.animalia.animalclassification.animalclassificationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalClassificationSpeciesAttribute {
    /**
     CREATE TABLE Animal_Classification_Species_Attribute (
     id INT PRIMARY KEY AUTO_INCREMENT,
     entity_id INT NOT NULL COMMENT  '信息实体的ID' ，
     attribute_name VARCHAR(255) NOT NULL COMMENT '属性名称',
     data_type VARCHAR(50) NOT NULL COMMENT '属性的数据类型'
     ) COMMENT '动物分类 - 种的属性';
     */

    private Integer id;
    private Integer entityId;
    private String attributeName;
    private String dataType;

}
