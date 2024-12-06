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

import com.sportcenter.model.CampoSportivo;
import com.sportcenter.repository.CampoSportivoRepository;

@RequestMapping("/api/campi")
@RestController
public class CampoSportivoController {
     @Autowired
    private CampoSportivoRepository camposportivoRepository;

    @GetMapping
    public List<CampoSportivo> getAllCampiSportivi() {
        return camposportivoRepository.findAll();
    }

    @GetMapping("/{id}")
    public CampoSportivo getCampoSportivoById(@PathVariable Long id) {
        return camposportivoRepository.findById(id).get();
    }

    @PostMapping
    public CampoSportivo createCampoSportivo(@RequestBody CampoSportivo camposportivo){
        return camposportivoRepository.save(camposportivo);
    }

     @DeleteMapping("/{id}")
    public void deleteCampoSportivo(@PathVariable Long id){
        camposportivoRepository.deleteById(id);
    }
}
