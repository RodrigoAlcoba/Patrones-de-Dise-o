package org.example;

public class Pago {
    public boolean realizarPago(String tarjeta){
        if (tarjeta.startsWith("123")){
            return true;
        }
        return false;
    }

    public void pagar(){
        System.out.println("Pago realizado");
    }


}
