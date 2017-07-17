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

public class Input_Output_Devices {
	public Input_Output_Devices() {
	}
	
	private int id;
	
	private String IOName;
	
	private Double cost;
	
	private Double powerConsumption;
	
	private Double weight;
	
	private esca_orm.Connector_Type connector_Type;
	
	private esca_orm.IOType IOType;
	
	private String buy_url;
	
	private String company;
	
	private String url_image;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setIOName(String value) {
		this.IOName = value;
	}
	
	public String getIOName() {
		return IOName;
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
	
	public void setPowerConsumption(double value) {
		setPowerConsumption(new Double(value));
	}
	
	public void setPowerConsumption(Double value) {
		this.powerConsumption = value;
	}
	
	public Double getPowerConsumption() {
		return powerConsumption;
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
	
	public void setBuy_url(String value) {
		this.buy_url = value;
	}
	
	public String getBuy_url() {
		return buy_url;
	}
	
	public void setCompany(String value) {
		this.company = value;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setUrl_image(String value) {
		this.url_image = value;
	}
	
	public String getUrl_image() {
		return url_image;
	}
	
	public void setIOType(esca_orm.IOType value) {
		if (this.IOType != value) {
			esca_orm.IOType lIOType = this.IOType;
			this.IOType = value;
			if (value != null) {
				IOType.setInput_Output_Devices(this);
			}
			if (lIOType != null && lIOType.getInput_Output_Devices() == this) {
				lIOType.setInput_Output_Devices(null);
			}
		}
	}
	
	public esca_orm.IOType getIOType() {
		return IOType;
	}
	
	public void setConnector_Type(esca_orm.Connector_Type value) {
		if (this.connector_Type != value) {
			esca_orm.Connector_Type lconnector_Type = this.connector_Type;
			this.connector_Type = value;
			if (value != null) {
				connector_Type.setInput_Output_Devices(this);
			}
			if (lconnector_Type != null && lconnector_Type.getInput_Output_Devices() == this) {
				lconnector_Type.setInput_Output_Devices(null);
			}
		}
	}
	
	public esca_orm.Connector_Type getConnector_Type() {
		return connector_Type;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
