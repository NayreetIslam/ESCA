    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esca_bussines;

import java.util.ArrayList;
/**
 *
 * @author Marcelo Esperguel
 */
public class DevelopmentBoard extends HardwareComponent{
    
    private String name;
    private ArrayList<HardwareComponent> components;

    public DevelopmentBoard(String name) {
        this.name = name;
    }
    
    
    
}
