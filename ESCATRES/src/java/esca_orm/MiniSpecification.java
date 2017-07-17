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

public class MiniSpecification {
	public MiniSpecification() {
	}
	
	private int id;
	
	private String processorDataBus;
	
	private String ramType;
	
	private Double ramAmmount;
	
	private esca_orm.GENERAL_PURPOSE GENERAL_PURPOSE;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setProcessorDataBus(String value) {
		this.processorDataBus = value;
	}
	
	public String getProcessorDataBus() {
		return processorDataBus;
	}
	
	public void setRamType(String value) {
		this.ramType = value;
	}
	
	public String getRamType() {
		return ramType;
	}
	
	public void setRamAmmount(double value) {
		setRamAmmount(new Double(value));
	}
	
	public void setRamAmmount(Double value) {
		this.ramAmmount = value;
	}
	
	public Double getRamAmmount() {
		return ramAmmount;
	}
	
	public void setGENERAL_PURPOSE(esca_orm.GENERAL_PURPOSE value) {
		if (this.GENERAL_PURPOSE != value) {
			esca_orm.GENERAL_PURPOSE lGENERAL_PURPOSE = this.GENERAL_PURPOSE;
			this.GENERAL_PURPOSE = value;
			if (value != null) {
				GENERAL_PURPOSE.setMiniSpecification(this);
			}
			if (lGENERAL_PURPOSE != null && lGENERAL_PURPOSE.getMiniSpecification() == this) {
				lGENERAL_PURPOSE.setMiniSpecification(null);
			}
		}
	}
	
	public esca_orm.GENERAL_PURPOSE getGENERAL_PURPOSE() {
		return GENERAL_PURPOSE;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
