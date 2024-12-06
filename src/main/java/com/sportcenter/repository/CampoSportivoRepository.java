package com.sportcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportcenter.model.CampoSportivo;

@Repository
public interface CampoSportivoRepository extends JpaRepository<CampoSportivo, Long>{

    
} 
    

