package com.animalia.animalclassification.animalclassificationservice.controller;

import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationClass;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/animalclassificationclass")
public class AnimalClassificationClassController {

    @Autowired
    private AnimalClassificationClassService animalClassificationClassService;

    @GetMapping("/all")
    public List<AnimalClassificationClass> getAllAnimalClassificationClass() {
        return animalClassificationClassService.getAllAnimalClassificationClass();
    }

    @GetMapping("/id/{id}")
    public AnimalClassificationClass getAnimalClassificationClassById(Integer id) {
        return animalClassificationClassService.getAnimalClassificationClassById(id);
    }

    @PostMapping("/add")
    public void addAnimalClassificationClass(AnimalClassificationClass animalClassificationClass) {
        animalClassificationClassService.addAnimalClassificationClass(animalClassificationClass);
    }

    @PutMapping("/update")
    public void updateAnimalClassificationClass(AnimalClassificationClass animalClassificationClass) {
        animalClassificationClassService.updateAnimalClassificationClass(animalClassificationClass);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimalClassificationClassById(Integer id) {
        animalClassificationClassService.deleteAnimalClassificationClassById(id);
    }
}