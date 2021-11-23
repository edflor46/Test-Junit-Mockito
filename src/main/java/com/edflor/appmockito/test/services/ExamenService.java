package com.edflor.appmockito.test.services;

import com.edflor.appmockito.test.models.Examen;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);
}
