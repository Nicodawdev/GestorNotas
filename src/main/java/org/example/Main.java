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
            sc.nextLine(); // Limpiar el salto de línea

            if (opcion == 1) {
                String titulo;
                do {
                    System.out.print("Título (obligatorio): ");
                    titulo = sc.nextLine().trim();
                } while (titulo.isEmpty());

                String contenido;
                do {
                    System.out.print("Contenido (obligatorio): ");
                    contenido = sc.nextLine().trim();
                } while (contenido.isEmpty());

                String impStr;
                do {
                    System.out.print("¿Es importante? (s/n): ");
                    impStr = sc.nextLine().trim().toLowerCase();
                } while (!impStr.equals("s") && !impStr.equals("n"));

                boolean importante = impStr.equals("s");

                gestor.agregarNota(titulo, contenido, importante);
            }
        } while (opcion != 0);

        System.out.println("Saliendo...");
        sc.close();
    }
}