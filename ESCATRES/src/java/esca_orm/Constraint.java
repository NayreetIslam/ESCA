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

public class Constraint {
	public Constraint() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == esca_orm.ORMConstants.KEY_CONSTRAINT_GENERAL_PURPOSE) {
			return ORM_GENERAL_PURPOSE;
		}
		else if (key == esca_orm.ORMConstants.KEY_CONSTRAINT_ADD_FEATURE) {
			return ORM_ADD_FEATURE;
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
	
	private String type;
	
	private String unit;
	
	private java.util.Set ORM_GENERAL_PURPOSE = new java.util.HashSet();
	
	private java.util.Set ORM_ADD_FEATURE = new java.util.HashSet();
	
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
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type;
	}
	
	public void setUnit(String value) {
		this.unit = value;
	}
	
	public String getUnit() {
		return unit;
	}
	
	private void setORM_GENERAL_PURPOSE(java.util.Set value) {
		this.ORM_GENERAL_PURPOSE = value;
	}
	
	private java.util.Set getORM_GENERAL_PURPOSE() {
		return ORM_GENERAL_PURPOSE;
	}
	
	public final esca_orm.GENERAL_PURPOSESetCollection GENERAL_PURPOSE = new esca_orm.GENERAL_PURPOSESetCollection(this, _ormAdapter, esca_orm.ORMConstants.KEY_CONSTRAINT_GENERAL_PURPOSE, esca_orm.ORMConstants.KEY_GENERAL_PURPOSE_CONSTRAINT, esca_orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_ADD_FEATURE(java.util.Set value) {
		this.ORM_ADD_FEATURE = value;
	}
	
	private java.util.Set getORM_ADD_FEATURE() {
		return ORM_ADD_FEATURE;
	}
	
	public final esca_orm.ADD_FEATURESetCollection ADD_FEATURE = new esca_orm.ADD_FEATURESetCollection(this, _ormAdapter, esca_orm.ORMConstants.KEY_CONSTRAINT_ADD_FEATURE, esca_orm.ORMConstants.KEY_ADD_FEATURE_CONSTRAINT, esca_orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
