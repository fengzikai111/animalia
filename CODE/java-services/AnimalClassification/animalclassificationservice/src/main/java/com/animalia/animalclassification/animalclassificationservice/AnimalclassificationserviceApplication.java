package com.animalia.animalclassification.animalclassificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AnimalclassificationserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimalclassificationserviceApplication.class, args);
    }

}
