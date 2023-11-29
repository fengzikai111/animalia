package com.animalia.animalclassification.animalclassificationservice.dao.mapper;

import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationClass;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnimalClassificationClassMapper    extends BaseMapper<AnimalClassificationClass> {
    AnimalClassificationClass selectById(Integer id);
    AnimalClassificationClass selectByName(String name);
    int insert(AnimalClassificationClass animalClassificationClass);
    Integer update(AnimalClassificationClass animalClassificationClass);
    Integer delete(AnimalClassificationClass animalClassificationClass);
    List<AnimalClassificationClass> selectAll();
}