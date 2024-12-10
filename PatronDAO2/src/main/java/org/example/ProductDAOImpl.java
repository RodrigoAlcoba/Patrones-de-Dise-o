package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDAOImpl implements ProductDAO{

    private List<Product> products = new ArrayList<>();
    private  int nextId = 1;
    @Override
    public void createProduct(String nombre, double precio) {
        Product product = new Product();
        product.setId(nextId);
        product.setName(nombre);
        product.setPrice(precio);
        products.add(product);
        nextId++;
    }

    @Override
    public Product readProduct(int id) {
        for (Product productos: products) {
            if(productos.getId() == id){
                System.out.println(productos.toString());
            }
        }
        return null;
    }

    @Override
    public void updateProduct(int id) {
        for (Product productos: products) {
            if (productos.getId() == id){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Elija el nuevo nombre del Producto");
                String nombre = scanner.nextLine();
                System.out.println("Elija el nuevo Precio del Producto");
                Double precio = Double.valueOf(scanner.nextLine());

                productos.setName(nombre);
                productos.setPrice(precio);
                System.out.println("Producto de id: " + id + " actualizado con éxito");
                return;
            }

        }
        System.out.println("Producto no encontrado con ese ID");
    }

    @Override
    public void delete(int id) {
        for (Product productos: products) {
            if (productos.getId() == id){
                products.remove(productos);
                System.out.println("Producto eliminado");
                return;
            }
        }
        System.out.println("Producto no encontrado con ese id");
    }

    @Override
    public List<Product> getAllProduct() {
        for (Product product :
             products) {
            System.out.println(product.toString());
        }
        return products;
    }


}
