package com.GestionHopital.Hopital.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.GestionHopital.Hopital.Model.ModelHopital;
import com.GestionHopital.Hopital.Reposoitory.HopitalRepository;
import com.GestionHopital.Hopital.Service.HopitalService;

@Service
public class HopitalServiceImpl implements HopitalService {

    private HopitalRepository repohopital;

    public HopitalServiceImpl(HopitalRepository hopitalrepository) {
        super();
        this.repohopital = hopitalrepository;
    }

    @Override
    public List<ModelHopital> getAllActors() {
        return repohopital.findAll();
    }

    @Override
    public ModelHopital saveActor(ModelHopital actor) {
        return repohopital.save(actor);
    }

    @Override
    public ModelHopital getActorById(Long id) {
        return repohopital.findById(id).get();
    }

    @Override
    public ModelHopital updateActor(ModelHopital actor) {
        return repohopital.save(actor);
    }

    @Override
    public void deleteActorById(Long id) {
        repohopital.deleteById(id);
    }




}
