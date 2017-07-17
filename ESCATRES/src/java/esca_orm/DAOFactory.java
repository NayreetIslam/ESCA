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

import esca_orm.dao.*;

public abstract class DAOFactory {
	private static DAOFactory _factory = new DAOFactoryImpl();
	
	public static DAOFactory getDAOFactory() {
		return _factory;
	}
	
	public abstract GENERAL_PURPOSEDAO getGENERAL_PURPOSEDAO();
	public abstract ADD_FEATUREDAO getADD_FEATUREDAO();
	public abstract ProcessorDAO getProcessorDAO();
	public abstract DevelopmentBoardKitDAO getDevelopmentBoardKitDAO();
	public abstract RAMDAO getRAMDAO();
	public abstract MiniSpecificationDAO getMiniSpecificationDAO();
	public abstract ConstraintDAO getConstraintDAO();
	public abstract SensorDAO getSensorDAO();
	public abstract Input_Output_DevicesDAO getInput_Output_DevicesDAO();
	public abstract Connector_TypeDAO getConnector_TypeDAO();
	public abstract IOTypeDAO getIOTypeDAO();
	public abstract PortDAO getPortDAO();
	public abstract TypePortDAO getTypePortDAO();
	public abstract ROMDAO getROMDAO();
}

