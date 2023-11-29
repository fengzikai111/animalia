package com.animalia.animalclassification.animalclassificationservice.controller;

 import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationClass;
 import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationFamily;
 import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationFamilyService;
 import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;


@Slf4j
@RestController
@RequestMapping("/animalclassificationfamily")
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

}
