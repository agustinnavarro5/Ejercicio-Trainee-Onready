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
public class Auto extends Vehiculo{
    private int puertas;
    public Auto(Modelo modelo, double precio, int puertas) {
        super(modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        //return super.getModelo().toString()+" // Puertas: "+this.puertas+" // Precio: $"+String.format("%.2f", super.getPrecio());
        return super.getModelo().toString()+" // Puertas: "+this.puertas+" // Precio: $"+new DecimalFormat("###,###.##").format(super.getPrecio());
        
    }
    
}
