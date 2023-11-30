package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationSpeciesValueMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpeciesValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationSpeciesValueDao {
    @Autowired
    private AnimalClassificationSpeciesValueMapper animalClassificationSpeciesValueMapper;


    public List<AnimalClassificationSpeciesValue> getAnimalClassificationSpeciesValueByAttributeId(Integer id) {
        List<AnimalClassificationSpeciesValue> animalClassificationSpeciesValueList =animalClassificationSpeciesValueMapper.getAnimalClassificationSpeciesValueByAttributeId(id);
        return animalClassificationSpeciesValueList;
    }
}
