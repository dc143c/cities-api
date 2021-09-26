package com.dc143c.cities.api.controllers;

import com.dc143c.cities.api.model.City;
import com.dc143c.cities.api.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cities")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public Page<City> getAllCities(Pageable page){
        return cityRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getCitiesById(@PathVariable Long id){
        Optional<City> foundCity = cityRepository.findById(id);
        if(foundCity.isPresent()){
            return ResponseEntity.ok().body(foundCity.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
