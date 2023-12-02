package com.animalia.animalclassification.animalclassificationservice.controller;


import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationPhylum;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationSubphylum;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationKingdomService;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationPhylumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/animalclassificationPhylum")
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

    @GetMapping("/name/{name}")
    public AnimalClassificationPhylum getAnimalClassificationPhylumByName(@PathVariable String name) {
        return animalClassificationPhylumService.getAnimalClassificationPhylumByName(name);
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

    //参考    @PostMapping("/list")
    //    @ResponseBody
    //    public List<AnimalClassificationPhylum> getListAnimalClassificationKingdom(@RequestBody AnimalClassificationKingdom animalClassificationKingdom) {
    ////        System.out.println(animalClassificationKingdom.getName());
    //        return animalClassificationKingdomService.getListAnimalClassificationKingdom(AnimalClass.KINGDOM, animalClassificationKingdom.getName());
    //    }

    @PostMapping("/list")
    @ResponseBody
    public List<AnimalClassificationSubphylum> getListAnimalClassificationPhylum(@RequestBody AnimalClassificationPhylum animalClassificationPhylum) {
        return animalClassificationPhylumService.getListAnimalClassificationPhylum(animalClassificationPhylum.getName());
    }
}
