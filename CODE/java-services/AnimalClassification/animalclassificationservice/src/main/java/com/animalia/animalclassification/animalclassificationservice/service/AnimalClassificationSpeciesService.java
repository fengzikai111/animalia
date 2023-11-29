package com.animalia.animalclassification.animalclassificationservice.service;

import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationSpeciesDao;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpecies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalClassificationSpeciesService {

    @Autowired
    private AnimalClassificationSpeciesDao animalClassificationSpeciesDao;

    public List<AnimalClassificationSpecies> getAllAnimalClassificationSpecies() {
        return animalClassificationSpeciesDao.getAllAnimalClassificationSpecies();
    }

    public AnimalClassificationSpecies getAnimalClassificationSpeciesById(Integer id) {
        return animalClassificationSpeciesDao.getAnimalClassificationSpeciesById(id);
    }

    public void addAnimalClassificationSpecies(AnimalClassificationSpecies animalClassificationSpecies) {
        animalClassificationSpeciesDao.addAnimalClassificationSpecies(animalClassificationSpecies);
    }

    public void updateAnimalClassificationSpecies(AnimalClassificationSpecies animalClassificationSpecies) {
        animalClassificationSpeciesDao.updateAnimalClassificationSpecies(animalClassificationSpecies);
    }

    public void deleteAnimalClassificationSpeciesById(Integer id) {
        animalClassificationSpeciesDao.deleteAnimalClassificationSpeciesById(id);
    }
}
