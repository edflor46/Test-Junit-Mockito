package com.edflor.appmockito.test.repositorios;

import com.edflor.appmockito.test.Datos;
import com.edflor.appmockito.test.models.Examen;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenRepositoryImpl implements ExamenRepository{
    @Override
    public Examen guardar(Examen examen) {
        System.out.println("ExamenRepositoryImpl.guardar");
        return  Datos.EXAMEN;
    }

    @Override
    public List<Examen> findAll() {
        try {
            System.out.println("ExamenRepositoryImpl.findAll");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
