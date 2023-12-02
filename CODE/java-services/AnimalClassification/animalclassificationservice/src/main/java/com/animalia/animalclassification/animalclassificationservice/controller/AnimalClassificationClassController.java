package com.animalia.animalclassification.animalclassificationservice.controller;

import com.animalia.animalclassification.animalclassificationservice.common.AnimalClass;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationClass;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationKingdom;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationOrder;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationPhylum;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationClassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/animalclassificationClass")
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

    @GetMapping("/name/{name}")
    public AnimalClassificationClass getAnimalClassificationClassByName(@PathVariable String name) {
        return animalClassificationClassService.getAnimalClassificationClassByName(name);
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

    @PostMapping("/list")
    @ResponseBody
    public List<AnimalClassificationOrder> getListAnimalClassificationClass(@RequestBody AnimalClassificationClass animalClassificationClass) {
//        System.out.println(animalClassificationKingdom.getName());
        return animalClassificationClassService.getListAnimalClassificationClass(AnimalClass.CLASS, animalClassificationClass.getName());
    }
}