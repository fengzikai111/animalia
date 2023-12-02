package com.animalia.animalclassification.animalclassificationservice.service;

import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationKingdomDao;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationPhylumDao;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationSubphylumDao;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationPhylum;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSubphylum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalClassificationPhylumService {
    @Autowired
    private AnimalClassificationPhylumDao animalClassificationPhylumDao;

    @Autowired
    private AnimalClassificationSubphylumDao animalClassificationSubphylumDao;

    public void deleteAnimalClassificationPhylumById(Integer id) {
        animalClassificationPhylumDao.deleteAnimalClassificationPhylumById(id);
    }

    public void updateAnimalClassificationPhylum(AnimalClassificationPhylum animalClassificationPhylum) {
        animalClassificationPhylumDao.updateAnimalClassificationPhylum(animalClassificationPhylum);
    }

    public void addAnimalClassificationPhylum(AnimalClassificationPhylum animalClassificationPhylum) {
        animalClassificationPhylumDao.addAnimalClassificationPhylum(animalClassificationPhylum);
    }

    public AnimalClassificationPhylum getAnimalClassificationPhylumById(Integer id) {
        return animalClassificationPhylumDao.getAnimalClassificationPhylumById(id);
    }

    public List<AnimalClassificationPhylum> getAllAnimalClassificationPhylum() {
        return animalClassificationPhylumDao.getAllAnimalClassificationPhylum();
    }

    public List<AnimalClassificationSubphylum> getListAnimalClassificationPhylum(String name) {
       return animalClassificationSubphylumDao.getAllAnimalClassificationSubphylum();
    }

    public AnimalClassificationPhylum getAnimalClassificationPhylumByName(String name) {
        return animalClassificationPhylumDao.getAnimalClassificationPhylumByName(name);
    }
}
