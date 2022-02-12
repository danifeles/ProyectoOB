package com.company.Ejercicio5;

public class Coche {

    String name = "nombre de coche";
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.name = name;
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    public Coche() {

    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }

    public void acelerar(Integer cantidad) {
        if(cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }
}
