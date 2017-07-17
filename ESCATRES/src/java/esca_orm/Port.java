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

public class Port {
	public Port() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == esca_orm.ORMConstants.KEY_PORT_DEVELOPMENTBOARDKIT) {
			return ORM_developmentBoardKit;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == esca_orm.ORMConstants.KEY_PORT_TYPEPORT) {
			this.typePort = (esca_orm.TypePort) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private String portName;
	
	private esca_orm.TypePort typePort;
	
	private Integer numberPorts;
	
	private int developmentBoardKitid;
	
	private java.util.Set ORM_developmentBoardKit = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setPortName(String value) {
		this.portName = value;
	}
	
	public String getPortName() {
		return portName;
	}
	
	public void setNumberPorts(int value) {
		setNumberPorts(new Integer(value));
	}
	
	public void setNumberPorts(Integer value) {
		this.numberPorts = value;
	}
	
	public Integer getNumberPorts() {
		return numberPorts;
	}
	
	public void setDevelopmentBoardKitid(int value) {
		this.developmentBoardKitid = value;
	}
	
	public int getDevelopmentBoardKitid() {
		return developmentBoardKitid;
	}
	
	private void setORM_DevelopmentBoardKit(java.util.Set value) {
		this.ORM_developmentBoardKit = value;
	}
	
	private java.util.Set getORM_DevelopmentBoardKit() {
		return ORM_developmentBoardKit;
	}
	
	public final esca_orm.DevelopmentBoardKitSetCollection developmentBoardKit = new esca_orm.DevelopmentBoardKitSetCollection(this, _ormAdapter, esca_orm.ORMConstants.KEY_PORT_DEVELOPMENTBOARDKIT, esca_orm.ORMConstants.KEY_DEVELOPMENTBOARDKIT_PORT, esca_orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTypePort(esca_orm.TypePort value) {
		if (this.typePort != value) {
			esca_orm.TypePort ltypePort = this.typePort;
			this.typePort = value;
			if (value != null) {
				typePort.setPort(this);
			}
			if (ltypePort != null && ltypePort.getPort() == this) {
				ltypePort.setPort(null);
			}
		}
	}
	
	public esca_orm.TypePort getTypePort() {
		return typePort;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
