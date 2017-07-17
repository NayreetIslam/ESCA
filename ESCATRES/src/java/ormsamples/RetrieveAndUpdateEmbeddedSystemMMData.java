/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateEmbeddedSystemMMData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().beginTransaction();
		try {
			esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
			esca_orm.dao.GENERAL_PURPOSEDAO eSCA_ORMGENERAL_PURPOSEDAO = lDAOFactory.getGENERAL_PURPOSEDAO();
			esca_orm.GENERAL_PURPOSE eSCA_ORMGENERAL_PURPOSE = eSCA_ORMGENERAL_PURPOSEDAO.loadGENERAL_PURPOSEByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMGENERAL_PURPOSEDAO.save(eSCA_ORMGENERAL_PURPOSE);
			esca_orm.dao.ADD_FEATUREDAO eSCA_ORMADD_FEATUREDAO = lDAOFactory.getADD_FEATUREDAO();
			esca_orm.ADD_FEATURE eSCA_ORMADD_FEATURE = eSCA_ORMADD_FEATUREDAO.loadADD_FEATUREByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMADD_FEATUREDAO.save(eSCA_ORMADD_FEATURE);
			esca_orm.dao.ProcessorDAO eSCA_ORMProcessorDAO = lDAOFactory.getProcessorDAO();
			esca_orm.Processor eSCA_ORMProcessor = eSCA_ORMProcessorDAO.loadProcessorByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMProcessorDAO.save(eSCA_ORMProcessor);
			esca_orm.dao.DevelopmentBoardKitDAO eSCA_ORMDevelopmentBoardKitDAO = lDAOFactory.getDevelopmentBoardKitDAO();
			esca_orm.DevelopmentBoardKit eSCA_ORMDevelopmentBoardKit = eSCA_ORMDevelopmentBoardKitDAO.loadDevelopmentBoardKitByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMDevelopmentBoardKitDAO.save(eSCA_ORMDevelopmentBoardKit);
			esca_orm.dao.RAMDAO eSCA_ORMRAMDAO = lDAOFactory.getRAMDAO();
			esca_orm.RAM eSCA_ORMRAM = eSCA_ORMRAMDAO.loadRAMByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMRAMDAO.save(eSCA_ORMRAM);
			esca_orm.dao.MiniSpecificationDAO eSCA_ORMMiniSpecificationDAO = lDAOFactory.getMiniSpecificationDAO();
			esca_orm.MiniSpecification eSCA_ORMMiniSpecification = eSCA_ORMMiniSpecificationDAO.loadMiniSpecificationByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMMiniSpecificationDAO.save(eSCA_ORMMiniSpecification);
			esca_orm.dao.ConstraintDAO eSCA_ORMConstraintDAO = lDAOFactory.getConstraintDAO();
			esca_orm.Constraint eSCA_ORMConstraint = eSCA_ORMConstraintDAO.loadConstraintByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMConstraintDAO.save(eSCA_ORMConstraint);
			esca_orm.dao.SensorDAO eSCA_ORMSensorDAO = lDAOFactory.getSensorDAO();
			esca_orm.Sensor eSCA_ORMSensor = eSCA_ORMSensorDAO.loadSensorByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMSensorDAO.save(eSCA_ORMSensor);
			esca_orm.dao.Input_Output_DevicesDAO eSCA_ORMInput_Output_DevicesDAO = lDAOFactory.getInput_Output_DevicesDAO();
			esca_orm.Input_Output_Devices eSCA_ORMInput_Output_Devices = eSCA_ORMInput_Output_DevicesDAO.loadInput_Output_DevicesByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMInput_Output_DevicesDAO.save(eSCA_ORMInput_Output_Devices);
			esca_orm.dao.Connector_TypeDAO eSCA_ORMConnector_TypeDAO = lDAOFactory.getConnector_TypeDAO();
			esca_orm.Connector_Type eSCA_ORMConnector_Type = eSCA_ORMConnector_TypeDAO.loadConnector_TypeByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMConnector_TypeDAO.save(eSCA_ORMConnector_Type);
			esca_orm.dao.IOTypeDAO eSCA_ORMIOTypeDAO = lDAOFactory.getIOTypeDAO();
			esca_orm.IOType eSCA_ORMIOType = eSCA_ORMIOTypeDAO.loadIOTypeByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMIOTypeDAO.save(eSCA_ORMIOType);
			esca_orm.dao.PortDAO eSCA_ORMPortDAO = lDAOFactory.getPortDAO();
			esca_orm.Port eSCA_ORMPort = eSCA_ORMPortDAO.loadPortByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMPortDAO.save(eSCA_ORMPort);
			esca_orm.dao.TypePortDAO eSCA_ORMTypePortDAO = lDAOFactory.getTypePortDAO();
			esca_orm.TypePort eSCA_ORMTypePort = eSCA_ORMTypePortDAO.loadTypePortByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMTypePortDAO.save(eSCA_ORMTypePort);
			esca_orm.dao.ROMDAO eSCA_ORMROMDAO = lDAOFactory.getROMDAO();
			esca_orm.ROM eSCA_ORMROM = eSCA_ORMROMDAO.loadROMByQuery(null, null);
			// Update the properties of the persistent object
			eSCA_ORMROMDAO.save(eSCA_ORMROM);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateEmbeddedSystemMMData retrieveAndUpdateEmbeddedSystemMMData = new RetrieveAndUpdateEmbeddedSystemMMData();
			try {
				retrieveAndUpdateEmbeddedSystemMMData.retrieveAndUpdateTestData();
			}
			finally {
				Utility.shutdownDerby(esca_orm.EmbeddedSystemMMPersistentManager.instance());
				esca_orm.EmbeddedSystemMMPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
