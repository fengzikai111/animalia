package com.animalia.animalclassification.animalclassificationservice.dao.mapper;

import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpeciesEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnimalClassificationSpeciesEntityMapper  extends BaseMapper<AnimalClassificationSpeciesEntity> {
    AnimalClassificationSpeciesEntity selectById(Integer id);
    List<AnimalClassificationSpeciesEntity>  selectBySpeciesId(Integer speciesId);
    int insert(AnimalClassificationSpeciesEntity animalClassificationSpeciesEntity);
    Integer update(AnimalClassificationSpeciesEntity animalClassificationSpeciesEntity);
    Integer delete(AnimalClassificationSpeciesEntity animalClassificationSpeciesEntity);
    //selectAll
    List<AnimalClassificationSpeciesEntity> selectAll();
}
