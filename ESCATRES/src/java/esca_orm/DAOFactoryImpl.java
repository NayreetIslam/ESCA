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
import esca_orm.impl.*;

public class DAOFactoryImpl extends DAOFactory {
	private GENERAL_PURPOSEDAO _gENERAL_PURPOSEDAO = new GENERAL_PURPOSEDAOImpl();
	public GENERAL_PURPOSEDAO getGENERAL_PURPOSEDAO() {
		return _gENERAL_PURPOSEDAO;
	}
	
	private ADD_FEATUREDAO _aDD_FEATUREDAO = new ADD_FEATUREDAOImpl();
	public ADD_FEATUREDAO getADD_FEATUREDAO() {
		return _aDD_FEATUREDAO;
	}
	
	private ProcessorDAO _processorDAO = new ProcessorDAOImpl();
	public ProcessorDAO getProcessorDAO() {
		return _processorDAO;
	}
	
	private DevelopmentBoardKitDAO _developmentBoardKitDAO = new DevelopmentBoardKitDAOImpl();
	public DevelopmentBoardKitDAO getDevelopmentBoardKitDAO() {
		return _developmentBoardKitDAO;
	}
	
	private RAMDAO _rAMDAO = new RAMDAOImpl();
	public RAMDAO getRAMDAO() {
		return _rAMDAO;
	}
	
	private MiniSpecificationDAO _miniSpecificationDAO = new MiniSpecificationDAOImpl();
	public MiniSpecificationDAO getMiniSpecificationDAO() {
		return _miniSpecificationDAO;
	}
	
	private ConstraintDAO _constraintDAO = new ConstraintDAOImpl();
	public ConstraintDAO getConstraintDAO() {
		return _constraintDAO;
	}
	
	private SensorDAO _sensorDAO = new SensorDAOImpl();
	public SensorDAO getSensorDAO() {
		return _sensorDAO;
	}
	
	private Input_Output_DevicesDAO _input_Output_DevicesDAO = new Input_Output_DevicesDAOImpl();
	public Input_Output_DevicesDAO getInput_Output_DevicesDAO() {
		return _input_Output_DevicesDAO;
	}
	
	private Connector_TypeDAO _connector_TypeDAO = new Connector_TypeDAOImpl();
	public Connector_TypeDAO getConnector_TypeDAO() {
		return _connector_TypeDAO;
	}
	
	private IOTypeDAO _iOTypeDAO = new IOTypeDAOImpl();
	public IOTypeDAO getIOTypeDAO() {
		return _iOTypeDAO;
	}
	
	private PortDAO _portDAO = new PortDAOImpl();
	public PortDAO getPortDAO() {
		return _portDAO;
	}
	
	private TypePortDAO _typePortDAO = new TypePortDAOImpl();
	public TypePortDAO getTypePortDAO() {
		return _typePortDAO;
	}
	
	private ROMDAO _rOMDAO = new ROMDAOImpl();
	public ROMDAO getROMDAO() {
		return _rOMDAO;
	}
	
}

