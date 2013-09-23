package com.fpmislata.daw2.colecciones;

import java.util.ArrayList;
import java.util.List;

public class Coche {

    private Marca marca;
    private String modelo;
    private int cilindrada;
    private Persona propietario;

    public Coche() {
    }

    public Coche(String modelo, Marca marca, int cilindrada) {

        this.modelo = modelo;
        this.marca = marca;
        this.cilindrada = cilindrada;

    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
