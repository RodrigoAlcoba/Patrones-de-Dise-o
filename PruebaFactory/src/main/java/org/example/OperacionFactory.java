package org.example;

public class OperacionFactory {

    public Operacion crearOperacion(String operador){

        if (operador.equals("-")){
            return new Resta();
        }
        if (operador.equals("*")){
            return new Multiplicacion();
        }
        if (operador.equals("+")){
            return new Suma();
        }
        if (operador.equals("/")){
            return new Division();
        }
        System.out.println("Operador no válido: [" +operador+ "]");
        return null;
    }
}
