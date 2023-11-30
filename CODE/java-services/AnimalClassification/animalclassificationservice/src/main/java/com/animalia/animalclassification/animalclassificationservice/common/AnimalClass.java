package com.animalia.animalclassification.animalclassificationservice.common;

public enum AnimalClass {
    //增加动物种类分级枚举
    KINGDOM("kingdom"),
    PHYLUM("phylum"),
    SUBPHYLUM("subphylum"),
    CLASS("class"),
    ORDER("order"),
    FAMILY("family"),
    GENUS("genus"),
    SPECIES("species");
    AnimalClass(String name){
        this.name = name;
    }

    private String name;
}
