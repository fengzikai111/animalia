 package com.animalia.animalclassification.animalclassificationservice.dao.mapper;

 import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpecies;

 import java.util.List;

 import org.apache.ibatis.annotations.Mapper;

 @Mapper

 public interface AnimalClassificationSpeciesMapper {

     AnimalClassificationSpecies selectById(Integer id);

     int insert(AnimalClassificationSpecies animalClassificationSpecies);

     Integer update(AnimalClassificationSpecies animalClassificationSpecies);

     Integer delete(AnimalClassificationSpecies animalClassificationSpecies);

     List<AnimalClassificationSpecies> selectAll();

     AnimalClassificationSpecies selectByName(String name);

     AnimalClassificationSpecies selectByPhylumId(Integer phylumId);

     AnimalClassificationSpecies selectByClassId(Integer classId);


     AnimalClassificationSpecies selectByOrderId(Integer orderId);

     AnimalClassificationSpecies selectByFamilyId(Integer familyId);

     AnimalClassificationSpecies selectByGenusId(Integer genusId);

 }