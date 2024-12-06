package com.sportcenter.dto;

import java.time.LocalDateTime;

public class PrenotazioneRequest {

    private LocalDateTime dataOra;
    private String stato;
    private Long utenteId;
    private Long campoSportivoId;

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public Long getUtenteId() {
        return utenteId;
    }

    public void setUtenteId(Long utenteId) {
        this.utenteId = utenteId;
    }

    public Long getCampoSportivoId() {
        return campoSportivoId;
    }

    public void setCampoSportivoId(Long campoSportivoId) {
        this.campoSportivoId = campoSportivoId;
    }
    
}
