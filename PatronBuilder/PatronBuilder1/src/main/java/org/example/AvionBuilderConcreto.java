package org.example;

public class AvionBuilderConcreto implements AvionBuilder{
private Avion avion;

    public AvionBuilderConcreto() {
        this.avion = new Avion("",0,0.0);
    }

    @Override
    public void construirConcreto(String modelo, int capacidad, double velocidad) {
        avion.setModelo(modelo);
        avion.setCapacidad(capacidad);
        avion.setVelocidad(velocidad);
    }

    @Override
    public Avion obtenerAvion() {
        return avion;
    }
}
