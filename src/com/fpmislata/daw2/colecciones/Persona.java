package com.fpmislata.daw2.colecciones;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String primerApellido;
    private Sexo sexo;
    private String dni;
    private List<Coche> coche = new ArrayList<>();

    public Persona(String dni, String nombre, String primerApellido, Sexo sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public List<Coche> getCoche() {
        return coche;
    }

    public void setCoche(List<Coche> coche) {
        this.coche = coche;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String nombreCompleto() {
        String nombreCompleto = this.nombre + " " + this.primerApellido;
        return nombreCompleto;
    }
}