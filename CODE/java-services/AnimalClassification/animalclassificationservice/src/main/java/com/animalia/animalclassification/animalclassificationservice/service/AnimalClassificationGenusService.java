package com.animalia.animalclassification.animalclassificationservice.service;

import com.animalia.animalclassification.animalclassificationservice.common.AnimalClass;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationGenusDao;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationSpeciesDao;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationGenus;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpecies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalClassificationGenusService {
    @Autowired
    private AnimalClassificationGenusDao animalClassificationGenusDao;

    @Autowired
    private AnimalClassificationSpeciesDao animalClassificationSpeciesDao;

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

    public List<AnimalClassificationSpecies> getListAnimalClassificationGenus(AnimalClass genus, String name) {
        return animalClassificationSpeciesDao.getAllAnimalClassificationSpecies();
    }
}
