package com.equipo.tareas;

public class Tarea {
    private String titulo;
    private String descripcion;
    private String estado;

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = "pendiente";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Tarea: " + titulo + " - " + descripcion + " | Estado: " + estado;
    }

    public void marcarComoCompletada() {
        this.estado = "completada";
    }

}