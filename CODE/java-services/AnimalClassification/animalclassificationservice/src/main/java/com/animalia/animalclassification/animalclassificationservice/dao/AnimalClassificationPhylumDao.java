package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationKingdomMapper;
import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationPhylumMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationPhylum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationPhylumDao {

    @Autowired
    AnimalClassificationPhylumMapper animalClassificationPhylumMapper;

    public void deleteAnimalClassificationPhylumById(Integer id) {
        animalClassificationPhylumMapper.deleteById(id);
    }

    public void updateAnimalClassificationPhylum(AnimalClassificationPhylum animalClassificationPhylum) {
        animalClassificationPhylumMapper.updateById(animalClassificationPhylum);
    }

    public void addAnimalClassificationPhylum(AnimalClassificationPhylum animalClassificationPhylum) {
        animalClassificationPhylumMapper.insert(animalClassificationPhylum);
    }

    public AnimalClassificationPhylum getAnimalClassificationPhylumById(Integer id) {
        return animalClassificationPhylumMapper.selectById(id);
    }

    public List<AnimalClassificationPhylum> getAllAnimalClassificationPhylum() {
        return animalClassificationPhylumMapper.selectAll();
    }

    public AnimalClassificationPhylum getAnimalClassificationPhylumByName(String name) {
        return animalClassificationPhylumMapper.selectByName(name);
    }
}
