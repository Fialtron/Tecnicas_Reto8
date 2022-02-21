package com.company;

import java.util.Arrays;

public class NoAsfalto extends Via{

    private String materialVia;
    private double espesorCapa;
    private final int ANCHO = 6;

    public NoAsfalto(double[] coordenadasIniciales, double[] coordenadasFinales, String materialVia,double espesorCapa) {
        // super(coordenadasIniciales, coordenadasFinales, 6);
        this.coordenadasIniciales = coordenadasIniciales;
        this.coordenadasFinales = coordenadasFinales;
        this.espesorCapa = espesorCapa;
        this.materialVia = materialVia;
        this.ancho = ANCHO;
    }

    public double getEspesorCapa() {
        return espesorCapa;
    }

    @Override
    public double volumen() {
        return getEspesorCapa() * area();
    }

    @Override
    public String toString() {
        return "NoAsfalto{" +
                ", coordenadasIniciales=" + Arrays.toString(coordenadasIniciales) +
                ", coordenadasFinales=" + Arrays.toString(coordenadasFinales) +
                "materialVia='" + materialVia + '\'' +
                ", espesorCapa=" + espesorCapa +
                ", ancho=" + this.ancho +
                '}';
    }
}
