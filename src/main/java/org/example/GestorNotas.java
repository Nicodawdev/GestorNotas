package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestorNotas {
    // Colección interna para almacenar las notas en memoria
    private List<Nota> notas = new ArrayList<>();

    // Método añadido en la FASE 4: Alta de notas
    public void agregarNota(String titulo, String contenido, boolean importante) {
        // Generar un ID automáticamente (el tamaño de la lista + 1)
        int nuevoId = notas.size() + 1;

        // Crear la nueva nota
        Nota nuevaNota = new Nota(nuevoId, titulo, contenido, importante);

        // Almacenar la nota en memoria
        notas.add(nuevaNota);

        System.out.println("Nota añadida con éxito.");
    }

    // Método temporal de la Fase 2 (opcional, para comprobar la estructura)
    public List<Nota> getNotas() {
        return notas;
    }
}
