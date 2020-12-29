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
public class Moto extends Vehiculo{
    private int cilindrada;
    public Moto(Modelo modelo, double precio, int cilindrada) {
        super(modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
      return super.getModelo().toString()+" // Cilindrada: "+this.cilindrada+"cc // Precio: $"+new DecimalFormat("###,###.##").format(super.getPrecio());
    }
    
    
}
