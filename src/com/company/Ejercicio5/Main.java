package com.company.Ejercicio5;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        List<Coche> coche = cocheCrud.findAll();
        System.out.println(coche);
        cocheCrud.save(new Coche());
        cocheCrud.delete(new Coche());
    }
}
