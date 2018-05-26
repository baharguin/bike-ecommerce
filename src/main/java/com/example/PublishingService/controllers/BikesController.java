package com.example.PublishingService.controllers;

//import org.springframework.beans.factory.annotation.Autowired;
import com.example.PublishingService.models.Bike;
import com.example.PublishingService.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
//import com.example.PublishingService.repositories.BikeRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @Autowired
    private BikeRepository bikeRepository;
        @GetMapping
        public  List<Bike> list(){
          //  List<Bike> bikes = new ArrayList<>();
            return bikeRepository.findAll();
        }

        @PostMapping
        @ResponseStatus(HttpStatus.OK)
        public void create(@RequestBody Bike bike){
            bikeRepository.save(bike);
        }

        @GetMapping("/{id}")
         public Bike  get(@PathVariable("id") long id) {

           return bikeRepository.getOne(id);

        }
    }

