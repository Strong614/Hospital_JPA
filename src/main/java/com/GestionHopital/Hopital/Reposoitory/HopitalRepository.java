package com.GestionHopital.Hopital.Reposoitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionHopital.Hopital.Model.ModelHopital;


public interface HopitalRepository extends JpaRepository<ModelHopital, Long>{

}
