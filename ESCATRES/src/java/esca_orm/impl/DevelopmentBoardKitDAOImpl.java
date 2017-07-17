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

public class DevelopmentBoardKitDAOImpl implements esca_orm.dao.DevelopmentBoardKitDAO {
	public DevelopmentBoardKit loadDevelopmentBoardKitByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadDevelopmentBoardKitByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit getDevelopmentBoardKitByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return getDevelopmentBoardKitByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit loadDevelopmentBoardKitByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadDevelopmentBoardKitByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit getDevelopmentBoardKitByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return getDevelopmentBoardKitByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit loadDevelopmentBoardKitByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (DevelopmentBoardKit) session.load(esca_orm.DevelopmentBoardKit.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit getDevelopmentBoardKitByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (DevelopmentBoardKit) session.get(esca_orm.DevelopmentBoardKit.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit loadDevelopmentBoardKitByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DevelopmentBoardKit) session.load(esca_orm.DevelopmentBoardKit.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit getDevelopmentBoardKitByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DevelopmentBoardKit) session.get(esca_orm.DevelopmentBoardKit.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryDevelopmentBoardKit(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return queryDevelopmentBoardKit(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryDevelopmentBoardKit(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return queryDevelopmentBoardKit(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit[] listDevelopmentBoardKitByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return listDevelopmentBoardKitByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit[] listDevelopmentBoardKitByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return listDevelopmentBoardKitByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryDevelopmentBoardKit(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.DevelopmentBoardKit as DevelopmentBoardKit");
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
	
	public List queryDevelopmentBoardKit(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.DevelopmentBoardKit as DevelopmentBoardKit");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DevelopmentBoardKit", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit[] listDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDevelopmentBoardKit(session, condition, orderBy);
			return (DevelopmentBoardKit[]) list.toArray(new DevelopmentBoardKit[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit[] listDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDevelopmentBoardKit(session, condition, orderBy, lockMode);
			return (DevelopmentBoardKit[]) list.toArray(new DevelopmentBoardKit[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit loadDevelopmentBoardKitByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadDevelopmentBoardKitByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit loadDevelopmentBoardKitByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadDevelopmentBoardKitByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit loadDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		DevelopmentBoardKit[] developmentBoardKits = listDevelopmentBoardKitByQuery(session, condition, orderBy);
		if (developmentBoardKits != null && developmentBoardKits.length > 0)
			return developmentBoardKits[0];
		else
			return null;
	}
	
	public DevelopmentBoardKit loadDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		DevelopmentBoardKit[] developmentBoardKits = listDevelopmentBoardKitByQuery(session, condition, orderBy, lockMode);
		if (developmentBoardKits != null && developmentBoardKits.length > 0)
			return developmentBoardKits[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateDevelopmentBoardKitByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return iterateDevelopmentBoardKitByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateDevelopmentBoardKitByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return iterateDevelopmentBoardKitByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.DevelopmentBoardKit as DevelopmentBoardKit");
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
	
	public java.util.Iterator iterateDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.DevelopmentBoardKit as DevelopmentBoardKit");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DevelopmentBoardKit", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public DevelopmentBoardKit createDevelopmentBoardKit() {
		return new esca_orm.DevelopmentBoardKit();
	}
	
	public boolean save(esca_orm.DevelopmentBoardKit developmentBoardKit) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().saveObject(developmentBoardKit);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(esca_orm.DevelopmentBoardKit developmentBoardKit) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().deleteObject(developmentBoardKit);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(esca_orm.DevelopmentBoardKit developmentBoardKit)throws PersistentException {
		try {
			if (developmentBoardKit.getProcessor() != null) {
				developmentBoardKit.getProcessor().developmentBoardKit.remove(developmentBoardKit);
			}
			
			if (developmentBoardKit.getRAM() != null) {
				developmentBoardKit.getRAM().developmentBoardKit.remove(developmentBoardKit);
			}
			
			if (developmentBoardKit.getROM() != null) {
				developmentBoardKit.getROM().developmentBoardKit.remove(developmentBoardKit);
			}
			
			esca_orm.Port[] lPorts = developmentBoardKit.port.toArray();
			for(int i = 0; i < lPorts.length; i++) {
				lPorts[i].developmentBoardKit.remove(developmentBoardKit);
			}
			return delete(developmentBoardKit);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(esca_orm.DevelopmentBoardKit developmentBoardKit, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (developmentBoardKit.getProcessor() != null) {
				developmentBoardKit.getProcessor().developmentBoardKit.remove(developmentBoardKit);
			}
			
			if (developmentBoardKit.getRAM() != null) {
				developmentBoardKit.getRAM().developmentBoardKit.remove(developmentBoardKit);
			}
			
			if (developmentBoardKit.getROM() != null) {
				developmentBoardKit.getROM().developmentBoardKit.remove(developmentBoardKit);
			}
			
			esca_orm.Port[] lPorts = developmentBoardKit.port.toArray();
			for(int i = 0; i < lPorts.length; i++) {
				lPorts[i].developmentBoardKit.remove(developmentBoardKit);
			}
			try {
				session.delete(developmentBoardKit);
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
	
	public boolean refresh(esca_orm.DevelopmentBoardKit developmentBoardKit) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().refresh(developmentBoardKit);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(esca_orm.DevelopmentBoardKit developmentBoardKit) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().evict(developmentBoardKit);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
