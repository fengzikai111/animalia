package com.animalia.animalclassification.animalclassificationservice.dao.mapper;

import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationPhylum;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnimalClassificationPhylumMapper  extends BaseMapper<AnimalClassificationPhylum> {
    AnimalClassificationPhylum selectById(Integer id);
    AnimalClassificationPhylum selectByName(String name);
    int insert(AnimalClassificationPhylum animalClassificationPhylum);
    Integer update(AnimalClassificationPhylum animalClassificationPhylum);
    Integer delete(AnimalClassificationPhylum animalClassificationPhylum);
    List<AnimalClassificationPhylum> selectAll();
}

//  参考上面 实现entity  AnimalClassificationClass 的 AnimalClassificationClassMapper 的代码


//  参考上面 实现entity  AnimalClassificationSubphylum 的 AnimalClassificationSubphylumMapper 的代码

