package com.company;

import java.util.ArrayList;

public class Carretera {
    private ArrayList<Via> camino = new ArrayList<>();

    public ArrayList<Via> getCamino() {
        return camino;
    }

    public int longitudTotal(){
        double sumaLongitud = 0;
        for (Via viaActual: camino){
            sumaLongitud+= viaActual.longitud();
        }
        return (int)sumaLongitud;
    }

    public int areaTotal(){
        double sumaArea = 0;
        for (Via viaActual: camino) {
            sumaArea+= viaActual.area();
        }
        return (int)sumaArea;
    }

    public double volumenMaterial(){
        double sumaVolumen =0;
        for (Via viaActual : camino) {
            sumaVolumen+= viaActual.volumen();
        }
        return sumaVolumen;
    }

    public double volumenAsfalto(){
        double sumaVolumen =0;
        for (Via viaActual : camino) {
            if( viaActual instanceof Asfalto){
                sumaVolumen += viaActual.volumen();
            }
        }
        return sumaVolumen;
    }

    public double volumenNoAsfalto(){
        double sumaVolumen =0;
        for (Via viaActual : camino) {
            if( viaActual instanceof NoAsfalto){
                sumaVolumen += viaActual.volumen();
            }
        }
        return sumaVolumen;
    }

    public boolean conexionCamino(){
        boolean conexion = true;

        for (Via viaActual: camino) {
            int indexActual = camino.indexOf(viaActual);
            if(indexActual !=0){

                if(camino.get(indexActual-1).coordenadasFinales[0] != viaActual.coordenadasIniciales[0] || camino.get(indexActual-1).coordenadasFinales[1] != viaActual.coordenadasIniciales[1]){
                    // System.out.println("coordenadas finales: "+ camino.get(indexActual-1).coordenadasFinales[0] +" "+camino.get(indexActual-1).coordenadasFinales[1] );
                    // System.out.println("coordenadas iniciales: "+ viaActual.coordenadasIniciales[0] +" "+viaActual.coordenadasIniciales[1]  );
                    return false;
                }
            }
        }

        return conexion;
    }

    public void setCamino(Via via) {
        camino.add(via);
    }

}
