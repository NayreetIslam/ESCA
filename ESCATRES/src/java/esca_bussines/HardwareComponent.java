/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esca_bussines;

/**
 *
 * @author Marcelo Esperguel
 */
public class HardwareComponent {
    
    private double powerConsumming;
    private String name;

    public HardwareComponent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerConsumming(double powerConsumming) {
        this.powerConsumming = powerConsumming;
    }

    public double getPowerConsumming() {
        return powerConsumming;
    }
    
    
    
}
