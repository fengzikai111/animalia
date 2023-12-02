package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationFamilyMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationFamily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationFamilyDao {

    @Autowired
    private AnimalClassificationFamilyMapper animalClassificationFamilyMapper;

    public List<AnimalClassificationFamily> getAllAnimalClassificationFamily() {
        return animalClassificationFamilyMapper.selectAll();
    }


    public AnimalClassificationFamily getAnimalClassificationFamilyById(Integer id) {
        return animalClassificationFamilyMapper.selectByClassId(id);
    }

    public void addAnimalClassificationFamily(AnimalClassificationFamily animalClassificationFamily) {
        animalClassificationFamilyMapper.insert(animalClassificationFamily);

    }

    public void updateAnimalClassificationFamily(AnimalClassificationFamily animalClassificationFamily) {
        animalClassificationFamilyMapper.update(animalClassificationFamily);
    }

    public void deleteAnimalClassificationFamilyById(Integer id) {
        AnimalClassificationFamily animalClassificationFamily = new AnimalClassificationFamily();
        animalClassificationFamily.setId(id);
        animalClassificationFamilyMapper.delete(animalClassificationFamily);
    }

    public AnimalClassificationFamily getAnimalClassificationFamilyByName(String name) {
        return animalClassificationFamilyMapper.selectByName(name);
    }
}
