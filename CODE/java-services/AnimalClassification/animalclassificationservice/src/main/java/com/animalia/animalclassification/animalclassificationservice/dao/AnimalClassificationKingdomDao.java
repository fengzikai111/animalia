package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationKingdomMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationKingdom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationKingdomDao {

    @Autowired
    AnimalClassificationKingdomMapper animalClassificationKingdomMapper;
    public List<AnimalClassificationKingdom> getAllAnimalClassificationKingdom() {
        return animalClassificationKingdomMapper.selectAll();

    }

    public AnimalClassificationKingdom getAnimalClassificationKingdomById(Integer id) {
        return animalClassificationKingdomMapper.selectById(id);
    }

    public void addAnimalClassificationKingdom(AnimalClassificationKingdom animalClassificationKingdom) {

    }

    public void updateAnimalClassificationKingdom(AnimalClassificationKingdom animalClassificationKingdom) {

    }

    public void deleteAnimalClassificationKingdomById(Integer id) {
    }
}
