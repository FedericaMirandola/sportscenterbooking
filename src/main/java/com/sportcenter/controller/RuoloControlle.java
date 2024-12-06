package com.sportcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportcenter.model.Ruolo;
import com.sportcenter.repository.RuoloRepository;

@RequestMapping("/api/ruoli")
@RestController
public class RuoloControlle {
    
     @Autowired
    private RuoloRepository ruoloRepository;

   @GetMapping
    public List<Ruolo> getAllRuolo() {
        return ruoloRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ruolo getRuoloById(@PathVariable Long id) {
        return ruoloRepository.findById(id).get();
    }

    @PostMapping
    public Ruolo createRuolo(@RequestBody Ruolo ruolo){
        return ruoloRepository.save(ruolo);
    }

     @DeleteMapping("/{id}")
    public void deleteRuolo(@PathVariable Long id){
        ruoloRepository.deleteById(id);
    }
}
