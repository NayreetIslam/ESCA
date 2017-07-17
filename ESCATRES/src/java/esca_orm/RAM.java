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

public class RAM {
	public RAM() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == esca_orm.ORMConstants.KEY_RAM_DEVELOPMENTBOARDKIT) {
			return ORM_developmentBoardKit;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String name;
	
	private Double frecuency;
	
	private String type;
	
	private Double amount;
	
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
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setFrecuency(double value) {
		setFrecuency(new Double(value));
	}
	
	public void setFrecuency(Double value) {
		this.frecuency = value;
	}
	
	public Double getFrecuency() {
		return frecuency;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type;
	}
	
	public void setAmount(double value) {
		setAmount(new Double(value));
	}
	
	public void setAmount(Double value) {
		this.amount = value;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	private void setORM_DevelopmentBoardKit(java.util.Set value) {
		this.ORM_developmentBoardKit = value;
	}
	
	private java.util.Set getORM_DevelopmentBoardKit() {
		return ORM_developmentBoardKit;
	}
	
	public final esca_orm.DevelopmentBoardKitSetCollection developmentBoardKit = new esca_orm.DevelopmentBoardKitSetCollection(this, _ormAdapter, esca_orm.ORMConstants.KEY_RAM_DEVELOPMENTBOARDKIT, esca_orm.ORMConstants.KEY_DEVELOPMENTBOARDKIT_RAM, esca_orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
