package org.example.data;

import org.example.modelo.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoService implements  IProductoService {

    private Connection connection;

    public ProductoService() {
        connection = DataManager.getConnection();
    }

    @Override
    public void addProducto(Producto producto) {
        String sql = "INSERT INTO productos (nombre, precio, descripcion) VALUES (?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, producto.getNombre());
            statement.setDouble(2, producto.getPrecio());
            statement.setString(3, producto.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al agregar el producto: " + e.getMessage());
        }
    }

    @Override
    public void updateProducto(Producto producto) {
        String sql = "UPDATE productos SET nombre = ?, precio = ?, descripcion = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, producto.getNombre());
            statement.setDouble(2, producto.getPrecio());
            statement.setString(3, producto.getDescripcion());
            statement.setInt(4, producto.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al actualizar el producto: " + e.getMessage());
        }
    }

    @Override
    public void deleteProducto(int id) {
        String sql = "DELETE FROM productos WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(4, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar el producto: " + e.getMessage());
        }

    }

    @Override
    public List<Producto> getAllProductos() {
        List<Producto> productos = new ArrayList<>();

        String sql = "SELECT id, nombre, precio, descripcion FROM productos";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            Producto producto;
            while (rs.next()) {
                producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setDescripcion(rs.getString("descripcion"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar el producto: " + e.getMessage());
        }
        return productos;
    }
}
