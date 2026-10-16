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

    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        System.out.println("=== Lista de tareas ===");
        for (int i = 0; i < listaTareas.size(); i++) {
            Tarea t = listaTareas.get(i);
            System.out.println((i + 1) + ". " + t.getTitulo() + " - " + t.getDescripcion()
                    + " | Estado: " + t.getEstado());
        }
    }

    // Axel agrega aquí el método completarTarea() en tu rama
}