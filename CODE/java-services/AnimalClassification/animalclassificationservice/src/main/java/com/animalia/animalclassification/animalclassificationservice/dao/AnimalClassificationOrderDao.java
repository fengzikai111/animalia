package com.animalia.animalclassification.animalclassificationservice.dao;

import com.animalia.animalclassification.animalclassificationservice.dao.mapper.AnimalClassificationOrderMapper;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalClassificationOrderDao {
    @Autowired
    private AnimalClassificationOrderMapper animalClassificationOrderMapper;

    public List<AnimalClassificationOrder> getAllAnimalClassificationOrder() {
        System.out.println("AnimalClassificationOrderDao.getAllAnimalClassificationOrder() called");
       return animalClassificationOrderMapper.selectAll();
    }

    public AnimalClassificationOrder getAnimalClassificationOrderById(Integer id) {
        System.out.println("AnimalClassificationOrderDao.getAnimalClassificationOrderById() called");
       return animalClassificationOrderMapper.selectByClassId(id);
    }

    public void addAnimalClassificationOrder(AnimalClassificationOrder animalClassificationOrder) {
        System.out.println("AnimalClassificationOrderDao.addAnimalClassificationOrder() called");
        animalClassificationOrderMapper.insert(animalClassificationOrder);

    }

    public void updateAnimalClassificationOrder(AnimalClassificationOrder animalClassificationOrder) {
        System.out.println("AnimalClassificationOrderDao.updateAnimalClassificationOrder() called");
        animalClassificationOrderMapper.update(animalClassificationOrder);
    }

    public void deleteAnimalClassificationOrderById(Integer id) {
        System.out.println("AnimalClassificationOrderDao.deleteAnimalClassificationOrderById() called");
        AnimalClassificationOrder animalClassificationOrder = new AnimalClassificationOrder();
        animalClassificationOrder.setId(id);
        animalClassificationOrderMapper.delete( animalClassificationOrder);
    }


}
