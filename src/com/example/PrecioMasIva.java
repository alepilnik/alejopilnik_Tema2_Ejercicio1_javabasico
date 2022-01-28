package com.example;

public class PrecioMasIva {

    public static void main(String[] args) {

        double precio = 9.5d;
        double preciototal = preciomasiva(precio);
        System.out.println(preciototal);

    }

    private static double preciomasiva(double precio) {

        double ivaArgentina = 1.21d;
        return precio * ivaArgentina;

    }

}
