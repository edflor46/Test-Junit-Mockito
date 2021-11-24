package com.edflor.appmockito.test.services;

import com.edflor.appmockito.test.models.Examen;

import java.util.Arrays;
import java.util.List;

public class Datos {
    public static final List<Examen> EXAMENES = Arrays.asList(new Examen(5L, "Matematicas"),
            new Examen(6L, "Lenguaje"),
            new Examen(7L, "Historia"));

    public static final List<String> PREGUNTAS = Arrays.asList("Aritmetica", "Integrales", "Derivadas", "Trigonometria",
            "Geometria", "Geografia", "Historia", "Taller");
}
