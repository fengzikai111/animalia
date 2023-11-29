package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationGenusMapper;
import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationKingdomMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationGenus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationGenusDao {
    @Autowired
    AnimalClassificationGenusMapper animalClassificationGenusMapper;

    public void addAnimalClassificationGenus( AnimalClassificationGenus animalClassificationGenus) {
        animalClassificationGenusMapper.insert(   animalClassificationGenus);
    }

    public void updateAnimalClassificationGenus(    AnimalClassificationGenus animalClassificationGenus) {
        animalClassificationGenusMapper.update(    animalClassificationGenus);
    }

    public void deleteAnimalClassificationGenusById(    Integer id) {
        animalClassificationGenusMapper.deleteById(   id     );
    }

    public List<AnimalClassificationGenus> getAllAnimalClassificationGenus() {
       return animalClassificationGenusMapper.selectAll();

    }

    public AnimalClassificationGenus  getAnimalClassificationGenusById(   Integer id) {
        return animalClassificationGenusMapper.selectById(   id     );
    }

}
