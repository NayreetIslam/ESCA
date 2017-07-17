/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package esca_orm;

public class Sensor {
	public Sensor() {
	}
	
	private int id;
	
	private Double cost;
	
	private String name;
	
	private String type;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setCost(double value) {
		setCost(new Double(value));
	}
	
	public void setCost(Double value) {
		this.cost = value;
	}
	
	public Double getCost() {
		return cost;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
