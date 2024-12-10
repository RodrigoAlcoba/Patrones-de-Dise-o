package org.example;

import java.util.List;

public class TiendaFacade {
    private Stock stock;
    private Pago pago;

    public TiendaFacade() {
        this.stock = new Stock();
        this.pago = new Pago();
    }

    public void realizarCompra(String tarjeta, String producto){
        if (stock.productoDisponible(producto)){
            if (pago.realizarPago(tarjeta)){
                pago.pagar();
            }
        }
    }
}
