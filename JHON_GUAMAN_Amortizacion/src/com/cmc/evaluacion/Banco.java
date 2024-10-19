package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private ArrayList<Prestamos> prestamos;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Prestamos> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamos> prestamos) {
        this.prestamos = prestamos;
    }

    public Cliente buscarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null; 
    }

    public void registrarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getCedula()) == null) {
            clientes.add(cliente);
        }
    }
    
    public void asignarPrestamo(String cedula, Prestamos prestamo) {
        Cliente cliente = buscarCliente(cedula);
        if (cliente == null) {
            System.out.println("El cliente con cédula " + cedula + " no existe en el banco.");
        } else {
            prestamos.add(prestamo);
            System.out.println("Préstamo asignado al cliente: " + cliente.getNombre());
        }
    }

    public ArrayList<Prestamos> buscarPrestamos(String cedula) {
        Cliente cliente = buscarCliente(cedula);
        if (cliente == null) {
            System.out.println("El cliente con cédula " + cedula + " no existe en el banco.");
            return null;
        }

        ArrayList<Prestamos> prestamosCliente = new ArrayList<>();
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamos prestamo = prestamos.get(i);
            if (prestamo.getCedulaCliente().equals(cedula)) {
                prestamosCliente.add(prestamo);
            }
        }

        if (prestamosCliente.isEmpty()) {
            System.out.println("El cliente con cédula " + cedula + " no tiene préstamos.");
            return null;
        }

        return prestamosCliente;
    }
}

