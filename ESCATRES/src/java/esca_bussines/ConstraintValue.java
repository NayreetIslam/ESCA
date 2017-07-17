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
public class ConstraintValue {

    private String type;
    private String name;
    private double value_a;
    private double value_b;
    
    
    public ConstraintValue() {
    }

    public ConstraintValue(String type, String name, double value_a, double value_b) {
        this.type = type;
        this.name = name;
        this.value_a = value_a;
        this.value_b = value_b;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue_a() {
        return value_a;
    }

    public void setValue_a(double value_a) {
        this.value_a = value_a;
    }

    public double getValue_b() {
        return value_b;
    }

    public void setValue_b(double value_b) {
        this.value_b = value_b;
    }
    
    
    
    
}
