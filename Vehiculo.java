/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author Zuriel Ali
 */
public class Vehiculo {
    protected  String marca;
    protected String modelo;
    
    
   public  Vehiculo(String marca,String modelo){
       this.modelo= modelo;
       this.marca= marca;
   }
   
   public void mostrarInfo(){
       System.out.println("Marca: "+marca);
       System.out.println("Modelo: "+modelo);
   }
}
