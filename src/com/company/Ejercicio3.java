package com.company;

public class Ejercicio3 {

    public static void main(String[] args) {

        String[] nombres = {"Maria","Manuel","Lucia","Alberto"};
        String texto = "";
        for(String nombre: nombres) {
            texto = texto + nombre + " ";
        }

        System.out.println(texto);
    }
}
