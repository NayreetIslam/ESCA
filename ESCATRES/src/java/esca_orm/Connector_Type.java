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

public class Connector_Type {
	public Connector_Type() {
	}
	
	private int id;
	
	private String connectorName;
	
	private esca_orm.Input_Output_Devices input_Output_Devices;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setConnectorName(String value) {
		this.connectorName = value;
	}
	
	public String getConnectorName() {
		return connectorName;
	}
	
	public void setInput_Output_Devices(esca_orm.Input_Output_Devices value) {
		if (this.input_Output_Devices != value) {
			esca_orm.Input_Output_Devices linput_Output_Devices = this.input_Output_Devices;
			this.input_Output_Devices = value;
			if (value != null) {
				input_Output_Devices.setConnector_Type(this);
			}
			if (linput_Output_Devices != null && linput_Output_Devices.getConnector_Type() == this) {
				linput_Output_Devices.setConnector_Type(null);
			}
		}
	}
	
	public esca_orm.Input_Output_Devices getInput_Output_Devices() {
		return input_Output_Devices;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
