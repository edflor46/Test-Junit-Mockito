package com.edflor.appmockito.test.repositorios;

import com.edflor.appmockito.test.models.Examen;

import java.util.List;

public interface ExamenRepository {

    Examen guardar(Examen examen);


    List<Examen> findAll();
}
