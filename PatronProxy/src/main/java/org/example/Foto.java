package org.example;

public class Foto {
    private int largo;
    private int ancho;

    public Foto(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Foto{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}
