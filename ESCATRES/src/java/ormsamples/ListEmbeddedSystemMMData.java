/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListEmbeddedSystemMMData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		esca_orm.DAOFactory lDAOFactory = esca_orm.DAOFactory.getDAOFactory();
		System.out.println("Listing GENERAL_PURPOSE...");
		esca_orm.GENERAL_PURPOSE[] eSCA_ORMGENERAL_PURPOSEs = lDAOFactory.getGENERAL_PURPOSEDAO().listGENERAL_PURPOSEByQuery(null, null);
		int length = Math.min(eSCA_ORMGENERAL_PURPOSEs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMGENERAL_PURPOSEs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ADD_FEATURE...");
		esca_orm.ADD_FEATURE[] eSCA_ORMADD_FEATUREs = lDAOFactory.getADD_FEATUREDAO().listADD_FEATUREByQuery(null, null);
		length = Math.min(eSCA_ORMADD_FEATUREs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMADD_FEATUREs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Processor...");
		esca_orm.Processor[] eSCA_ORMProcessors = lDAOFactory.getProcessorDAO().listProcessorByQuery(null, null);
		length = Math.min(eSCA_ORMProcessors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMProcessors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DevelopmentBoardKit...");
		esca_orm.DevelopmentBoardKit[] eSCA_ORMDevelopmentBoardKits = lDAOFactory.getDevelopmentBoardKitDAO().listDevelopmentBoardKitByQuery(null, null);
		length = Math.min(eSCA_ORMDevelopmentBoardKits.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMDevelopmentBoardKits[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing RAM...");
		esca_orm.RAM[] eSCA_ORMRAMs = lDAOFactory.getRAMDAO().listRAMByQuery(null, null);
		length = Math.min(eSCA_ORMRAMs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMRAMs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing MiniSpecification...");
		esca_orm.MiniSpecification[] eSCA_ORMMiniSpecifications = lDAOFactory.getMiniSpecificationDAO().listMiniSpecificationByQuery(null, null);
		length = Math.min(eSCA_ORMMiniSpecifications.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMMiniSpecifications[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Constraint...");
		esca_orm.Constraint[] eSCA_ORMConstraints = lDAOFactory.getConstraintDAO().listConstraintByQuery(null, null);
		length = Math.min(eSCA_ORMConstraints.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMConstraints[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sensor...");
		esca_orm.Sensor[] eSCA_ORMSensors = lDAOFactory.getSensorDAO().listSensorByQuery(null, null);
		length = Math.min(eSCA_ORMSensors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMSensors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Input_Output_Devices...");
		esca_orm.Input_Output_Devices[] eSCA_ORMInput_Output_Deviceses = lDAOFactory.getInput_Output_DevicesDAO().listInput_Output_DevicesByQuery(null, null);
		length = Math.min(eSCA_ORMInput_Output_Deviceses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMInput_Output_Deviceses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Connector_Type...");
		esca_orm.Connector_Type[] eSCA_ORMConnector_Types = lDAOFactory.getConnector_TypeDAO().listConnector_TypeByQuery(null, null);
		length = Math.min(eSCA_ORMConnector_Types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMConnector_Types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing IOType...");
		esca_orm.IOType[] eSCA_ORMIOTypes = lDAOFactory.getIOTypeDAO().listIOTypeByQuery(null, null);
		length = Math.min(eSCA_ORMIOTypes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMIOTypes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Port...");
		esca_orm.Port[] eSCA_ORMPorts = lDAOFactory.getPortDAO().listPortByQuery(null, null);
		length = Math.min(eSCA_ORMPorts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMPorts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TypePort...");
		esca_orm.TypePort[] eSCA_ORMTypePorts = lDAOFactory.getTypePortDAO().listTypePortByQuery(null, null);
		length = Math.min(eSCA_ORMTypePorts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMTypePorts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ROM...");
		esca_orm.ROM[] eSCA_ORMROMs = lDAOFactory.getROMDAO().listROMByQuery(null, null);
		length = Math.min(eSCA_ORMROMs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eSCA_ORMROMs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListEmbeddedSystemMMData listEmbeddedSystemMMData = new ListEmbeddedSystemMMData();
			try {
				listEmbeddedSystemMMData.listTestData();
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
