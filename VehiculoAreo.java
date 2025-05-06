/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author Zuriel Ali
 */
public class VehiculoAreo extends Vehiculo {
    private String  tipoPropulsion;
    
    public VehiculoAreo(String marca,String modelo,String tipoPropulsion){
        super(marca,modelo);
        this.tipoPropulsion= tipoPropulsion;
        
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de propulsion: "+tipoPropulsion);
    }
}
