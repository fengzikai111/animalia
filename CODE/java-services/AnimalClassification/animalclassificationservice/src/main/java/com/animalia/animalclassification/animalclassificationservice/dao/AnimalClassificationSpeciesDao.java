package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationSpeciesMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSpecies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationSpeciesDao {

    @Autowired
    private AnimalClassificationSpeciesMapper animalClassificationSpeciesMapper;

    public List<AnimalClassificationSpecies> getAllAnimalClassificationSpecies() {
        return animalClassificationSpeciesMapper.selectAll();
     }

    public AnimalClassificationSpecies getAnimalClassificationSpeciesById(Integer id) {
        return animalClassificationSpeciesMapper.selectById(id);
     }

    public void addAnimalClassificationSpecies(AnimalClassificationSpecies animalClassificationSpecies) {
        animalClassificationSpeciesMapper.insert(animalClassificationSpecies);
        System.out.println("AnimalClassificationSpeciesDao.addAnimalClassificationSpecies() called");
    }

    public void updateAnimalClassificationSpecies(AnimalClassificationSpecies animalClassificationSpecies) {
        animalClassificationSpeciesMapper.update(animalClassificationSpecies);
        System.out.println("AnimalClassificationSpeciesDao.updateAnimalClassificationSpecies() called");
    }

    public void deleteAnimalClassificationSpeciesById(Integer id) {
        AnimalClassificationSpecies animalClassificationSpecies = new AnimalClassificationSpecies();
        animalClassificationSpecies.setId(id);
        animalClassificationSpeciesMapper.delete(animalClassificationSpecies);
        System.out.println("AnimalClassificationSpeciesDao.deleteAnimalClassificationSpeciesById() called");
    }
}
