package com.sportcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportcenter.dto.PrenotazioneRequest;
import com.sportcenter.model.Prenotazione;
import com.sportcenter.repository.PrenotazioneRepository;

@RequestMapping("/api/prenotazioni")
@RestController
public class PrenotazioneController {
     @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @GetMapping
    public List<Prenotazione> getAllPrenotazioni() {
        return prenotazioneRepository.findAll();
    }

    @GetMapping("/{id}")
    public Prenotazione getPrenotazioneById(@PathVariable Long id) {
        return prenotazioneRepository.findById(id).get();
    }

    @PostMapping("/{prenotazioneId}/campi")
    public Prenotazione createPrenotazione(@RequestBody PrenotazioneRequest prenotazioneRequest){
       
    //public ResponseEntity<Playlist> addCanzoneToPlaylist(@PathVariable Long playlistId, {
        //Playlist updatedPlaylist = playlistService.addCanzoneToPlaylist(playlistId, request.getCanzoneId());



        return prenotazioneService.create(prenotazioneRequest);
    }

     @DeleteMapping("/{id}")
    public void deletePrenotazione(@PathVariable Long id){
        prenotazioneRepository.deleteById(id);
    }

  
    
}
