package com.company;

import java.util.Arrays;

public class Asfalto extends Via{
    private String asfaltoProvedoor;
    private int velocidadMax;
    private boolean adelantar;
    private final double ESPESOR = 0.25;
    private final int ANCHO = 8;

    public Asfalto(double[] coordenadasIniciales, double[] coordenadasFinales, String asfaltoProvedoor, int velocidadMax, boolean adelantar) {
        //  super(coordenadasIniciales, coordenadasFinales, 8);
        this.coordenadasIniciales = coordenadasIniciales;
        this.coordenadasFinales = coordenadasFinales;
        this.asfaltoProvedoor = asfaltoProvedoor;
        this.velocidadMax = velocidadMax;
        this.adelantar = adelantar;
        this.ancho = ANCHO;
    }

    @Override
    public double volumen() {
        return ESPESOR * area();
    }

    @Override
    public String toString() {
        return "Asfalto{" +
                ", CoordenadasIniciales=" + Arrays.toString(coordenadasIniciales) +
                ", CoordenadasFinales=" + Arrays.toString(coordenadasFinales) +
                "AsfaltoProvedoor='" + asfaltoProvedoor + '\'' +
                ", velocidadMaxima=" + velocidadMax +
                ", PermitidoAdelanter=" + adelantar +
                ", Ancho=" + this.ancho+
                '}';
    }
}
