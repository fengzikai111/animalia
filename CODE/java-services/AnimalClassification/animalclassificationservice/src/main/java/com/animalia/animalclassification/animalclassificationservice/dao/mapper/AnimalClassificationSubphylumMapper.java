package com.animalia.animalclassification.animalclassificationservice.dao.mapper;

import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSubphylum;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnimalClassificationSubphylumMapper extends BaseMapper<AnimalClassificationSubphylum> {
    AnimalClassificationSubphylum selectById(Integer id);
    AnimalClassificationSubphylum selectByName(String name);
    int insert(AnimalClassificationSubphylum animalClassificationSubphylum);
    Integer update(AnimalClassificationSubphylum animalClassificationSubphylum);
    Integer delete(AnimalClassificationSubphylum animalClassificationSubphylum);
    List<AnimalClassificationSubphylum> selectAll();
}
