package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String tarjeta = "123456";
        String producto = "banana";

        TiendaFacade tiendaFacade = new TiendaFacade();

        tiendaFacade.realizarCompra(tarjeta,producto);
    }
}
