package org.example;

public class ProductMapper {
    public static ProductoDto toDto(Product product) {
        ProductoDto producto = new ProductoDto();
        producto.setId(product.getId());
        producto.setNombre(product.getNombre());
        producto.setPrecio(product.getPrecio());

        return producto;
    }

    public static Product toEntity(ProductoDto productoDto){
        Product producto = new Product();
        producto.setId(productoDto.getId());
        producto.setNombre(productoDto.getNombre());
        producto.setPrecio(productoDto.getPrecio());

        return producto;
    }
}
