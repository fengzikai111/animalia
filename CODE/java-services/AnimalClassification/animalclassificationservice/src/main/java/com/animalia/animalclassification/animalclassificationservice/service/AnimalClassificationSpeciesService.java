package com.animalia.animalclassification.animalclassificationservice.service;

import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationSpeciesAttributeDao;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationSpeciesDao;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationSpeciesEntityDao;
import com.animalia.animalclassification.animalclassificationservice.dao.AnimalClassificationSpeciesValueDao;
import com.animalia.animalclassification.animalclassificationservice.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalClassificationSpeciesService {

    @Autowired
    private AnimalClassificationSpeciesDao animalClassificationSpeciesDao;

    public List<AnimalClassificationSpecies> getAllAnimalClassificationSpecies() {
        return animalClassificationSpeciesDao.getAllAnimalClassificationSpecies();
    }

    public AnimalClassificationSpecies getAnimalClassificationSpeciesById(Integer id) {
        return animalClassificationSpeciesDao.getAnimalClassificationSpeciesById(id);
    }

    public void addAnimalClassificationSpecies(AnimalClassificationSpecies animalClassificationSpecies) {
        animalClassificationSpeciesDao.addAnimalClassificationSpecies(animalClassificationSpecies);
    }

    public void updateAnimalClassificationSpecies(AnimalClassificationSpecies animalClassificationSpecies) {
        animalClassificationSpeciesDao.updateAnimalClassificationSpecies(animalClassificationSpecies);
    }

    public void deleteAnimalClassificationSpeciesById(Integer id) {
        animalClassificationSpeciesDao.deleteAnimalClassificationSpeciesById(id);
    }

    // 通过AnimalClassificationSpeciesEntityDao\AnimalClassificationSpeciesValueDao\AnimalClassificationSpeciesAttributeDao
    // 实现这个方法，这个方法用于组织上述json结构的数据。

    @Autowired
    private AnimalClassificationSpeciesEntityDao animalClassificationSpeciesEntityDao;

    @Autowired
    private AnimalClassificationSpeciesValueDao animalClassificationSpeciesValueDao;

    @Autowired
    private AnimalClassificationSpeciesAttributeDao animalClassificationSpeciesAttributeDao;

    public AnimalClassificationSpeciesVO queryAnimalClassificationSpecies(AnimalClassificationSpecies animalClassificationSpecies) {

        // 1. 获取Species_id
        Integer species_id = animalClassificationSpecies.getId();
        // 根据Species_id获取所有entity
        List<AnimalClassificationSpeciesEntity> animalClassificationSpeciesEntityList = animalClassificationSpeciesEntityDao.getAnimalClassificationSpeciesEntityBySpeciesId(species_id);
        //创建封装VO对象
        AnimalClassificationSpeciesVO animalClassificationSpeciesVO = new AnimalClassificationSpeciesVO();

        //循环entitylist，获取entity，根据entity获取attributes，根据attributes获取values，组织数据到VO对象中
        List<AnimalClassificationSpeciesEntityVO> animalClassificationSpeciesEntityVOList = new ArrayList<>();
        for (AnimalClassificationSpeciesEntity animalClassificationSpeciesEntity : animalClassificationSpeciesEntityList) {
            AnimalClassificationSpeciesEntityVO animalClassificationSpeciesEntityVO = new AnimalClassificationSpeciesEntityVO();
            animalClassificationSpeciesEntityVO.setEntityType(animalClassificationSpeciesEntity.getEntityType());
            List<AnimalClassificationSpeciesAttribute> animalClassificationSpeciesAttributeList = animalClassificationSpeciesAttributeDao.getAnimalClassificationSpeciesAttributeByEntityId(animalClassificationSpeciesEntity.getId());
            List<AnimalClassificationSpeciesAttributeVO> animalClassificationSpeciesAttributeVOList = new ArrayList<>();
            for (AnimalClassificationSpeciesAttribute animalClassificationSpeciesAttribute : animalClassificationSpeciesAttributeList) {
                AnimalClassificationSpeciesAttributeVO animalClassificationSpeciesAttributeVO = new AnimalClassificationSpeciesAttributeVO();

                List<AnimalClassificationSpeciesValue> animalClassificationSpeciesValueList = animalClassificationSpeciesValueDao.getAnimalClassificationSpeciesValueByAttributeId(animalClassificationSpeciesAttribute.getId());
                List<String> animalClassificationSpeciesValueVOList = new ArrayList<>();
                for (AnimalClassificationSpeciesValue animalClassificationSpeciesValue : animalClassificationSpeciesValueList) {
                    AnimalClassificationSpeciesValueVO animalClassificationSpeciesValueVO = new AnimalClassificationSpeciesValueVO();
                    animalClassificationSpeciesValueVO.setValue(animalClassificationSpeciesValue.getValue());
                    animalClassificationSpeciesValueVOList.add(animalClassificationSpeciesValue.getValue());
                }
                animalClassificationSpeciesAttributeVO.setValues(animalClassificationSpeciesValueVOList);
                animalClassificationSpeciesAttributeVOList.add(animalClassificationSpeciesAttributeVO);
            }
            animalClassificationSpeciesEntityVO.setAttributes(animalClassificationSpeciesAttributeVOList);
            animalClassificationSpeciesEntityVOList.add(animalClassificationSpeciesEntityVO);

        }
        animalClassificationSpeciesVO.setEntities(animalClassificationSpeciesEntityVOList);
        return animalClassificationSpeciesVO;
    }
}
