package org.example;

import java.util.List;

public interface LibroDAO {
    void agregarLibro(Libro libro);
    Libro obtenerLibroPorId(int id);
    List<Libro> obtenerTodosLibros();
    void actualizarLibro(Libro libro);
    void eliminarLibro(int id);

}
