 package com.animalia.animalclassification.animalclassificationservice.dao.mapper;

 import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationGenus;

 import java.util.List;

 import org.apache.ibatis.annotations.Mapper;

 @Mapper

 public interface AnimalClassificationGenusMapper {
     
     

     AnimalClassificationGenus selectById(Integer id);

     int insert(AnimalClassificationGenus animalClassificationGenus);

     Integer update(AnimalClassificationGenus animalClassificationGenus);

     Integer delete(AnimalClassificationGenus animalClassificationGenus);

     List<AnimalClassificationGenus> selectAll();

     AnimalClassificationGenus selectByName(String name);

     AnimalClassificationGenus selectByPhylumId(Integer phylumId);

     AnimalClassificationGenus selectByClassId(Integer classId);

     AnimalClassificationGenus selectByOrderId(Integer orderId);

     AnimalClassificationGenus selectByFamilyId(Integer familyId);

     void deleteById(Integer id);
 }