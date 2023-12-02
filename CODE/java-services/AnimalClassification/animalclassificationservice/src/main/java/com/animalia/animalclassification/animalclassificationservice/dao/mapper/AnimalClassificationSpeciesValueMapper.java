package com.animalia.animalclassification.animalclassificationservice.dao.mapper;

import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpeciesEntity;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpeciesValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnimalClassificationSpeciesValueMapper extends BaseMapper<AnimalClassificationSpeciesValue> {

    //    AnimalClassificationSpeciesEntity selectById(Integer id);
//    AnimalClassificationSpeciesEntity selectBySpeciesId(Integer speciesId);
//    int insert(AnimalClassificationSpeciesEntity animalClassificationSpeciesEntity);
//    Integer update(AnimalClassificationSpeciesEntity animalClassificationSpeciesEntity);
//    Integer delete(AnimalClassificationSpeciesEntity animalClassificationSpeciesEntity);
//    //selectAll
//    List<AnimalClassificationSpeciesEntity> selectAll();

    AnimalClassificationSpeciesValue selectById(Integer id);
    List<AnimalClassificationSpeciesValue> getAnimalClassificationSpeciesValueByAttributeId(Integer speciesId);
    int insert(AnimalClassificationSpeciesValue animalClassificationSpeciesValue);
    Integer update(AnimalClassificationSpeciesValue animalClassificationSpeciesValue);
    Integer delete(AnimalClassificationSpeciesValue animalClassificationSpeciesValue);
    //selectAll
    List<AnimalClassificationSpeciesValue> selectAll();
}
