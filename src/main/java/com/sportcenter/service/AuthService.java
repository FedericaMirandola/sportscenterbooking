
package com.sportcenter.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sportcenter.dto.AuthRequest;
import com.sportcenter.dto.RegisterUserRequest;
import com.sportcenter.model.Ruolo;
import com.sportcenter.model.Utente;
import com.sportcenter.repository.RuoloRepository;
import com.sportcenter.repository.UtenteRepository;

@Service
public class AuthService {

    @Autowired
    private RuoloRepository ruoloRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(RegisterUserRequest registerUserRequest) {
        registerUserRequest.setPassword(passwordEncoder.encode(registerUserRequest.getPassword()));
        Utente utente = new Utente();

        utente.setUsername(registerUserRequest.getUsername());
        utente.setEmail(registerUserRequest.getEmail());
        utente.setPassword(passwordEncoder.encode(registerUserRequest.getPassword()));
        Optional<Ruolo> ruolo = ruoloRepository.findByRuolo(registerUserRequest.getRuolo());


        utenteRepository.save(utente);

        if(utente.getRuoli().add(ruolo.get())) {
            utenteRepository.save(utente);
        }
    }

    public String login(AuthRequest authRequest) {
        // Validazione dell'utente e generazione del token JWT (da implementare)
        return "token_jwt";
    }

    
}
