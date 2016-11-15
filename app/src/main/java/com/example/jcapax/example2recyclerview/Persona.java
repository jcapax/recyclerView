package com.example.jcapax.example2recyclerview;

/**
 * Created by jcapax on 14/11/16.
 */

public class Persona {
    private String nombre;
    private String ciudad;
    private int edad;

    public Persona(String nombre, String ciudad, int edad) {
        this.nombre =  nombre.toUpperCase();
        this.ciudad = ciudad.toUpperCase();
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
