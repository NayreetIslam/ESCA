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
public class Memory extends HardwareComponent{
    
    private double memoryAmount; // MB
    private String type; // DDR1 2 3
    private double frecuency;  // MHZ

    public Memory(double memoryAmount, String type, double frecuency) {
        this.memoryAmount = memoryAmount;
        this.type = type;
        this.frecuency = frecuency;
    }

    public Memory() {
    }

        
    public double getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(double memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFrecuency() {
        return frecuency;
    }

    public void setFrecuency(double frecuency) {
        this.frecuency = frecuency;
    }
    
    
    
    
}
