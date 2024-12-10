package org.example;

import java.util.List;

public interface ProductDAO {
    void createProduct(String nombre, double precio);
    Product readProduct(int id);
    void updateProduct(int id);
    void delete(int id);
    List<Product> getAllProduct();
}
