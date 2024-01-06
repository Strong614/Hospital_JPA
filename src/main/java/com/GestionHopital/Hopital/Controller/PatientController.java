package com.GestionHopital.Hopital.Controller;

import com.GestionHopital.Hopital.Model.ModelPatient;
import com.GestionHopital.Hopital.Service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        super();
        this.patientService = patientService;
    }

    @GetMapping("/Patients")
    public String listPatients(Model model) {
        List<ModelPatient> patients = patientService.getAllPatients();
        model.addAttribute("Patients", patients);
        return "HopitalPatient";
    }

    @GetMapping("/Patients/new")
    public String createPatientForm(Model model) {
        ModelPatient patient = new ModelPatient();
        model.addAttribute("patient", patient);
        return "new_patient";
    }

    @PostMapping("/Patients")
    public String savePatient(@ModelAttribute("patient") ModelPatient patient) {
        patientService.savePatient(patient);
        return "redirect:/Patients";
    }

    @GetMapping("/Patients/edit/{id}")
    public String editPatientForm(@PathVariable Long id, Model model) {
        model.addAttribute("patient", patientService.getPatientById(id));
        return "update_patient";
    }

    @PostMapping("/Patients/{id}")
    public String updatePatient(@PathVariable Long id,
                                @ModelAttribute("patient") ModelPatient patient,
                                Model model) {
        ModelPatient existingPatient = patientService.getPatientById(id);
        existingPatient.setId(id);
        existingPatient.setPatient_name(patient.getPatient_name());
        existingPatient.setPatient_type(patient.getPatient_type());
        existingPatient.setIllness(patient.getIllness());
        existingPatient.setContactNumber(patient.getContactNumber());
        existingPatient.setAddress(patient.getPatient_type());
        // save updated student object
        patientService.updatePatient(existingPatient);
        return "redirect:/Patients";
    }

    @GetMapping("/Patients/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientService.deletePatientById(id);
        return "redirect:/Patients";
    }
}
