 package com.animalia.animalclassification.animalclassificationservice.dao.mapper;

 import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationOrder;
 import org.apache.ibatis.annotations.Mapper;

 import java.util.List;

 @Mapper
 public interface AnimalClassificationOrderMapper {
     AnimalClassificationOrder selectById(Integer id);

     int insert(AnimalClassificationOrder animalClassificationOrder);

     Integer update(AnimalClassificationOrder animalClassificationOrder);

     Integer delete(AnimalClassificationOrder animalClassificationOrder);

     List<AnimalClassificationOrder> selectAll();

     AnimalClassificationOrder selectByName(String name);

     AnimalClassificationOrder selectByPhylumId(Integer phylumId);

     AnimalClassificationOrder selectByClassId(Integer classId);


 }
