package com.company.ejercicio4;

public class SmartDevice {

    //ATRIBUTOS
    String name = "nombre del dispositivo";
    String modelo;
    String fabricante;
    String color;
    Integer almacenamiento;
    Integer memoria;

    //CONSTRUCTORES
    public SmartDevice(String name, String modelo, String fabricante, String color, Integer almacenamiento, Integer memoria) {
        this.name = name;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.color = color;
        this.almacenamiento = almacenamiento;
        this.memoria = memoria;

    }

    public SmartDevice() {

    }

    //COMPORTAMIENTO
    public void almacenamiento(int cantidad) {
        this.almacenamiento -= cantidad;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "name='" + name + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", color='" + color + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", memoria=" + memoria +
                '}';
    }
}
