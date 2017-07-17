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

public class GENERAL_PURPOSE {
	public GENERAL_PURPOSE() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == esca_orm.ORMConstants.KEY_GENERAL_PURPOSE_ADD_FEATURE) {
			return ORM_ADD_FEATURE;
		}
		else if (key == esca_orm.ORMConstants.KEY_GENERAL_PURPOSE_CONSTRAINT) {
			return ORM_constraint;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == esca_orm.ORMConstants.KEY_GENERAL_PURPOSE_MINISPECIFICATION) {
			this.miniSpecification = (esca_orm.MiniSpecification) owner;
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
	
	private String title;
	
	private String description;
	
	private java.util.Set ORM_ADD_FEATURE = new java.util.HashSet();
	
	private esca_orm.MiniSpecification miniSpecification;
	
	private java.util.Set ORM_constraint = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	private void setORM_ADD_FEATURE(java.util.Set value) {
		this.ORM_ADD_FEATURE = value;
	}
	
	private java.util.Set getORM_ADD_FEATURE() {
		return ORM_ADD_FEATURE;
	}
	
	public final esca_orm.ADD_FEATURESetCollection ADD_FEATURE = new esca_orm.ADD_FEATURESetCollection(this, _ormAdapter, esca_orm.ORMConstants.KEY_GENERAL_PURPOSE_ADD_FEATURE, esca_orm.ORMConstants.KEY_ADD_FEATURE_GENERAL_PURPOSE, esca_orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setMiniSpecification(esca_orm.MiniSpecification value) {
		if (this.miniSpecification != value) {
			esca_orm.MiniSpecification lminiSpecification = this.miniSpecification;
			this.miniSpecification = value;
			if (value != null) {
				miniSpecification.setGENERAL_PURPOSE(this);
			}
			if (lminiSpecification != null && lminiSpecification.getGENERAL_PURPOSE() == this) {
				lminiSpecification.setGENERAL_PURPOSE(null);
			}
		}
	}
	
	public esca_orm.MiniSpecification getMiniSpecification() {
		return miniSpecification;
	}
	
	private void setORM_Constraint(java.util.Set value) {
		this.ORM_constraint = value;
	}
	
	private java.util.Set getORM_Constraint() {
		return ORM_constraint;
	}
	
	public final esca_orm.ConstraintSetCollection constraint = new esca_orm.ConstraintSetCollection(this, _ormAdapter, esca_orm.ORMConstants.KEY_GENERAL_PURPOSE_CONSTRAINT, esca_orm.ORMConstants.KEY_CONSTRAINT_GENERAL_PURPOSE, esca_orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
