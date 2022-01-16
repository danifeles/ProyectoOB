package com.company;

public class Ejercicio2 {

    public static void main(String[] args) {

        double precio = devolverPrecioIVA(18);
        System.out.println(precio);

    }

    static double devolverPrecioIVA(double precio) {
        return precio + precio*0.21;
    }
}
