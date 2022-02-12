package com.company.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public interface CocheCRUD {

    List<Coche> coches = new ArrayList();

    public void save(Coche coche);

    public List<Coche> findAll();

    public void delete(Coche coche);

}
