package com.edflor.appmockito.test.services;

import com.edflor.appmockito.test.models.Examen;

import java.util.Optional;

public interface ExamenService {
    Optional<Examen> findExamenPorNombre(String nombre);
}
