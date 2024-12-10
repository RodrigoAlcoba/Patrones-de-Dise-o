package org.example.data;

import org.example.modelo.Producto;

import java.util.List;

public interface IProductoService {
    void addProducto(Producto producto);
    void updateProducto(Producto producto);
    void deleteProducto(int id);
    List<Producto> getAllProductos();
}
