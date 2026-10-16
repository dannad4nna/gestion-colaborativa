package com.equipo.tareas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion = 0;

        System.out.println("--- SISTEMA DE GESTIÓN DE TAREAS ---");

        while (opcion != 4) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Registrar nueva tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingresa un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    ingresarDatosTarea(scanner, gestor);
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    System.out.println("Funcionalidad 'Completar tarea' pendiente de integrar...");
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
        scanner.close();
    }

    private static void ingresarDatosTarea(Scanner scanner, GestorTareas gestor) {
        System.out.println("\n--- Registro de nueva tarea ---");
        System.out.print("Ingresa el título: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingresa la descripción: ");
        String descripcion = scanner.nextLine();

        Tarea nuevaTarea = new Tarea(titulo, descripcion);
        gestor.registrarTarea(nuevaTarea);
    }
}