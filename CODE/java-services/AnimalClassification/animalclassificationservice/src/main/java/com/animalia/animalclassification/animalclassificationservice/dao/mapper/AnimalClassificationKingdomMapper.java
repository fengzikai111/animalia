package com.animalia.animalclassification.animalclassificationservice.dao.mapper;


import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationKingdom;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnimalClassificationKingdomMapper extends BaseMapper<AnimalClassificationKingdom> {
    List<AnimalClassificationKingdom> selectAll();
    AnimalClassificationKingdom selectById(Integer id);
    AnimalClassificationKingdom selectByName(String name);
    int insert(AnimalClassificationKingdom animalClassificationKingdom);
    Integer update(AnimalClassificationKingdom animalClassificationKingdom);
    Integer delete(AnimalClassificationKingdom animalClassificationKingdom);
}