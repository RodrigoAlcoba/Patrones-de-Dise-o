package org.example;

public class GaleriaProxy implements GaleriaInt{

    private GaleriaService galeriaService;
    @Override
    public Foto cargarImagen(Foto foto) {
        if (galeriaService == null){
            galeriaService = new GaleriaService();
        }
        if (foto.getLargo() * foto.getAncho() >100){
            System.out.println("Imagen sin mostrar");
            return null;
        }
        return galeriaService.cargarImagen(foto);
    }
}
