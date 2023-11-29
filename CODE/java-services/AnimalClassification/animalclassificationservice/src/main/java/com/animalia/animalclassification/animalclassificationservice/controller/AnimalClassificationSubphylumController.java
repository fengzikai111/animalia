package com.animalia.animalclassification.animalclassificationservice.controller;

import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSubphylum;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationSubphylumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/animalclassificationsubphylum")
public class AnimalClassificationSubphylumController {

    @Autowired
    private AnimalClassificationSubphylumService animalClassificationSubphylumService;

    @GetMapping("/all")
    public List<AnimalClassificationSubphylum> getAllAnimalClassificationSubphylum() {
        return animalClassificationSubphylumService.getAllAnimalClassificationSubphylum();
    }

    @GetMapping("/id/{id}")
    public AnimalClassificationSubphylum getAnimalClassificationSubphylumById(Integer id) {
        return animalClassificationSubphylumService.getAnimalClassificationSubphylumById(id);
    }

    @PostMapping("/add")
    public void addAnimalClassificationSubphylum(AnimalClassificationSubphylum animalClassificationSubphylum) {
        animalClassificationSubphylumService.addAnimalClassificationSubphylum(animalClassificationSubphylum);
    }

    @PutMapping("/update")
    public void updateAnimalClassificationSubphylum(AnimalClassificationSubphylum animalClassificationSubphylum) {
        animalClassificationSubphylumService.updateAnimalClassificationSubphylum(animalClassificationSubphylum);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimalClassificationSubphylumById(Integer id) {
        AnimalClassificationSubphylum animalClassificationSubphylum= new AnimalClassificationSubphylum();
        animalClassificationSubphylum.setId(id);
        animalClassificationSubphylumService.deleteAnimalClassificationSubphylumById(animalClassificationSubphylum);
    }
}