package com.fpmislata.daw2.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Colecciones {

    public static void main(String[] args) {

        List<Coche> coches = new ArrayList<Coche>();
        Map<String, Coche> mapCoches = new HashMap<>();

        Coche coche1 = new Coche();

        coche1.setDniPropietario("53758419J");
        coche1.setMarca(Marca.FORD);
        coche1.setModelo("Mustang");
        coche1.setCilindrada(2000);

        coches.add(coche1);

        Coche coche2 = new Coche();

        coche2.setDniPropietario("53758419Z");
        coche2.setMarca(Marca.FORD);
        coche2.setModelo("Mondeo");
        coche2.setCilindrada(1600);

        coches.add(coche2);

        Coche coche3 = new Coche();

        coche3.setDniPropietario("22222222L");
        coche3.setMarca(Marca.SEAT);
        coche3.setModelo("Leon");
        coche3.setCilindrada(1550);

        coches.add(coche3);

        Coche coche4 = new Coche();

        coche4.setDniPropietario("12345678Z");
        coche4.setMarca(Marca.RENAULT);
        coche4.setModelo("Kangoo");
        coche4.setCilindrada(1600);

        coches.add(coche4);

        Coche coche5 = new Coche();

        coche5.setDniPropietario("53758419J");
        coche5.setMarca(Marca.CITROEN);
        coche5.setModelo("Xsara");
        coche5.setCilindrada(1800);

        coches.add(coche5);

        System.out.println("DNI: " + coche2.getDniPropietario() + "\nMarca: " + coche2.getMarca() + "\nModelo: " + coche2.getModelo() + "\nCilindrada: " + coche2.getCilindrada());

        System.out.println(" ");
        for (Coche coche : coches) {
            System.out.println("Nombre: " + coche.getMarca() + " Modelo: " + coche.getModelo());
        }

        /*System.out.println(" ");
         System.out.println("Introduce un DNI: ");
         Scanner sc = new Scanner(System.in);
         String dniModelo = sc.nextLine();

         for (Coche coche : coches) {
         if (coche.getDniPropietario().equals(dniModelo)) {
         System.out.println("Modelo: " + coche.getModelo());
         }
         }*/

        System.out.println(" ");
        System.out.println("Coches Ford");
        for (Coche coche : coches) {
            if (coche.getMarca().equals(Marca.FORD)) {
                System.out.println(coche.getModelo());
            }
        }

        mapCoches.put(coche1.getDniPropietario(), coche1);
        mapCoches.put(coche2.getDniPropietario(), coche2);
        mapCoches.put(coche3.getDniPropietario(), coche3);
        mapCoches.put(coche4.getDniPropietario(), coche4);
        mapCoches.put(coche5.getDniPropietario(), coche5);

        System.out.println(" ");
        System.out.println("Coche cuyo DNI sea 12345678Z");
        Set<String> dnis = mapCoches.keySet();

        Coche cocheEncontrado = mapCoches.get("12345678Z");
        System.out.println("Modelo: " + cocheEncontrado.getModelo() + "\nMarca: " + cocheEncontrado.getMarca() + "\nCilindrada: " + cocheEncontrado.getCilindrada());

        System.out.println(" ");
        System.out.println("Coches por DNI");
        for (String dni : dnis) {
            Coche cocheDnis = mapCoches.get(dni);
            System.out.println("DNI: " + cocheDnis.getDniPropietario() + "\nModelo: " + cocheDnis.getModelo() + "\nMarca: " + cocheDnis.getMarca() + "\nCilindrada: " + cocheDnis.getCilindrada());
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Coche según DNI introducido");
        System.out.println("Introduce un DNI: ");
        Scanner sc = new Scanner(System.in);
        String dniCoche = sc.nextLine();

        Coche cocheDeDni = mapCoches.get(dniCoche);
        System.out.println("Modelo: " + cocheDeDni.getModelo());
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Coche marca FORD");

        for (String dni : dnis) {
            Coche cocheFord = mapCoches.get(dni);
            if (cocheFord.getMarca() == Marca.FORD) {
                System.out.println("DNI: " + cocheFord.getDniPropietario() + "\nModelo: " + cocheFord.getModelo() + "\nMarca: " + cocheFord.getMarca() + "\nCilindrada: " + cocheFord.getCilindrada());
            }
        }
    }
}
