package com.company.ejercicio4;

public class Main {

    public static void main(String[] args) {

        //Objeto utilizando el constructor vacío
        SmartDevice dispositivo1 = new SmartDevice();

        //Objeto utilizando constructor con parámetros
        SmartDevice dispositivo2 = new SmartDevice("iPad", "9,7", "Apple", "gris", 32, 4);

        dispositivo2.almacenamiento(1);

        System.out.println(dispositivo2);

        SmartWatch reloj1 = new SmartWatch("AppleWatch", "Series 7", "Apple", "rosa", 8, 512);

        System.out.println(reloj1);

        SmartPhone tel1 = new SmartPhone("iPhone","13","Apple","azul oscuro", 128, 4);

        System.out.println(tel1);

    }
}
