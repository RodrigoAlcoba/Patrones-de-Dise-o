package org.example;

public class Avion {
    private String modelo;
    private int capacidad;
    private double velocidad;

    public Avion(String modelo, int capacidad, double velocidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad +
                ", velocidad=" + velocidad +
                '}';
    }
}
