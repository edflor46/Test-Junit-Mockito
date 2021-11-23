package com.edflor.appmockito.test.services;

import com.edflor.appmockito.test.models.Examen;
import com.edflor.appmockito.test.repositorios.ExamenRepository;

import java.util.Optional;

public class ExamenServiceImpl implements ExamenService{
    private ExamenRepository examenRepository;

   public ExamenServiceImpl(ExamenRepository examenRepository){
        this.examenRepository = examenRepository;
    }

    @Override
    public Examen findExamenPorNombre(String nombre) {
        Optional<Examen> examenOptional = examenRepository.findAll()
                .stream()
                .filter(e -> e.getNombre().contains(nombre))
                .findFirst();
        Examen examen = null;
        if (examenOptional.isPresent()){
            examen = examenOptional.orElseThrow(null);
        }
        return examen;
    }
}
