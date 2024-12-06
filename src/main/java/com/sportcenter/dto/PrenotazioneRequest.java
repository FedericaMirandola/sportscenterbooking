package com.sportcenter.dto;

import java.time.LocalDateTime;

public class PrenotazioneRequest {

    private LocalDateTime dataOra;
    private String stato;
    private Long utenteId;
    private Long camposportivoId;

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

    public Long getCamposportivoId() {
        return camposportivoId;
    }

    public void setCamposportivoId(Long camposportivoId) {
        this.camposportivoId = camposportivoId;
    }
    
}
