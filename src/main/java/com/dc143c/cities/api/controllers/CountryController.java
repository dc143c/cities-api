package com.dc143c.cities.api.controllers;

import com.dc143c.cities.api.model.Country;
import com.dc143c.cities.api.repository.CountryRepository;
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
@RequestMapping("/api/v1/countries")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public Page<Country> getAllCountries(Pageable page){
        return countryRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getCountriesById(@PathVariable Long id){
        Optional<Country> foundCountry = countryRepository.findById(id);
        if(foundCountry.isPresent()){
            return ResponseEntity.ok().body(foundCountry.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
