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
public class ExternalInterface extends HardwareComponent {
    
    private String type;
    private String name;
    private int quantity;

    public ExternalInterface(String type, String name, int quantity) {
        this.type = type;
        this.name = name;
        this.quantity = quantity;
    }

    public ExternalInterface() {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
