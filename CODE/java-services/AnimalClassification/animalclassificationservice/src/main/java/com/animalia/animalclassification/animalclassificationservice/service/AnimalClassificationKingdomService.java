package com.animalia.animalclassification.animalclassificationservice.service;

/**
 * 生成 entity AnimalClassificationKingdom 的 service
 */
import com.animalia.animalclassification.animalclassificationservice.common.AnimalClass;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationPhylumDao;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationSubphylumDao;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationKingdom;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationKingdomDao;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationPhylum;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSubphylum;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class AnimalClassificationKingdomService {
    @Autowired
    private AnimalClassificationKingdomDao animalClassificationKingdomDao;

    @Autowired
    private AnimalClassificationPhylumDao animalClassificationPhylumDao;

    public List<AnimalClassificationKingdom> getAllAnimalClassificationKingdom() {
        return animalClassificationKingdomDao.getAllAnimalClassificationKingdom();
    }

    public AnimalClassificationKingdom getAnimalClassificationKingdomById(Integer id) {
        return animalClassificationKingdomDao.getAnimalClassificationKingdomById(id);
    }

    public void addAnimalClassificationKingdom(AnimalClassificationKingdom animalClassificationKingdom) {
        animalClassificationKingdomDao.addAnimalClassificationKingdom(animalClassificationKingdom);
    }

    public void updateAnimalClassificationKingdom(AnimalClassificationKingdom animalClassificationKingdom) {
        animalClassificationKingdomDao.updateAnimalClassificationKingdom(animalClassificationKingdom);
    }

    public void deleteAnimalClassificationKingdomById(Integer id) {
        animalClassificationKingdomDao.deleteAnimalClassificationKingdomById(id);
    }

    public List<AnimalClassificationPhylum> getListAnimalClassificationKingdom(AnimalClass kingdom, String name) {
        return animalClassificationPhylumDao.getAllAnimalClassificationPhylum();
    }

    public AnimalClassificationKingdom getAnimalClassificationKingdomByName(String name) {
        return animalClassificationKingdomDao.getAnimalClassificationKingdomByName(name);
    }
}

