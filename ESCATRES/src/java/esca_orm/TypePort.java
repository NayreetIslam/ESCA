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

public class TypePort {
	public TypePort() {
	}
	
	private int id;
	
	private String typeName;
	
	private esca_orm.Port port;
	
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
	
	public void setPort(esca_orm.Port value) {
		if (this.port != value) {
			esca_orm.Port lport = this.port;
			this.port = value;
			if (value != null) {
				port.setTypePort(this);
			}
			if (lport != null && lport.getTypePort() == this) {
				lport.setTypePort(null);
			}
		}
	}
	
	public esca_orm.Port getPort() {
		return port;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
