package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationSubphylumMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSubphylum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationSubphylumDao {
    @Autowired
    private AnimalClassificationSubphylumMapper animalClassificationSubphylumMapper;

    public List<AnimalClassificationSubphylum> getAllAnimalClassificationSubphylum() {
        System.out.println("AnimalClassificationSubphylumDao.getAllAnimalClassificationSubphylum() called");
        return animalClassificationSubphylumMapper.selectAll();
    }

    public AnimalClassificationSubphylum getAnimalClassificationSubphylumById(Integer id) {
        System.out.println("AnimalClassificationSubphylumDao.getAnimalClassificationSubphylumById() called");
        return animalClassificationSubphylumMapper.selectById(id);
    }

    public void addAnimalClassificationSubphylum(AnimalClassificationSubphylum animalClassificationSubphylum) {
        System.out.println("AnimalClassificationSubphylumDao.addAnimalClassificationSubphylum() called");
        animalClassificationSubphylumMapper.insert(animalClassificationSubphylum)  ;
    }

    public void updateAnimalClassificationSubphylum(AnimalClassificationSubphylum animalClassificationSubphylum) {
        System.out.println("AnimalClassificationSubphylumDao.updateAnimalClassificationSubphylum() called");
        animalClassificationSubphylumMapper.update(animalClassificationSubphylum);
    }

    public void deleteAnimalClassificationSubphylumById(AnimalClassificationSubphylum id) {
        System.out.println("AnimalClassificationSubphylumDao.deleteAnimalClassificationSubphylumById() called");
        animalClassificationSubphylumMapper.delete(id);
    }
}
