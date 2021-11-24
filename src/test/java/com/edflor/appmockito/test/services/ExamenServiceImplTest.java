package com.edflor.appmockito.test.services;

import com.edflor.appmockito.test.models.Examen;
import com.edflor.appmockito.test.repositorios.ExamenRepository;
import com.edflor.appmockito.test.repositorios.ExamenRepositoryOtro;
import com.edflor.appmockito.test.repositorios.PreguntaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ExamenServiceImplTest {

    ExamenRepository repository;
    ExamenService service;
    PreguntaRepository preguntaRepository;

    @BeforeEach
    void setUp() {
        repository = mock(ExamenRepository.class);
        preguntaRepository = mock(PreguntaRepository.class);
        service = new ExamenServiceImpl(repository, preguntaRepository);

    }

    @Test
    void findExamenPorNombre() {

        List<Examen> datos = Arrays.asList(new Examen(5L, "Matematicas"),
                new Examen(6L, "Lenguaje"),
                new Examen(7L, "Historia"));

        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Matematicas");



        assertTrue(examen.isPresent());
        assertEquals(5L, examen.get().getId());
        assertEquals("Matematicas", examen.get().getNombre());
    }

    @Test
    void findExamenPorNombreEmpty() {
       /* ExamenRepository repository = mock(ExamenRepository.class);
        ExamenService service = new ExamenServiceImpl(repository);*/
        List<Examen> datos = Collections.emptyList();

        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Matematicas");

        assertFalse(examen.isPresent());

        /*assertTrue(examen.isPresent());
        assertEquals(5L, examen.get().getId());
        assertEquals("Matematicas", examen.get().getNombre());*/
    }
}