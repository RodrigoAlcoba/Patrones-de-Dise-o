package org.example.controlador;

import org.example.data.IProductoService;
import org.example.data.ProductoService;
import org.example.modelo.Producto;
import org.example.vista.VistaAgregar;
import org.example.vista.VistaListar;

import java.util.List;

public class ProductoController {
    private IProductoService service;

    public ProductoController(){
        service = new ProductoService();
    }

    public void addProducto(Producto producto){
        service.addProducto(producto);
    }

    public void deleteProducto(int id){
        service.deleteProducto(id);
    }
    public List<Producto> getAllProductos(){
        return service.getAllProductos();
    }

    public void updateProducto(Producto producto){
        service.updateProducto(producto);
    }

    public void showVistaAgregar(){
        new VistaAgregar(this).setVisible(true);
    }

    public void showVistaListar(){
        new VistaListar(this).setVisible(true);
    }
}
