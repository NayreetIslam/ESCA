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

public class GENERAL_PURPOSEDAOImpl implements esca_orm.dao.GENERAL_PURPOSEDAO {
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadGENERAL_PURPOSEByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE getGENERAL_PURPOSEByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return getGENERAL_PURPOSEByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadGENERAL_PURPOSEByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE getGENERAL_PURPOSEByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return getGENERAL_PURPOSEByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (GENERAL_PURPOSE) session.load(esca_orm.GENERAL_PURPOSE.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE getGENERAL_PURPOSEByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (GENERAL_PURPOSE) session.get(esca_orm.GENERAL_PURPOSE.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (GENERAL_PURPOSE) session.load(esca_orm.GENERAL_PURPOSE.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE getGENERAL_PURPOSEByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (GENERAL_PURPOSE) session.get(esca_orm.GENERAL_PURPOSE.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryGENERAL_PURPOSE(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return queryGENERAL_PURPOSE(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryGENERAL_PURPOSE(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return queryGENERAL_PURPOSE(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE[] listGENERAL_PURPOSEByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return listGENERAL_PURPOSEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE[] listGENERAL_PURPOSEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return listGENERAL_PURPOSEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryGENERAL_PURPOSE(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.GENERAL_PURPOSE as GENERAL_PURPOSE");
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
	
	public List queryGENERAL_PURPOSE(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.GENERAL_PURPOSE as GENERAL_PURPOSE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("GENERAL_PURPOSE", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE[] listGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGENERAL_PURPOSE(session, condition, orderBy);
			return (GENERAL_PURPOSE[]) list.toArray(new GENERAL_PURPOSE[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE[] listGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGENERAL_PURPOSE(session, condition, orderBy, lockMode);
			return (GENERAL_PURPOSE[]) list.toArray(new GENERAL_PURPOSE[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadGENERAL_PURPOSEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadGENERAL_PURPOSEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		GENERAL_PURPOSE[] gENERAL_PURPOSEs = listGENERAL_PURPOSEByQuery(session, condition, orderBy);
		if (gENERAL_PURPOSEs != null && gENERAL_PURPOSEs.length > 0)
			return gENERAL_PURPOSEs[0];
		else
			return null;
	}
	
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		GENERAL_PURPOSE[] gENERAL_PURPOSEs = listGENERAL_PURPOSEByQuery(session, condition, orderBy, lockMode);
		if (gENERAL_PURPOSEs != null && gENERAL_PURPOSEs.length > 0)
			return gENERAL_PURPOSEs[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateGENERAL_PURPOSEByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return iterateGENERAL_PURPOSEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateGENERAL_PURPOSEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return iterateGENERAL_PURPOSEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.GENERAL_PURPOSE as GENERAL_PURPOSE");
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
	
	public java.util.Iterator iterateGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.GENERAL_PURPOSE as GENERAL_PURPOSE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("GENERAL_PURPOSE", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public GENERAL_PURPOSE createGENERAL_PURPOSE() {
		return new esca_orm.GENERAL_PURPOSE();
	}
	
	public boolean save(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().saveObject(gENERAL_PURPOSE);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().deleteObject(gENERAL_PURPOSE);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE)throws PersistentException {
		try {
			esca_orm.ADD_FEATURE[] lADD_FEATUREs = gENERAL_PURPOSE.ADD_FEATURE.toArray();
			for(int i = 0; i < lADD_FEATUREs.length; i++) {
				lADD_FEATUREs[i].GENERAL_PURPOSE.remove(gENERAL_PURPOSE);
			}
			if (gENERAL_PURPOSE.getMiniSpecification() != null) {
				gENERAL_PURPOSE.getMiniSpecification().setGENERAL_PURPOSE(null);
			}
			
			esca_orm.Constraint[] lConstraints = gENERAL_PURPOSE.constraint.toArray();
			for(int i = 0; i < lConstraints.length; i++) {
				lConstraints[i].GENERAL_PURPOSE.remove(gENERAL_PURPOSE);
			}
			return delete(gENERAL_PURPOSE);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE, org.orm.PersistentSession session)throws PersistentException {
		try {
			esca_orm.ADD_FEATURE[] lADD_FEATUREs = gENERAL_PURPOSE.ADD_FEATURE.toArray();
			for(int i = 0; i < lADD_FEATUREs.length; i++) {
				lADD_FEATUREs[i].GENERAL_PURPOSE.remove(gENERAL_PURPOSE);
			}
			if (gENERAL_PURPOSE.getMiniSpecification() != null) {
				gENERAL_PURPOSE.getMiniSpecification().setGENERAL_PURPOSE(null);
			}
			
			esca_orm.Constraint[] lConstraints = gENERAL_PURPOSE.constraint.toArray();
			for(int i = 0; i < lConstraints.length; i++) {
				lConstraints[i].GENERAL_PURPOSE.remove(gENERAL_PURPOSE);
			}
			try {
				session.delete(gENERAL_PURPOSE);
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
	
	public boolean refresh(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().refresh(gENERAL_PURPOSE);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().evict(gENERAL_PURPOSE);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
