package org.example;

public class AvionDirector {

    private AvionBuilder builder;

    public AvionDirector(AvionBuilder builder) {
        this.builder = builder;
    }

    public Avion construir(String modelo, int capacidad, double velocidad){
        builder.construirConcreto(modelo, capacidad, velocidad);

        return builder.obtenerAvion();
    }
}
