package com.equipo.tareas;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }


    public void registrarTarea(Tarea tarea) {
        listaTareas.add(tarea);
        System.out.println("Éxito: Se ha registrado la tarea -> " + tarea.getTitulo() + " (Estado: " + tarea.getEstado() + ")");
    }

    // Danna agrega aquí el método listarTareas() en tu rama

    // Axel agrega aquí el método completarTarea() en tu rama
}