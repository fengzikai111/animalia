package com.animalia.animalclassification.animalclassificationservice.service;

import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationFamilyDao;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationFamily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalClassificationFamilyService {

    @Autowired
    private AnimalClassificationFamilyDao animalClassificationFamilyDao;

    public List<AnimalClassificationFamily> getAllAnimalClassificationFamily() {
        return animalClassificationFamilyDao.getAllAnimalClassificationFamily();
    }

    public AnimalClassificationFamily getAnimalClassificationFamilyById(Integer id) {
        return animalClassificationFamilyDao.getAnimalClassificationFamilyById(id);
    }

    public void addAnimalClassificationFamily(AnimalClassificationFamily animalClassificationFamily) {
        animalClassificationFamilyDao.addAnimalClassificationFamily(animalClassificationFamily);
    }

    public void updateAnimalClassificationFamily(AnimalClassificationFamily animalClassificationFamily) {
        animalClassificationFamilyDao.updateAnimalClassificationFamily(animalClassificationFamily);
    }

    public void deleteAnimalClassificationFamilyById(Integer id) {
        animalClassificationFamilyDao.deleteAnimalClassificationFamilyById(id);
    }
}
