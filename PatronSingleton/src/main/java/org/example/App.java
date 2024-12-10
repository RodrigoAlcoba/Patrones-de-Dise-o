package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Robot con = Robot.getInstancia();

        con.setNombre("Hola");
        con.setVidas((byte) 2);
 Robot con2 = Robot.getInstancia();

        System.out.println(con);
         boolean b1 = (con == con2);

        System.out.println(b1);

        con2.setNombre("holanda");
        con2.setVidas((byte)6);
        System.out.println(con.getNombre() + " " + con.getVidas());
    }
}
