package com.GestionHopital.Hopital.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.GestionHopital.Hopital.Model.ModelHopital;
import com.GestionHopital.Hopital.Service.HopitalService;

@Controller
public class HopitalController {

    private HopitalService hopitalService;

    public HopitalController(HopitalService hopitalService) {
        super();
        this.hopitalService = hopitalService;
    }

    // handler method to handle list students and return mode and view
    @GetMapping("/Actors")
    public String listActors(Model model) {
        model.addAttribute("Hopital", hopitalService.getAllActors());
        return "Hopital";
    }

    @GetMapping("/Actors/new")
    public String createActorForm(Model model) {

        // create student object to hold student form data
        ModelHopital actor = new ModelHopital();
        model.addAttribute("actor", actor);
        return "new_actor";

    }

    @PostMapping("/Actors")
    public String saveActors(@ModelAttribute("actor") ModelHopital actor) {
        hopitalService.saveActor(actor);
        return "redirect:/Actors";
    }

    @GetMapping("/Actors/edit/{id}")
    public String editActorForm(@PathVariable Long id, Model model) {
        model.addAttribute("actor", hopitalService.getActorById(id));
        return "update_actor";
    }

    @PostMapping("/Actors/{id}")
    public String updateActor(@PathVariable Long id,
                                @ModelAttribute("actor") ModelHopital actor,
                                Model model) {

        // get student from database by id
        ModelHopital existingActor = hopitalService.getActorById(id);
        existingActor.setId(id);
        existingActor.setActor_name(actor.getActor_name());
        existingActor.setActor_type(actor.getActor_type());
        existingActor.setSpecialization(actor.getSpecialization());
        existingActor.setContactNumber(actor.getContactNumber());
        existingActor.setAddress(actor.getActor_type());
        // save updated student object
        hopitalService.updateActor(existingActor);
        return "redirect:/Actors";
    }

    // handler method to handle delete student request

    @GetMapping("/Actors/{id}")
    public String deleteActor(@PathVariable Long id) {
        hopitalService.deleteActorById(id);
        return "redirect:/Actors";
    }


}
