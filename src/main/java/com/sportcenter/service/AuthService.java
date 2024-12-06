
package com.sportcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sportcenter.dto.AuthRequest;
import com.sportcenter.model.Utente;
import com.sportcenter.repository.UtenteRepository;

@Service
public class AuthService {

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(Utente utente) {
        utente.setPassword(passwordEncoder.encode(utente.getPassword()));
        utenteRepository.save(utente);
    }

    public String login(AuthRequest authRequest) {
        // Validazione dell'utente e generazione del token JWT (da implementare)
        return "token_jwt";
    }
}
