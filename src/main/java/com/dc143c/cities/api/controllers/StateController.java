package com.dc143c.cities.api.controllers;

import com.dc143c.cities.api.model.State;
import com.dc143c.cities.api.repository.StateRepository;
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
@RequestMapping("/api/v1/states")
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public Page<State> getAllStates(Pageable page){
        return stateRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getStateById(@PathVariable Long id){
        Optional<State> foundState = stateRepository.findById(id);
        if(foundState.isPresent()){
            return ResponseEntity.ok().body(foundState.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
