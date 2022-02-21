package com.company;
import java.util.Hashtable;
import java.util.Map;

public class Banco extends CrearEliminar implements CalculosArticulos{
    public final String NOMBRE = "BancoPrueba";
    public final String CIUDAD = "Medellin";
    private Map<Integer,Cliente> clientes = new Hashtable<>();


    public Map<Integer, Cliente> getClientes() {
        return clientes;
    }

    public Cliente getCliente(int cedulaCliente) throws NoFoundExeption{

        if (clientes.containsKey(cedulaCliente)){
            return clientes.get(cedulaCliente);
        }else{
            throw new NoFoundExeption();
        }
    }


    @Override
    public void crearElemento(Cliente cliente) throws FoundExeption {
        if (!clientes.containsKey(cliente.getCedula())){
            clientes.put(cliente.getCedula(),cliente);
        }else{
            throw new FoundExeption();
        }
    }

    @Override
    public void eliminarElemento(int idElemento) throws NoFoundExeption {
        if (clientes.containsKey(idElemento)){
            clientes.remove(idElemento);
        }else{
            throw new NoFoundExeption();
        }

    }

    @Override
    public double valorArticulos() {
        double total = 0;
        for (Cliente clienteActual: clientes.values()) {
            total+= clienteActual.valorArticulos();
        }
        return total;
    }
}
