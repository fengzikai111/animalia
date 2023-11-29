package com.animalia.animalclassification.animalclassificationservice.controller;


import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationPhylum;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationKingdomService;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationPhylumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/animalclassificationphylum")
public class AnimalClassificationPhylumController {
    // 请完成  AnimalClassificationPhylum 的 controller 代码
    @Autowired
    private AnimalClassificationPhylumService animalClassificationPhylumService;

    @GetMapping("/all")
    public List<AnimalClassificationPhylum> getAllAnimalClassificationPhylum() {
        return animalClassificationPhylumService.getAllAnimalClassificationPhylum();
    }

    @GetMapping("/id/{id}")
    public AnimalClassificationPhylum getAnimalClassificationPhylumById(@PathVariable Integer id) {
        return animalClassificationPhylumService.getAnimalClassificationPhylumById(id);
    }

    @PostMapping("/add")
    public void addAnimalClassificationPhylum(@RequestBody AnimalClassificationPhylum animalClassificationPhylum) {
        animalClassificationPhylumService.addAnimalClassificationPhylum(animalClassificationPhylum);
    }

    @PutMapping("/update")
    public void updateAnimalClassificationPhylum(@RequestBody AnimalClassificationPhylum animalClassificationPhylum) {
        animalClassificationPhylumService.updateAnimalClassificationPhylum(animalClassificationPhylum);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimalClassificationPhylumById(@PathVariable Integer id) {
        animalClassificationPhylumService.deleteAnimalClassificationPhylumById(id);
    }
}
