package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Foto foto1 = new Foto(20, 20);

      Foto foto2 = new Foto(2,10);

      GaleriaInt proxy = new GaleriaProxy();

      proxy.cargarImagen(foto1);
      proxy.cargarImagen(foto2);

    }
}
