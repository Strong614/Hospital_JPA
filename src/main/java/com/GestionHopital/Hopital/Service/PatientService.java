package com.GestionHopital.Hopital.Service;

import java.util.List;

import com.GestionHopital.Hopital.Model.ModelPatient;

public interface PatientService {

    List<ModelPatient> getAllPatients();

    ModelPatient getPatientById(Long id);

    ModelPatient savePatient(ModelPatient patient);

    ModelPatient updatePatient(ModelPatient patient);

    void deletePatientById(Long id);
}
