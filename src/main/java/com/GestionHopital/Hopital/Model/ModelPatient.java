package com.GestionHopital.Hopital.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "hospital_patients")
public class ModelPatient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "patient_name", nullable = false)
    private String patient_name;
    @Column(name = "patient_type")
    private String patient_type;
    @Column(name = "illness")
    private String illness;
    @Column(name = "contactNumber")
    private String contactNumber;
    @Column(name = "address")
    private String address;

    public ModelPatient(){

    }

    public ModelPatient(String patient_name, String patient_type, String illness, String contactNumber, String address){
        super();
        this.patient_name = patient_name;
        this.patient_type = patient_type;
        this.illness = illness;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_type() {
        return patient_type;
    }

    public void setPatient_type(String patient_type) {
        this.patient_type = patient_type;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
