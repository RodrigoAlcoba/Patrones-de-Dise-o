package org.example.vista;

import org.example.controlador.ProductoController;
import org.example.modelo.Producto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaAgregar {
    private JFrame frame;
    private JTextField txtNombre;
    private JTextField txtPrecio;
    private JTextArea txtDescripcion;
    private JButton btnSave;
    private ProductoController controller;

    public  VistaAgregar(ProductoController controller){
        this.controller = controller;
        frame = new JFrame("Vista agregar");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(20, 50 ,100, 20);
        frame.add(lblNombre);
        txtNombre = new JTextField();
        txtNombre.setBounds(130, 50, 200, 20);
        frame.add(txtNombre);

        JLabel lblPrecio = new JLabel("Precio");
        lblPrecio.setBounds(20,80,100,20);
        frame.add(lblPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(130, 80,200,20);
        frame.add(txtPrecio);

        JLabel lblDescripcion = new JLabel("Descripcion");
        lblPrecio.setBounds(20,110,100,20);
        frame.add(lblPrecio);

        txtDescripcion = new JTextArea();
        txtDescripcion.setBounds(130, 110,200,100);
        frame.add(txtDescripcion);

        btnSave = new JButton("Guardar");
        btnSave.setBounds(130,220,100,30);
        frame.add(btnSave);

        iniciar();
    }

    private void iniciar(){
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto producto = new Producto();
                producto.setNombre(txtNombre.getText().trim());
                producto.setPrecio(Double.parseDouble(txtPrecio.getText().trim()));
                producto.setDescripcion(txtDescripcion.getText());

                controller.addProducto(producto);
                JOptionPane.showMessageDialog(frame, "Producto guardado con éxito");
            }
        });

    }

    private void clearFields(){
        txtNombre.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");
    }

    public void setVisible(boolean visible){
        frame.setVisible(visible);
    }

}
