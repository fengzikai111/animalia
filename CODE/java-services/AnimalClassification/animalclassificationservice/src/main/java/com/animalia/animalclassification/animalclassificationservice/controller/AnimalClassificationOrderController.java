package com.animalia.animalclassification.animalclassificationservice.controller;

/**
 * 生成 entity AnimalClassificationKingdom 的 controller
 */

import com.animalia.animalclassification.animalclassificationservice.common.AnimalClass;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationFamily;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationKingdom;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationOrder;
import com.animalia.animalclassification.animalclassificationservice.entity.AnimalClassificationPhylum;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationKingdomService;
import com.animalia.animalclassification.animalclassificationservice.service.AnimalClassificationOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/animalclassificationOrder")
public class AnimalClassificationOrderController {

    @Autowired
    private AnimalClassificationOrderService animalClassificationOrderService;

     // 替换entity 为 AnimalClassificationOrder

    @GetMapping("/all")
    public List<AnimalClassificationOrder> getAllAnimalClassificationOrder() {
        return animalClassificationOrderService.getAllAnimalClassificationOrder();
    }
    @GetMapping("/id/{id}")
    public AnimalClassificationOrder getAnimalClassificationOrderById(@PathVariable Integer id) {
        return animalClassificationOrderService.getAnimalClassificationOrderById(id);
    }
    @PostMapping("/add")
    public void addAnimalClassificationOrder(@RequestBody AnimalClassificationOrder animalClassificationOrder) {
        animalClassificationOrderService.addAnimalClassificationOrder(animalClassificationOrder);
    }
    @PutMapping("/update")
    public void updateAnimalClassificationOrder(@RequestBody AnimalClassificationOrder animalClassificationOrder) {
        animalClassificationOrderService.updateAnimalClassificationOrder(animalClassificationOrder);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimalClassificationOrderById(@PathVariable Integer id) {
        animalClassificationOrderService.deleteAnimalClassificationOrderById(id);
    }

    @PostMapping("/list")
    @ResponseBody
    public List<AnimalClassificationFamily> getListAnimalClassificationOrder(@RequestBody AnimalClassificationOrder animalClassificationOrder) {
//        System.out.println(animalClassificationKingdom.getName());
        return animalClassificationOrderService.getListAnimalClassificationOrder(AnimalClass.ORDER, animalClassificationOrder.getName());
    }
}

