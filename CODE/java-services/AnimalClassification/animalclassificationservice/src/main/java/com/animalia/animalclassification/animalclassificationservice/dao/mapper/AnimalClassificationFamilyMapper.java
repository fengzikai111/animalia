 package com.animalia.animalclassification.animalclassificationservice.dao.mapper;

 import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationFamily;

 import java.util.List;

 import org.apache.ibatis.annotations.Mapper;

 @Mapper

 public interface AnimalClassificationFamilyMapper {

     AnimalClassificationFamily selectById(Integer id);

     int insert(AnimalClassificationFamily animalClassificationFamily);



     Integer update(AnimalClassificationFamily animalClassificationFamily);

     Integer delete(AnimalClassificationFamily animalClassificationFamily);

     List<AnimalClassificationFamily> selectAll();

     AnimalClassificationFamily selectByName(String name);

     AnimalClassificationFamily selectByPhylumId(Integer phylumId);

     AnimalClassificationFamily selectByClassId(Integer classId);

     AnimalClassificationFamily selectByOrderId(Integer orderId);

 }