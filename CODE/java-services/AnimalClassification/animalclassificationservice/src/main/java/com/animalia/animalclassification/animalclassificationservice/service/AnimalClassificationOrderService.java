package com.animalia.animalclassification.animalclassificationservice.service;

import com.animalia.animalclassification.animalclassificationservice.common.AnimalClass;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationFamilyDao;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationOrderDao;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationFamily;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalClassificationOrderService {

    @Autowired
    private AnimalClassificationOrderDao animalClassificationOrderDao;

    @Autowired
    private AnimalClassificationFamilyDao animalClassificationFamilyDao;

    public List<AnimalClassificationOrder> getAllAnimalClassificationOrder() {
        return animalClassificationOrderDao.getAllAnimalClassificationOrder();
    }

    public AnimalClassificationOrder getAnimalClassificationOrderById(Integer id) {
        return animalClassificationOrderDao.getAnimalClassificationOrderById(id);
    }

    public void addAnimalClassificationOrder(AnimalClassificationOrder animalClassificationOrder) {
        animalClassificationOrderDao.addAnimalClassificationOrder(animalClassificationOrder);
    }

    public void updateAnimalClassificationOrder(AnimalClassificationOrder animalClassificationOrder) {
        animalClassificationOrderDao.updateAnimalClassificationOrder(animalClassificationOrder);
    }

    public void deleteAnimalClassificationOrderById(Integer id) {
        animalClassificationOrderDao.deleteAnimalClassificationOrderById(id);
    }

    public List<AnimalClassificationFamily> getListAnimalClassificationOrder(AnimalClass order, String name) {
        return animalClassificationFamilyDao.getAllAnimalClassificationFamily();
    }
}
