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

public class DevelopmentBoardKit {
	public DevelopmentBoardKit() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == esca_orm.ORMConstants.KEY_DEVELOPMENTBOARDKIT_PORT) {
			return ORM_port;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == esca_orm.ORMConstants.KEY_DEVELOPMENTBOARDKIT_PROCESSOR) {
			this.processor = (esca_orm.Processor) owner;
		}
		
		else if (key == esca_orm.ORMConstants.KEY_DEVELOPMENTBOARDKIT_RAM) {
			this.RAM = (esca_orm.RAM) owner;
		}
		
		else if (key == esca_orm.ORMConstants.KEY_DEVELOPMENTBOARDKIT_ROM) {
			this.ROM = (esca_orm.ROM) owner;
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
	
	private String name;
	
	private String copany;
	
	private esca_orm.Processor processor;
	
	private esca_orm.RAM RAM;
	
	private Double cost;
	
	private String urlImage;
	
	private esca_orm.ROM ROM;
	
	private Double power_consumption;
	
	private String buy_url;
	
	private Double weight;
	
	private java.util.Set ORM_port = new java.util.HashSet();
	
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
	
	public void setCopany(String value) {
		this.copany = value;
	}
	
	public String getCopany() {
		return copany;
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
	
	public void setUrlImage(String value) {
		this.urlImage = value;
	}
	
	public String getUrlImage() {
		return urlImage;
	}
	
	public void setPower_consumption(double value) {
		setPower_consumption(new Double(value));
	}
	
	public void setPower_consumption(Double value) {
		this.power_consumption = value;
	}
	
	public Double getPower_consumption() {
		return power_consumption;
	}
	
	public void setBuy_url(String value) {
		this.buy_url = value;
	}
	
	public String getBuy_url() {
		return buy_url;
	}
	
	public void setWeight(double value) {
		setWeight(new Double(value));
	}
	
	public void setWeight(Double value) {
		this.weight = value;
	}
	
	public Double getWeight() {
		return weight;
	}
	
	public void setProcessor(esca_orm.Processor value) {
		if (processor != null) {
			processor.developmentBoardKit.remove(this);
		}
		if (value != null) {
			value.developmentBoardKit.add(this);
		}
	}
	
	public esca_orm.Processor getProcessor() {
		return processor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Processor(esca_orm.Processor value) {
		this.processor = value;
	}
	
	private esca_orm.Processor getORM_Processor() {
		return processor;
	}
	
	public void setRAM(esca_orm.RAM value) {
		if (RAM != null) {
			RAM.developmentBoardKit.remove(this);
		}
		if (value != null) {
			value.developmentBoardKit.add(this);
		}
	}
	
	public esca_orm.RAM getRAM() {
		return RAM;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_RAM(esca_orm.RAM value) {
		this.RAM = value;
	}
	
	private esca_orm.RAM getORM_RAM() {
		return RAM;
	}
	
	public void setROM(esca_orm.ROM value) {
		if (ROM != null) {
			ROM.developmentBoardKit.remove(this);
		}
		if (value != null) {
			value.developmentBoardKit.add(this);
		}
	}
	
	public esca_orm.ROM getROM() {
		return ROM;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ROM(esca_orm.ROM value) {
		this.ROM = value;
	}
	
	private esca_orm.ROM getORM_ROM() {
		return ROM;
	}
	
	private void setORM_Port(java.util.Set value) {
		this.ORM_port = value;
	}
	
	private java.util.Set getORM_Port() {
		return ORM_port;
	}
	
	public final esca_orm.PortSetCollection port = new esca_orm.PortSetCollection(this, _ormAdapter, esca_orm.ORMConstants.KEY_DEVELOPMENTBOARDKIT_PORT, esca_orm.ORMConstants.KEY_PORT_DEVELOPMENTBOARDKIT, esca_orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
