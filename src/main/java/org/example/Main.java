package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorNotas gestor = new GestorNotas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== GESTOR DE NOTAS ===");
            System.out.println("1. Añadir nota");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            if (opcion == 1) {
                System.out.print("Título: ");
                String titulo = sc.nextLine();
                System.out.print("Contenido: ");
                String contenido = sc.nextLine();
                System.out.print("¿Es importante? (true/false): ");
                boolean importante = sc.nextBoolean();

                gestor.agregarNota(titulo, contenido, importante);
            }
        } while (opcion != 0);
        System.out.println("Saliendo...");
    }
}