package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stock {



    private List<String> productos = new ArrayList<>();
    private boolean disponible;

    public Stock() {
        productos.add("banana");
        productos.add("manzana");
    }

    public boolean productoDisponible(String producto) {
        disponible = productos.contains(producto);
        if (disponible) {
            System.out.println("Producto disponible");
        } else {
            System.out.println("Producto no disponible");
        }
        return disponible;
    }

    public void addProducto(String producto) {
        productos.add(producto);
        System.out.println("Producto agregado al Stock");
    }
}
