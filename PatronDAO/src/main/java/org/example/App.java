package org.example;

import java.awt.*;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LibroDAO libroDAO = new LibroDAOImpl();
        Libro libro1 = new Libro();
        libro1.setTitulo("El Gran Gatsby");
        libro1.setAutor("F. Scott Fitzgerald");
        libroDAO.agregarLibro(libro1);
        Libro libro2 = new Libro();
        libro2.setTitulo("1984");
        libro2.setAutor("George Orwell");
        libroDAO.agregarLibro(libro2);
        List<Libro> libros = libroDAO.obtenerTodosLibros();
        for (Libro l : libros) {
            System.out.println("Libro: " + l.getTitulo() + " - Autor: " + l.getAutor());
        }
    }
}
