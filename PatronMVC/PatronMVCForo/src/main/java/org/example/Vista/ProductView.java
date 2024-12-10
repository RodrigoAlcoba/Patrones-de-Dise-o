package org.example.Vista;

import org.example.Modelo.Product;

import java.util.Scanner;

public class ProductView {
    private Scanner scanner;

    public ProductView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayProduct(Product product){
        System.out.println("El nombre del producto es: " + product.getName());
        System.out.println("El precio del producto es: " + product.getPrice());
    }

    public Product getProductInput(){
        
    }
}
