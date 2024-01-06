package com.GestionHopital.Hopital.Service;

import java.util.List;
import com.GestionHopital.Hopital.Model.ModelHopital;

public interface HopitalService {
    List<ModelHopital> getAllActors();

    ModelHopital saveActor(ModelHopital actor);

    ModelHopital getActorById(Long id);

    ModelHopital updateActor(ModelHopital actor);

    void deleteActorById(Long id);
}
