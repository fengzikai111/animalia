package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationSpeciesEntityMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpeciesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationSpeciesEntityDao {

    @Autowired
    AnimalClassificationSpeciesEntityMapper animalClassificationSpeciesEntityMapper;

    public List<AnimalClassificationSpeciesEntity> getAnimalClassificationSpeciesEntityBySpeciesId(Integer species_id) {
        List<AnimalClassificationSpeciesEntity> animalClassificationSpeciesEntityList= animalClassificationSpeciesEntityMapper.selectBySpeciesId(species_id);
        return animalClassificationSpeciesEntityList;
    }
}
