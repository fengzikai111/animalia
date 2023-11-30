package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationSpeciesAttributeMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpeciesAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationSpeciesAttributeDao {
    @Autowired
    AnimalClassificationSpeciesAttributeMapper animalClassificationSpeciesAttributeMapper;

    public List<AnimalClassificationSpeciesAttribute> getAnimalClassificationSpeciesAttributeByEntityId(Integer id) {
        List<AnimalClassificationSpeciesAttribute> animalClassificationSpeciesAttributeList = animalClassificationSpeciesAttributeMapper.selectByEntityId(id);
        return animalClassificationSpeciesAttributeList;
    }
}
