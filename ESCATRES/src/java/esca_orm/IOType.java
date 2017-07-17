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

public class IOType {
	public IOType() {
	}
	
	private int id;
	
	private String typeName;
	
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
	
	public void setTypeName(String value) {
		this.typeName = value;
	}
	
	public String getTypeName() {
		return typeName;
	}
	
	public void setInput_Output_Devices(esca_orm.Input_Output_Devices value) {
		if (this.input_Output_Devices != value) {
			esca_orm.Input_Output_Devices linput_Output_Devices = this.input_Output_Devices;
			this.input_Output_Devices = value;
			if (value != null) {
				input_Output_Devices.setIOType(this);
			}
			if (linput_Output_Devices != null && linput_Output_Devices.getIOType() == this) {
				linput_Output_Devices.setIOType(null);
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
