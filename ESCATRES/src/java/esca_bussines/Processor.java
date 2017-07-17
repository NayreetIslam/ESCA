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
public class Processor extends HardwareComponent{
    
    private String name; // ARM Cortex-A73
    private double clockSpeed; // GHz
    private String architecture; // ARM
    private String dataBus; // 8-16-32-64bits
    private String architectureVersion; //ARMv8
    private String familiy; //Cortex
    private String cache; // 64kb Li lcache
    private double numberCores; // 1 , 2 ,3 ,4

    public Processor(String name, double clockSpeed, String architecture, String dataBus, String architectureVersion, String familiy, String cache, double numberCores) {
        this.name = name;
        this.clockSpeed = clockSpeed;
        this.architecture = architecture;
        this.dataBus = dataBus;
        this.architectureVersion = architectureVersion;
        this.familiy = familiy;
        this.cache = cache;
        this.numberCores = numberCores;
    }

    public Processor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getDataBus() {
        return dataBus;
    }

    public void setDataBus(String dataBus) {
        this.dataBus = dataBus;
    }

    public String getArchitectureVersion() {
        return architectureVersion;
    }

    public void setArchitectureVersion(String architectureVersion) {
        this.architectureVersion = architectureVersion;
    }

    public String getFamiliy() {
        return familiy;
    }

    public void setFamiliy(String familiy) {
        this.familiy = familiy;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public double getNumberCores() {
        return numberCores;
    }

    public void setNumberCores(double numberCores) {
        this.numberCores = numberCores;
    }
    
    
    
}
