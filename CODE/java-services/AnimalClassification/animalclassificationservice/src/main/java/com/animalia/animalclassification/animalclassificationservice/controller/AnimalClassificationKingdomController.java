package com.animalia.animalclassification.animalclassificationservice.controller;

/**
 * 生成 entity AnimalClassificationKingdom 的 controller
 */
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationKingdom;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationKingdomService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/animalclassificationkingdom")
public class AnimalClassificationKingdomController {

    @Autowired
    private AnimalClassificationKingdomService animalClassificationKingdomService;


    @GetMapping("/all")
    public List<AnimalClassificationKingdom> getAllAnimalClassificationKingdom() {
        return animalClassificationKingdomService.getAllAnimalClassificationKingdom();
    }

    @GetMapping("/id/{id}")
    public AnimalClassificationKingdom getAnimalClassificationKingdomById(@PathVariable Integer id) {
        return animalClassificationKingdomService.getAnimalClassificationKingdomById(id);
    }

    @PostMapping("/add")
    public void addAnimalClassificationKingdom(@RequestBody AnimalClassificationKingdom animalClassificationKingdom) {
        animalClassificationKingdomService.addAnimalClassificationKingdom(animalClassificationKingdom);
    }

    @PutMapping("/update")
    public void updateAnimalClassificationKingdom(@RequestBody AnimalClassificationKingdom animalClassificationKingdom) {
        animalClassificationKingdomService.updateAnimalClassificationKingdom(animalClassificationKingdom);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimalClassificationKingdomById(@PathVariable Integer id) {
        animalClassificationKingdomService.deleteAnimalClassificationKingdomById(id);
    }
}

/**
 * 生成 entity AnimalClassificationKingdom 的 controller
 */