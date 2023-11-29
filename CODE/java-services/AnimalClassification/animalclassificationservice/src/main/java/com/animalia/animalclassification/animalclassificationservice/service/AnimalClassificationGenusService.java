package com.animalia.animalclassification.animalclassificationservice.service;

import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationGenusDao;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationGenus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalClassificationGenusService {
    @Autowired
    private AnimalClassificationGenusDao animalClassificationGenusDao;

    public List<AnimalClassificationGenus> getAllAnimalClassificationGenus() {
        return animalClassificationGenusDao.getAllAnimalClassificationGenus();
    }

    public AnimalClassificationGenus getAnimalClassificationGenusById(Integer id) {
        return animalClassificationGenusDao.getAnimalClassificationGenusById(id);
    }

    public void addAnimalClassificationGenus(AnimalClassificationGenus animalClassificationGenus) {
        animalClassificationGenusDao.addAnimalClassificationGenus(animalClassificationGenus);
    }

    public void updateAnimalClassificationGenus(AnimalClassificationGenus animalClassificationGenus) {
        animalClassificationGenusDao.updateAnimalClassificationGenus(animalClassificationGenus);
    }

    public void deleteAnimalClassificationGenusById(Integer id) {
        animalClassificationGenusDao.deleteAnimalClassificationGenusById(id);
    }
}
