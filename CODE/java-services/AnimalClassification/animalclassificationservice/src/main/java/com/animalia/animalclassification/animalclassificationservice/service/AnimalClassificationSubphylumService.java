package com.animalia.animalclassification.animalclassificationservice.service;

import com.animalia.animalclassification.animalclassificationservice.common.AnimalClass;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationClassDao;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationSubphylumDao;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationClass;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSubphylum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalClassificationSubphylumService {

    @Autowired
    private AnimalClassificationSubphylumDao animalClassificationSubphylumDao;

    @Autowired
    private AnimalClassificationClassDao     animalClassificationClassDao;

    public List<AnimalClassificationSubphylum> getAllAnimalClassificationSubphylum() {
        return animalClassificationSubphylumDao.getAllAnimalClassificationSubphylum();
    }

    public AnimalClassificationSubphylum getAnimalClassificationSubphylumById(Integer id) {
        return animalClassificationSubphylumDao.getAnimalClassificationSubphylumById(id);
    }

    public void addAnimalClassificationSubphylum(AnimalClassificationSubphylum animalClassificationSubphylum) {
        animalClassificationSubphylumDao.addAnimalClassificationSubphylum(animalClassificationSubphylum);
    }

    public void updateAnimalClassificationSubphylum(AnimalClassificationSubphylum animalClassificationSubphylum) {
        animalClassificationSubphylumDao.updateAnimalClassificationSubphylum(animalClassificationSubphylum);
    }

    public void deleteAnimalClassificationSubphylumById(AnimalClassificationSubphylum id) {
        animalClassificationSubphylumDao.deleteAnimalClassificationSubphylumById(id);
    }

    public List<AnimalClassificationClass> getListAnimalClassificationSubphylum(AnimalClass subphylum, String name) {
        return animalClassificationClassDao.getAllAnimalClassificationClass();
    }

    public AnimalClassificationSubphylum getAnimalClassificationSubphylumByName(String name) {
        return animalClassificationSubphylumDao.getAnimalClassificationSubphylumByName(name);

    }
}
