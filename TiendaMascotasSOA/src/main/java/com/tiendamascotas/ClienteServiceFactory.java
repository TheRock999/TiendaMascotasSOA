package com.tiendamascotas;

public class ClienteServiceFactory {
    public ClienteService createClienteService() {
        return new ClienteServiceImpl();
    }
}
