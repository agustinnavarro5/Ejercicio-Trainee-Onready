/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author usuario
 */
public class Concesionaria{
    private String descripcion;
    private int numero;
    private  ArrayList<Vehiculo> vehiculos;

    public Concesionaria(String descripcion, int numero) {
        this.descripcion = descripcion;
        this.numero = numero;
        this.vehiculos = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    //Responsabilities
    public void mostrarVehiculos(){
        this.vehiculos.forEach((Vehiculo _vehiculo) -> {
            System.out.println(_vehiculo.toString());
        });
    }
    public void getVehiculoMasCaro(){
        double precio = 0;
        Vehiculo vehiculoMasCaro = null;
        for(Vehiculo v:this.vehiculos){
            if(v.getPrecio()>precio){
                precio = v.getPrecio();
                vehiculoMasCaro=v;
            }
        }
        System.out.println("Vehículo más caro: "+vehiculoMasCaro.getDescripcion());
    }
    
    public void getVehiculoMasBarato(){
        double precio = Double.MAX_VALUE;
        Vehiculo vehiculoMasBarato = null;
        for(Vehiculo v:this.vehiculos){
            if(v.getPrecio()<precio){
                precio = v.getPrecio();
                vehiculoMasBarato=v;
            }
        }
        System.out.println("Vehículo más barato: "+vehiculoMasBarato.getDescripcion());
    }
    
     public void getVehiculoQueContieneEnModeloLetraY(){
         this.vehiculos.stream().filter((v) -> (v.getModelo().getDescripcion().contains("Y"))).forEachOrdered((v) -> {
             System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+v.getDescripcionCompleta());
        });
    }
     
    public void mostrarVehiculosOrdenadosPorPrecioDeMayorAMenor(){
        Collections.sort(vehiculos, (Vehiculo v1, Vehiculo v2) -> new Double(v2.getPrecio()).compareTo(v1.getPrecio()));
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        this.vehiculos.forEach((Vehiculo _vehiculo) -> {
            System.out.println(_vehiculo.getDescripcion());
        });
    }

    public void agregarVehiculo(Vehiculo v){
        this.vehiculos.add(v);
    }
 
}
