package org.example;

public class GaleriaService implements GaleriaInt{

    @Override
    public Foto cargarImagen(Foto foto) {
        System.out.println("Cargando una imagen de " + foto.getAncho() * foto.getLargo());
        return foto;
    }
}
