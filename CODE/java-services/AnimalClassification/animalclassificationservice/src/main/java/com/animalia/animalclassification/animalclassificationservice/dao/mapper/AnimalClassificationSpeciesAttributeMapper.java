package com.animalia.animalclassification.animalclassificationservice.dao.mapper;

import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpeciesAttribute;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpeciesEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnimalClassificationSpeciesAttributeMapper extends BaseMapper<AnimalClassificationSpeciesAttribute> {

//    AnimalClassificationSpeciesEntity selectById(Integer id);
//    AnimalClassificationSpeciesEntity selectBySpeciesId(Integer speciesId);
//    int insert(AnimalClassificationSpeciesEntity animalClassificationSpeciesEntity);
//    Integer update(AnimalClassificationSpeciesEntity animalClassificationSpeciesEntity);
//    Integer delete(AnimalClassificationSpeciesEntity animalClassificationSpeciesEntity);
//    //selectAll
//    List<AnimalClassificationSpeciesEntity> selectAll();

    AnimalClassificationSpeciesAttribute selectById(Integer id);
    List<AnimalClassificationSpeciesAttribute>  selectByEntityId(Integer speciesId);
    int insert(AnimalClassificationSpeciesAttribute animalClassificationSpeciesAttribute);
    Integer update(AnimalClassificationSpeciesAttribute animalClassificationSpeciesAttribute);
    Integer delete(AnimalClassificationSpeciesAttribute animalClassificationSpeciesAttribute);
    //selectAll
    List<AnimalClassificationSpeciesAttribute> selectAll();

}