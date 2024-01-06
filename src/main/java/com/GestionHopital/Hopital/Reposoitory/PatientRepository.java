package com.GestionHopital.Hopital.Reposoitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionHopital.Hopital.Model.ModelPatient;

public interface PatientRepository extends JpaRepository<ModelPatient, Long>{

}
