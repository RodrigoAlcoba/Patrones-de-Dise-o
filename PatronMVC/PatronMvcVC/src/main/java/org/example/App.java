package org.example;

import org.example.controlador.ProductoController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        JFrame mainFrame = new JFrame("Gestion de Productos");
        mainFrame.setSize(300,150);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setLayout(new FlowLayout());

        ProductoController controller = new ProductoController();

        JButton btnAgregar = new JButton("Agregar Producto");

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.showVistaAgregar();
            }
        });

        JButton btnListar = new JButton("Listar Producto");

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.showVistaListar();
            }
        });

        mainFrame.add(btnAgregar);
        mainFrame.add(btnListar);
        mainFrame.setVisible(true);
    }
}
