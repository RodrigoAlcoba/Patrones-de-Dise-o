package org.example.vista;

import org.example.controlador.ProductoController;
import org.example.modelo.Producto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class VistaListar {
    private ProductoController controller;

    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;

    private JButton btnEliminar;

    public VistaListar(ProductoController controller){
        this.controller = controller;

        frame = new JFrame("Vista Listar");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        String[] columNames = { "ID", "Nombre", "Descripción", "Precio"};
        model = new DefaultTableModel(null, columNames);
        table = new JTable(model);

        //Lenar la Tabla

        List<Producto> productos = controller.getAllProductos();
        for (Producto producto : productos){
            Object[] row = new Object[4];
            row[0] = producto.getId();
            row[1] = producto.getNombre();
            row[2] = producto.getDescripcion();
            row[3] = producto.getPrecio();
            model.addRow(row);
        }
        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1){
                    int id = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
                    int respuesta = JOptionPane.showConfirmDialog(null, "Estas Seguro?","Confirmación" ,JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION){
                        controller.deleteProducto(id);
                        model.removeRow(selectedRow);
                    }else {
                        JOptionPane.showMessageDialog(null, "Seleccione un item para eliminar");
                    }
                }
            }
        });

        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(btnEliminar,BorderLayout.SOUTH);


    }

    public void setVisible(boolean visible){
        frame.setVisible(visible);
    }
}
