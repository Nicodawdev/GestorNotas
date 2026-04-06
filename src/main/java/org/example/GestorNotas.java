package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestorNotas {
    private List<Nota> notas = new ArrayList<>();

    public void agregarNota(String titulo, String contenido, boolean importante) {
        int nuevoId = notas.size() + 1;
        Nota nuevaNota = new Nota(nuevoId, titulo, contenido, importante);
        notas.add(nuevaNota);
        System.out.println("Nota añadida con éxito.");
    }

    // NUEVO MÉTODO AÑADIDO EN FASE 8
    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas guardadas.");
        } else {
            for (Nota nota : notas) {
                System.out.println(nota);
            }
        }
    }
}
