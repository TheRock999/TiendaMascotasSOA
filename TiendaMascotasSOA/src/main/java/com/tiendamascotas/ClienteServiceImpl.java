package com.tiendamascotas;

public class ClienteServiceImpl implements ClienteService {
    @Override
    public String obtenerClienteInfo(String nombre) {
        return "Información del cliente: " + nombre;
    }
}
