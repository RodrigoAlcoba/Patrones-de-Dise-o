package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AvionBuilder builder = new AvionBuilderConcreto();
        AvionDirector director = new AvionDirector(builder);

        Avion avion = director.construir("Boeing 747", 416, 0.855);


        System.out.println( "Modelo Avion: "+ avion.getModelo());
        System.out.println("Capacidad Avion: "+ avion.getCapacidad());
        System.out.println("Velocidad Avion: "+ avion.getVelocidad());
    }
}
