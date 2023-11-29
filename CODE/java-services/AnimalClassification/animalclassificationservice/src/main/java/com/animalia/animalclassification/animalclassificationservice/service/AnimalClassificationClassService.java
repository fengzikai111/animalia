package com.animalia.animalclassification.animalclassificationservice.service;

import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationClassDao;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationKingdomDao;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalClassificationClassService {

    @Autowired
    private AnimalClassificationClassDao animalClassificationClassDao;

    public List<AnimalClassificationClass> getAllAnimalClassificationClass() {
        return animalClassificationClassDao.getAllAnimalClassificationClass();
    }

    public AnimalClassificationClass getAnimalClassificationClassById(Integer id) {
        return animalClassificationClassDao.getAnimalClassificationClassById(id);
    }

    public void addAnimalClassificationClass(AnimalClassificationClass animalClassificationClass) {
        animalClassificationClassDao.addAnimalClassificationClass(animalClassificationClass);
    }

    public void updateAnimalClassificationClass(AnimalClassificationClass animalClassificationClass) {
        animalClassificationClassDao.updateAnimalClassificationClass(animalClassificationClass);
    }

    public void deleteAnimalClassificationClassById(Integer id) {
        animalClassificationClassDao.deleteAnimalClassificationClassById(id);
    }
}




