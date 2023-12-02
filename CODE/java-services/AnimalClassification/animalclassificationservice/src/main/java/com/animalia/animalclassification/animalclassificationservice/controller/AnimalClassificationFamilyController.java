package com.animalia.animalclassification.animalclassificationservice.controller;

 import com.animalia.animalclassification.animalclassificationservice.common.AnimalClass;
 import com.animalia.animalclassification.animalclassificationservice.entity.*;
 import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationFamilyService;
 import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;


@Slf4j
@RestController
@RequestMapping("/animalclassificationFamily")
public class AnimalClassificationFamilyController {

    @Autowired
    private AnimalClassificationFamilyService animalClassificationFamilyService;

    @GetMapping("/all")
    public List<AnimalClassificationFamily> getAllAnimalClassificationFamily() {
        return animalClassificationFamilyService.getAllAnimalClassificationFamily();
    }

    @GetMapping("/id/{id}")
    public AnimalClassificationFamily getAnimalClassificationFamilyById(Integer id) {
        return animalClassificationFamilyService.getAnimalClassificationFamilyById(id);
    }

    @GetMapping("/name/{name}")
    public AnimalClassificationFamily getAnimalClassificationFamilyByName(@PathVariable String name) {
        return animalClassificationFamilyService.getAnimalClassificationFamilyByName(name);
    }

    @PostMapping("/add")
    public void addAnimalClassificationFamily(AnimalClassificationFamily animalClassificationFamily) {
        animalClassificationFamilyService.addAnimalClassificationFamily(animalClassificationFamily);
    }
    @PutMapping("/update")
    public void updateAnimalClassificationFamily(AnimalClassificationFamily animalClassificationFamily) {
        animalClassificationFamilyService.updateAnimalClassificationFamily(animalClassificationFamily);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimalClassificationFamilyById(Integer id) {
        animalClassificationFamilyService.deleteAnimalClassificationFamilyById(id);
    }

    @PostMapping("/list")
    @ResponseBody
    public List<AnimalClassificationGenus> getListAnimalClassificationFamily(@RequestBody AnimalClassificationFamily animalClassificationFamily) {
//        System.out.println(animalClassificationKingdom.getName());
        return animalClassificationFamilyService.getListAnimalClassificationFamily(AnimalClass.FAMILY, animalClassificationFamily.getName());
    }
}
