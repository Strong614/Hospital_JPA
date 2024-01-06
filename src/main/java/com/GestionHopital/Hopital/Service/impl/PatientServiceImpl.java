package com.GestionHopital.Hopital.Service.impl;

import java.util.List;

import com.GestionHopital.Hopital.Reposoitory.PatientRepository;
import com.GestionHopital.Hopital.Service.PatientService;
import org.springframework.stereotype.Service;
import com.GestionHopital.Hopital.Model.ModelPatient;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository repopatient;

    public PatientServiceImpl(PatientRepository patientrepository) {
        super();
        this.repopatient = patientrepository;
    }

    @Override
    public List<ModelPatient> getAllPatients() {
        return repopatient.findAll();
    }


    @Override
    public ModelPatient savePatient(ModelPatient patient) {return repopatient.save(patient);}

    @Override
    public ModelPatient getPatientById(Long id) {return repopatient.findById(id).get();}

    @Override
    public ModelPatient updatePatient(ModelPatient patient){ return repopatient.save(patient); }

    @Override
    public void deletePatientById(Long id) {repopatient.deleteById(id); }
}