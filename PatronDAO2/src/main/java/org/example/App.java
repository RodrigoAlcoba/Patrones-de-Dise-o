package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       ProductDAO metodos = new ProductDAOImpl();


       metodos.createProduct("Television", 200);

       metodos.createProduct("Hola", 100);

       metodos.readProduct(1);
       metodos.updateProduct(1);
       metodos.getAllProduct();
       metodos.delete(1);
       metodos.getAllProduct();
    }
}
