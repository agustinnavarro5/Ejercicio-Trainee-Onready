/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author usuario
 */
public class Vehiculo{
    private Modelo modelo;
    private double precio;

    public Vehiculo(Modelo modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion(){
        return modelo.getMarca().getDescripcion()+" "+modelo.getDescripcion();
    }
    
    public String getDescripcionCompleta(){
        return modelo.getMarca().getDescripcion()+" "+modelo.getDescripcion()+" $"+new DecimalFormat("###,###.##").format(this.precio);
    }
    
}
