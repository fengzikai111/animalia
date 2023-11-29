package com.animalia.animalclassification.animalclassificationservice.controller;

import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationGenus;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSubphylum;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationGenusService;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationSubphylumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/animalclassificationgenus")
public class AnimalClassificationGenusController {

    @Autowired
    private AnimalClassificationGenusService animalClassificationGenusService;

    // 替换entity 为 AnimalClassificationGenus
    @GetMapping("/all")
    public List<AnimalClassificationGenus> getAllAnimalClassificationGenus() {
        return animalClassificationGenusService.getAllAnimalClassificationGenus();
    }

    @GetMapping("/id/{id}")
    public AnimalClassificationGenus getAnimalClassificationGenusById(Integer id) {
        return animalClassificationGenusService.getAnimalClassificationGenusById(id);
    }

    @PostMapping("/add")
    public void addAnimalClassificationGenus(AnimalClassificationGenus animalClassificationGenus) {
        animalClassificationGenusService.addAnimalClassificationGenus(animalClassificationGenus);
    }

    @PutMapping("/update")
    public void updateAnimalClassificationGenus(AnimalClassificationGenus animalClassificationGenus) {
        animalClassificationGenusService.updateAnimalClassificationGenus(animalClassificationGenus);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimalClassificationGenusById(Integer id) {
        animalClassificationGenusService.deleteAnimalClassificationGenusById(id);
    }
}
