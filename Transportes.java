/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author Zuriel Ali 
 */
public class Transportes {

        public static void main(String[] args) {
           //crear un vehiculo
     VehiculoTerrestre vehiculoTerrestre= new VehiculoTerrestre("Nissan","Skilen gtr34 ",4);
     
     VehiculoAcuatico vehiculoAcuatico = new VehiculoAcuatico("Lancha ","Yamaha","Motor");
     
     VehiculoAreo vehiculoAreo = new VehiculoAreo("Pegasus","PE-210A","Motor");
     
     VehiculoEspacial vehiculoEspacial = new VehiculoEspacial("Nasa","SLS","Cohetes de propulsion liquida");
     
     //Mostrar la informacion de los vehiculos
        System.out.println("");
        System.out.println("Informacion  del vehiculo Terrestre: ");
        vehiculoTerrestre.mostrarInfo();
        
        System.out.println("");
        System.out.println("Informacion del vehiculo Acuatico: ");
        vehiculoAcuatico.mostrarInfo();
        
         System.out.println("");
        System.out.println("Informacion del vehiculo Areo: ");
        vehiculoAreo.mostrarInfo();
        
        System.out.println("");
        System.out.println("Informacion del vehiculo Espacial: ");
        vehiculoEspacial.mostrarInfo();


    }
}
