package com.sportcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportcenter.model.Ruolo;

@Repository
public interface RuoloRepository extends JpaRepository<Ruolo, Long>  {
    
}
