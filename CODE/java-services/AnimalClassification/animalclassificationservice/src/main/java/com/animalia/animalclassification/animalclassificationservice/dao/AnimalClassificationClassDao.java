package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationClassMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationClassDao {

    @Autowired
    AnimalClassificationClassMapper animalClassificationClassMapper;

    public AnimalClassificationClass getAnimalClassificationClassById(Integer id) {
        return animalClassificationClassMapper.selectById(id);
    }

    public void addAnimalClassificationClass(AnimalClassificationClass animalClassificationClass) {
        animalClassificationClassMapper.insert(animalClassificationClass);
    }

    public void updateAnimalClassificationClass(AnimalClassificationClass animalClassificationClass) {
        animalClassificationClassMapper.update(animalClassificationClass);
    }

    public void deleteAnimalClassificationClassById(Integer id) {
        animalClassificationClassMapper.deleteById(id);
    }

    public List<AnimalClassificationClass> getAllAnimalClassificationClass() {
        return animalClassificationClassMapper.selectAll();
    }

    public AnimalClassificationClass getAnimalClassificationClassByName(String name) {
        return animalClassificationClassMapper.selectByName(name);
    }
}
