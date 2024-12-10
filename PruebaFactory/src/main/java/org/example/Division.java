package org.example;

public class Division implements Operacion{
    public double calcular(double num1, double num2) {
        if (num2 == 0){
            System.out.println("Error: No se puede dividir por cero");
        }
        return num1 / num2;
    }
}
