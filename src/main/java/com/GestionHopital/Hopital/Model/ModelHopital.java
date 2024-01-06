package com.GestionHopital.Hopital.Model;

import jakarta.persistence.*;



@Entity
@Table(name = "hospital_actors")
public class ModelHopital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name = "actor_name", nullable = false)
    private String actor_name;

    @Column(name = "actor_type")
    private String actor_type;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "address")
    private String address;

    public ModelHopital() {

    }

    public ModelHopital(String actor_name, String actor_type, String specialization, String contactNumber, String address) {
        super();
        this.actor_name = actor_name;
        this.actor_type = actor_type;
        this.specialization = specialization;
        this.contactNumber = contactNumber;
        this.address = address;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getActor_name() {
        return actor_name;
    }
    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }
    public String getActor_type() {
        return actor_type;
    }
    public void setActor_type(String actor_type) {
        this.actor_type = actor_type;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
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
