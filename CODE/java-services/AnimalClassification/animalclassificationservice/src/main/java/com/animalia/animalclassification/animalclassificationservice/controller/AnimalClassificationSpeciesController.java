package com.animalia.animalclassification.animalclassificationservice.controller;

import com.animalia.animalclassification.animalclassificationservice.common.AnimalClass;
import com.animalia.animalclassification.animalclassificationservice.entity.*;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationSpeciesService;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationSubphylumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@Slf4j
@RestController
@RequestMapping("/animalclassificationSpecies")
public class AnimalClassificationSpeciesController {




    @Autowired
    private AnimalClassificationSpeciesService animalClassificationSpeciesService;

    // 替换entity 为 AnimalClassificationSpecies
    @GetMapping("/all")
    public List<AnimalClassificationSpecies> getAllAnimalClassificationSpecies() {
        return animalClassificationSpeciesService.getAllAnimalClassificationSpecies();
    }

    @GetMapping("/id/{id}")
    public AnimalClassificationSpecies getAnimalClassificationSpeciesById(Integer id) {
        return animalClassificationSpeciesService.getAnimalClassificationSpeciesById(id);
    }

    @GetMapping("/name/{name}")
    public AnimalClassificationSpecies getAnimalClassificationSpeciesByName(@PathVariable String name) {
        return animalClassificationSpeciesService.getAnimalClassificationSpeciesByName(name);
    }

    @PostMapping("/add")
    public void addAnimalClassificationSpecies(AnimalClassificationSpecies animalClassificationSpecies) {
        animalClassificationSpeciesService.addAnimalClassificationSpecies(animalClassificationSpecies);
    }

    @PutMapping("/update")
    public void updateAnimalClassificationSpecies(AnimalClassificationSpecies animalClassificationSpecies) {
        animalClassificationSpeciesService.updateAnimalClassificationSpecies(animalClassificationSpecies);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimalClassificationSpeciesById(Integer id) {
        animalClassificationSpeciesService.deleteAnimalClassificationSpeciesById(id);
    }

    @GetMapping("/animalclassificationspecies/{id}")
    public AnimalClassificationSpeciesVO queryAnimalClassificationSpecies(@PathVariable Integer id) {
        return animalClassificationSpeciesService.queryAnimalClassificationSpecies(id);
    }

}