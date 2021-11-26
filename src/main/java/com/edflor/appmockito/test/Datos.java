package com.edflor.appmockito.test;

import com.edflor.appmockito.test.models.Examen;

import java.util.Arrays;
import java.util.List;

public class Datos {
    public static final List<Examen> EXAMENES = Arrays.asList(new Examen(5L, "Matematicas"),
            new Examen(6L, "Lenguaje"),
            new Examen(7L, "Historia"));

    public static final List<Examen> EXAMENES_ID_NULL = Arrays.asList(new Examen(null, "Matematicas"),
            new Examen(null, "Lenguaje"),
            new Examen(null, "Historia"));

    public static final List<Examen> EXAMENES_ID_NEGATIVO= Arrays.asList(new Examen(-5L, "Matematicas"),
            new Examen(-6L, "Lenguaje"),
            new Examen(-7L, "Historia"));

    public static final List<String> PREGUNTAS = Arrays.asList("Aritmetica", "Integrales", "Derivadas", "Trigonometria",
            "Geometria", "Geografia", "Historia", "Taller");

    public static final Examen EXAMEN = new Examen(null, "Fisica");
}
