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

public class Connector_TypeDAOImpl implements esca_orm.dao.Connector_TypeDAO {
	public Connector_Type loadConnector_TypeByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadConnector_TypeByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type getConnector_TypeByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return getConnector_TypeByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type loadConnector_TypeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadConnector_TypeByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type getConnector_TypeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return getConnector_TypeByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type loadConnector_TypeByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Connector_Type) session.load(esca_orm.Connector_Type.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type getConnector_TypeByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Connector_Type) session.get(esca_orm.Connector_Type.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type loadConnector_TypeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Connector_Type) session.load(esca_orm.Connector_Type.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type getConnector_TypeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Connector_Type) session.get(esca_orm.Connector_Type.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryConnector_Type(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return queryConnector_Type(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryConnector_Type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return queryConnector_Type(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type[] listConnector_TypeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return listConnector_TypeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type[] listConnector_TypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return listConnector_TypeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryConnector_Type(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.Connector_Type as Connector_Type");
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
	
	public List queryConnector_Type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.Connector_Type as Connector_Type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Connector_Type", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type[] listConnector_TypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryConnector_Type(session, condition, orderBy);
			return (Connector_Type[]) list.toArray(new Connector_Type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type[] listConnector_TypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryConnector_Type(session, condition, orderBy, lockMode);
			return (Connector_Type[]) list.toArray(new Connector_Type[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type loadConnector_TypeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadConnector_TypeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type loadConnector_TypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadConnector_TypeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type loadConnector_TypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Connector_Type[] connector_Types = listConnector_TypeByQuery(session, condition, orderBy);
		if (connector_Types != null && connector_Types.length > 0)
			return connector_Types[0];
		else
			return null;
	}
	
	public Connector_Type loadConnector_TypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Connector_Type[] connector_Types = listConnector_TypeByQuery(session, condition, orderBy, lockMode);
		if (connector_Types != null && connector_Types.length > 0)
			return connector_Types[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateConnector_TypeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return iterateConnector_TypeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateConnector_TypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return iterateConnector_TypeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateConnector_TypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.Connector_Type as Connector_Type");
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
	
	public java.util.Iterator iterateConnector_TypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.Connector_Type as Connector_Type");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Connector_Type", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Connector_Type createConnector_Type() {
		return new esca_orm.Connector_Type();
	}
	
	public boolean save(esca_orm.Connector_Type connector_Type) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().saveObject(connector_Type);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(esca_orm.Connector_Type connector_Type) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().deleteObject(connector_Type);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(esca_orm.Connector_Type connector_Type)throws PersistentException {
		try {
			if (connector_Type.getInput_Output_Devices() != null) {
				connector_Type.getInput_Output_Devices().setConnector_Type(null);
			}
			
			return delete(connector_Type);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(esca_orm.Connector_Type connector_Type, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (connector_Type.getInput_Output_Devices() != null) {
				connector_Type.getInput_Output_Devices().setConnector_Type(null);
			}
			
			try {
				session.delete(connector_Type);
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
	
	public boolean refresh(esca_orm.Connector_Type connector_Type) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().refresh(connector_Type);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(esca_orm.Connector_Type connector_Type) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().evict(connector_Type);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
