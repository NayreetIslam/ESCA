/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esca_bussines;

import esca_orm.*;
import java.util.ArrayList;
/**
 *
 * @author Marcelo Esperguel
 */
public class EmbeddedSystem {
    
    
    
    private esca_orm.DevelopmentBoardKit devKit;
    private ArrayList<Input_Output_Devices> IODevices;
    private String type ; // Tipo de sistema , development board
    
    public EmbeddedSystem() {
        
    }

    public EmbeddedSystem(DevelopmentBoardKit devKit, ArrayList<Input_Output_Devices> IODevices, String type) {
        this.devKit = devKit;
        this.IODevices = IODevices;
        this.type = type;
    }

    public DevelopmentBoardKit getDevKit() {
        return devKit;
    }

    public void setDevKit(DevelopmentBoardKit devKit) {
        this.devKit = devKit;
    }

    public ArrayList<Input_Output_Devices> getIODevices() {
        return IODevices;
    }

    public void setIODevices(ArrayList<Input_Output_Devices> IODevices) {
        this.IODevices = IODevices;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
}
