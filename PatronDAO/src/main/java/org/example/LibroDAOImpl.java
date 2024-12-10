package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibroDAOImpl implements LibroDAO{
    private Map<Integer, Libro> libros = new HashMap<>();
    private int nextId = 1;
    @Override
    public void agregarLibro(Libro libro) {
        libro.setId(nextId);
        libros.put(nextId,libro);
        nextId++;
    }

    @Override
    public Libro obtenerLibroPorId(int id) {
        return libros.get(id);
    }

    @Override
    public List<Libro> obtenerTodosLibros() {
        return new ArrayList<>(libros.values());
    }

    @Override
    public void actualizarLibro(Libro libro) {
libros.put(libro.getId(), libro);
    }

    @Override
    public void eliminarLibro(int id) {
        libros.remove(id);

    }
}
