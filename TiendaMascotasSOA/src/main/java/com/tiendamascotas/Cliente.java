package com.tiendamascotas;

public class Cliente {
    private String nombre;

    // Constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + "]";
    }
}
