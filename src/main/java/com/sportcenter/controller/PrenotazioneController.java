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

import com.sportcenter.dto.PrenotazioneRequest;
import com.sportcenter.dto.PrenotazioneResponse;
import com.sportcenter.model.Prenotazione;
import com.sportcenter.repository.PrenotazioneRepository;
import com.sportcenter.service.PrenotazioneService;

@RequestMapping("/api/prenotazioni")
@RestController
public class PrenotazioneController {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired
    private PrenotazioneService prenotazioneService;

    @GetMapping
    public List<Prenotazione> getAllPrenotazioni() {
        return prenotazioneRepository.findAll();
    }

    @GetMapping("/{id}")
    public Prenotazione getPrenotazioneById(@PathVariable Long id) {
        return prenotazioneRepository.findById(id).get();
    }

    @PostMapping
    public PrenotazioneResponse create(@RequestBody PrenotazioneRequest prenotazioneRequest) {

        Prenotazione prenotazione = prenotazioneService.create(prenotazioneRequest);

        PrenotazioneResponse response = mapToResponse(prenotazione);
        return response;
    }

    @DeleteMapping("/{id}")
    public void deletePrenotazione(@PathVariable Long id) {
        prenotazioneRepository.deleteById(id);
    }

    private PrenotazioneResponse mapToResponse(Prenotazione prenotazione) {

        PrenotazioneResponse response = new PrenotazioneResponse();

        response.setId(prenotazione.getId());
        response.setStato(prenotazione.getStato());
        response.setCamposportivoId(prenotazione.getCamposportivo().getId());
        response.setUtenteId(prenotazione.getUtente().getId());
        response.setDataOra(prenotazione.getDataOra());

        return response;

    }

}
