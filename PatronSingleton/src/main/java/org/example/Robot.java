package org.example;

public class Robot {
    private String nombre;
    private byte vidas;

    private static Robot instancia;

    private Robot(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getVidas() {
        return vidas;
    }

    public void setVidas(byte vidas) {
        this.vidas = vidas;
    }

    public static Robot getInstancia(){
        if (instancia == null){
            instancia = new Robot();
        }
        return instancia;
    }
}
