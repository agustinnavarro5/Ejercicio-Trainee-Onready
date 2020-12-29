/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotraineeonready;

import model.Auto;
import model.Concesionaria;
import model.Marca;
import model.Modelo;
import model.Moto;

/**
 *
 * @author usuario
 */
public class EjercicioTraineeOnready {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Marcas
        Marca marcaUno = new Marca("Peugeot");
        Marca marcaDos = new Marca("Honda");
        Marca marcaTres = new Marca("Yamaha");
        //Modelos
        Modelo modeloUno = new Modelo(marcaUno,"206");
        Modelo modeloDos = new Modelo(marcaUno,"208");
        Modelo modeloTres = new Modelo(marcaDos,"Titan");
        Modelo modeloCuatro = new Modelo(marcaTres,"YBR");
        //Vehiculos
        Auto vehiculoUno = new Auto(modeloUno,200000,4);
        Auto vehiculoDos = new Auto(modeloDos,250000,5);
        Moto vehiculoTres = new Moto(modeloTres,60000,125);
        Moto vehiculoCuatro = new Moto(modeloCuatro,80500.50,160);
        //Concesionaria
        Concesionaria concesionaria = new Concesionaria("Concesionaria",1);
        concesionaria.agregarVehiculo(vehiculoUno);
        concesionaria.agregarVehiculo(vehiculoDos);
        concesionaria.agregarVehiculo(vehiculoTres);
        concesionaria.agregarVehiculo(vehiculoCuatro);
        //Mostrar resultados
        concesionaria.mostrarVehiculos();
        System.out.println("=============================");
        concesionaria.getVehiculoMasCaro();
        concesionaria.getVehiculoMasBarato();
        concesionaria.getVehiculoQueContieneEnModeloLetraY();
        System.out.println("=============================");
        concesionaria.mostrarVehiculosOrdenadosPorPrecioDeMayorAMenor();
    }
    
}
