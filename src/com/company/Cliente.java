package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Cliente extends CrearEliminar implements CalculosArticulos{

    private String nombre;
    private int cedula;
    private String pais;
    private int celular;
    private List<Articulo> articulos = new ArrayList<>();

    public Cliente(String nombreCliente, int cedulaCliente, String paisCliente, int celularCliente){
        this.nombre = nombreCliente;
        this.cedula = cedulaCliente;
        this.pais = paisCliente;
        this.celular = celularCliente;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }
    public int getCedula() {
        return cedula;
    }
    public int getCelular() {
        return celular;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPais() {
        return pais;
    }


    @Override
    public void crearElemento(Articulo articulo) throws FoundExeption, NoFoundExeption {
        if (!articulos.contains(articulo)){
            articulos.add(articulo);
        }else{
            throw new FoundExeption();
        }
    }

    @Override
    public void eliminarElemento() {
        articulos.clear();
    }
    public void eliminarElemento(int idElemento) throws NoFoundExeption {

        int articuloSeleccionado = 0;

        for (Articulo articuloActual: articulos) {
            if (articuloActual.getId() == idElemento){
                articuloSeleccionado = articulos.indexOf(articuloActual);
            }
        }

        if (articuloSeleccionado == -1) {
            throw new NoFoundExeption();
        }else {
            articulos.remove(articuloSeleccionado);
        }
    }

    @Override
    public double valorArticulos() {
        double total = 0;
        for (Articulo articuloActual: articulos) {
            total += articuloActual.getValor();
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return cedula == cliente.cedula && celular == cliente.celular && nombre.equals(cliente.nombre) && pais.equals(cliente.pais) && Objects.equals(articulos, cliente.articulos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }
}
