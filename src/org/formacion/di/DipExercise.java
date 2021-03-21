package org.formacion.di;

import org.formacion.di.bbdd.BBDD;
import org.formacion.di.bbdd.Inventario;
import org.formacion.di.bbdd.InventarioBBDD;
import org.formacion.di.negocio.Controlador;
import org.formacion.di.negocio.ControladorEstoc;

public class DipExercise {
    public static void main(String[] args) {
        // Objeto inventario
        Inventario inventario = new InventarioBBDD();

        // Objeto ControladorEstoc
        Controlador controladorEstoc = new ControladorEstoc(inventario);

        System.out.println("\nChequear si hay sufiente stock de un producto: \n");
        String tiendaNorte = BBDD.stocs.entrySet().stream().filter(e -> e.getKey() == "tienda norte").map(e -> e.getKey()).findFirst().get();

        System.out.println("Tienda: " + tiendaNorte);
        Boolean mesaStock = controladorEstoc.necesitaReponer(tiendaNorte, "mesa");

        Boolean lamparaStock = controladorEstoc.necesitaReponer(tiendaNorte, "lampara");

        System.out.println("Hay suficiente Stock del producto Mesa?: " + mesaStock.toString());

        System.out.println("Hay suficiente Stock del producto Lampara?: " + lamparaStock.toString());
    }
}
