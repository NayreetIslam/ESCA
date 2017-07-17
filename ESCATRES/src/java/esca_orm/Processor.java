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

public class Processor {
	public Processor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == esca_orm.ORMConstants.KEY_PROCESSOR_DEVELOPMENTBOARDKIT) {
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
	
	private Double clockSpeed;
	
	private String architecture;
	
	private String dataBus;
	
	private String architectureVersion;
	
	private String familiy;
	
	private String cache;
	
	private Double numberCores;
	
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
	
	public void setClockSpeed(double value) {
		setClockSpeed(new Double(value));
	}
	
	public void setClockSpeed(Double value) {
		this.clockSpeed = value;
	}
	
	public Double getClockSpeed() {
		return clockSpeed;
	}
	
	public void setArchitecture(String value) {
		this.architecture = value;
	}
	
	public String getArchitecture() {
		return architecture;
	}
	
	public void setDataBus(String value) {
		this.dataBus = value;
	}
	
	public String getDataBus() {
		return dataBus;
	}
	
	public void setArchitectureVersion(String value) {
		this.architectureVersion = value;
	}
	
	public String getArchitectureVersion() {
		return architectureVersion;
	}
	
	public void setFamiliy(String value) {
		this.familiy = value;
	}
	
	public String getFamiliy() {
		return familiy;
	}
	
	public void setCache(String value) {
		this.cache = value;
	}
	
	public String getCache() {
		return cache;
	}
	
	public void setNumberCores(double value) {
		setNumberCores(new Double(value));
	}
	
	public void setNumberCores(Double value) {
		this.numberCores = value;
	}
	
	public Double getNumberCores() {
		return numberCores;
	}
	
	private void setORM_DevelopmentBoardKit(java.util.Set value) {
		this.ORM_developmentBoardKit = value;
	}
	
	private java.util.Set getORM_DevelopmentBoardKit() {
		return ORM_developmentBoardKit;
	}
	
	public final esca_orm.DevelopmentBoardKitSetCollection developmentBoardKit = new esca_orm.DevelopmentBoardKitSetCollection(this, _ormAdapter, esca_orm.ORMConstants.KEY_PROCESSOR_DEVELOPMENTBOARDKIT, esca_orm.ORMConstants.KEY_DEVELOPMENTBOARDKIT_PROCESSOR, esca_orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
