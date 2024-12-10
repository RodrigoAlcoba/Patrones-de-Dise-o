package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List getAllProducts() {
        List<ProductoDto> productos = new ArrayList<>();

        ProductoDto Auto = new ProductoDto();
        Auto.setId(1);
        Auto.setNombre("Lamborgini");
        Auto.setPrecio(2000);

        Product moto = new Product();
        moto.setId(2);
        moto.setNombre("pollerita");
        moto.setPrecio(1000);

        productos.add((Auto));
        productos.add(ProductMapper.toDto(moto));



        return productos;
    }
}
