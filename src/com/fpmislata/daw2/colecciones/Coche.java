package com.fpmislata.daw2.colecciones;

public class Coche {

    private Marca marca;
    private String modelo;
    private int cilindrada;
    private String dniPropietario;

    public Coche() {
    }
    
    public Coche(String dniPropietario,String modelo,Marca marca,int cilindrada) {
    
        this.dniPropietario=dniPropietario;
        this.modelo=modelo;
        this.marca=marca;
        this.cilindrada=cilindrada;
        
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

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
}
