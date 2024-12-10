package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        OperacionFactory factory = new OperacionFactory();
        Operacion suma = factory.crearOperacion("+");
        double resultado1 = suma.calcular(5, 3);
        System.out.println("Resultado de la suma: " + resultado1);
    }
}
