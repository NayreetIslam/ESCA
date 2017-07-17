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
package esca_orm.impl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;
import esca_orm.*;

public class Input_Output_DevicesDAOImpl implements esca_orm.dao.Input_Output_DevicesDAO {
	public Input_Output_Devices loadInput_Output_DevicesByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadInput_Output_DevicesByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices getInput_Output_DevicesByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return getInput_Output_DevicesByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices loadInput_Output_DevicesByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadInput_Output_DevicesByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices getInput_Output_DevicesByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return getInput_Output_DevicesByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices loadInput_Output_DevicesByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Input_Output_Devices) session.load(esca_orm.Input_Output_Devices.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices getInput_Output_DevicesByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Input_Output_Devices) session.get(esca_orm.Input_Output_Devices.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices loadInput_Output_DevicesByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Input_Output_Devices) session.load(esca_orm.Input_Output_Devices.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices getInput_Output_DevicesByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Input_Output_Devices) session.get(esca_orm.Input_Output_Devices.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryInput_Output_Devices(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return queryInput_Output_Devices(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryInput_Output_Devices(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return queryInput_Output_Devices(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices[] listInput_Output_DevicesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return listInput_Output_DevicesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices[] listInput_Output_DevicesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return listInput_Output_DevicesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryInput_Output_Devices(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.Input_Output_Devices as Input_Output_Devices");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryInput_Output_Devices(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.Input_Output_Devices as Input_Output_Devices");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Input_Output_Devices", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices[] listInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryInput_Output_Devices(session, condition, orderBy);
			return (Input_Output_Devices[]) list.toArray(new Input_Output_Devices[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices[] listInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryInput_Output_Devices(session, condition, orderBy, lockMode);
			return (Input_Output_Devices[]) list.toArray(new Input_Output_Devices[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices loadInput_Output_DevicesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadInput_Output_DevicesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices loadInput_Output_DevicesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadInput_Output_DevicesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices loadInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Input_Output_Devices[] input_Output_Deviceses = listInput_Output_DevicesByQuery(session, condition, orderBy);
		if (input_Output_Deviceses != null && input_Output_Deviceses.length > 0)
			return input_Output_Deviceses[0];
		else
			return null;
	}
	
	public Input_Output_Devices loadInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Input_Output_Devices[] input_Output_Deviceses = listInput_Output_DevicesByQuery(session, condition, orderBy, lockMode);
		if (input_Output_Deviceses != null && input_Output_Deviceses.length > 0)
			return input_Output_Deviceses[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateInput_Output_DevicesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return iterateInput_Output_DevicesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateInput_Output_DevicesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return iterateInput_Output_DevicesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.Input_Output_Devices as Input_Output_Devices");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.Input_Output_Devices as Input_Output_Devices");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Input_Output_Devices", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Input_Output_Devices createInput_Output_Devices() {
		return new esca_orm.Input_Output_Devices();
	}
	
	public boolean save(esca_orm.Input_Output_Devices input_Output_Devices) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().saveObject(input_Output_Devices);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(esca_orm.Input_Output_Devices input_Output_Devices) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().deleteObject(input_Output_Devices);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(esca_orm.Input_Output_Devices input_Output_Devices)throws PersistentException {
		try {
			if (input_Output_Devices.getConnector_Type() != null) {
				input_Output_Devices.getConnector_Type().setInput_Output_Devices(null);
			}
			
			if (input_Output_Devices.getIOType() != null) {
				input_Output_Devices.getIOType().setInput_Output_Devices(null);
			}
			
			return delete(input_Output_Devices);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(esca_orm.Input_Output_Devices input_Output_Devices, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (input_Output_Devices.getConnector_Type() != null) {
				input_Output_Devices.getConnector_Type().setInput_Output_Devices(null);
			}
			
			if (input_Output_Devices.getIOType() != null) {
				input_Output_Devices.getIOType().setInput_Output_Devices(null);
			}
			
			try {
				session.delete(input_Output_Devices);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(esca_orm.Input_Output_Devices input_Output_Devices) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().refresh(input_Output_Devices);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(esca_orm.Input_Output_Devices input_Output_Devices) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().evict(input_Output_Devices);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
