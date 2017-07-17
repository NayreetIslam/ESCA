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

public class ADD_FEATUREDAOImpl implements esca_orm.dao.ADD_FEATUREDAO {
	public ADD_FEATURE loadADD_FEATUREByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadADD_FEATUREByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE getADD_FEATUREByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return getADD_FEATUREByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE loadADD_FEATUREByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadADD_FEATUREByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE getADD_FEATUREByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return getADD_FEATUREByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE loadADD_FEATUREByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (ADD_FEATURE) session.load(esca_orm.ADD_FEATURE.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE getADD_FEATUREByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (ADD_FEATURE) session.get(esca_orm.ADD_FEATURE.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE loadADD_FEATUREByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ADD_FEATURE) session.load(esca_orm.ADD_FEATURE.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE getADD_FEATUREByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ADD_FEATURE) session.get(esca_orm.ADD_FEATURE.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryADD_FEATURE(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return queryADD_FEATURE(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryADD_FEATURE(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return queryADD_FEATURE(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE[] listADD_FEATUREByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return listADD_FEATUREByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE[] listADD_FEATUREByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return listADD_FEATUREByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryADD_FEATURE(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.ADD_FEATURE as ADD_FEATURE");
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
	
	public List queryADD_FEATURE(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.ADD_FEATURE as ADD_FEATURE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ADD_FEATURE", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE[] listADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryADD_FEATURE(session, condition, orderBy);
			return (ADD_FEATURE[]) list.toArray(new ADD_FEATURE[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE[] listADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryADD_FEATURE(session, condition, orderBy, lockMode);
			return (ADD_FEATURE[]) list.toArray(new ADD_FEATURE[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE loadADD_FEATUREByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadADD_FEATUREByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE loadADD_FEATUREByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return loadADD_FEATUREByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE loadADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ADD_FEATURE[] aDD_FEATUREs = listADD_FEATUREByQuery(session, condition, orderBy);
		if (aDD_FEATUREs != null && aDD_FEATUREs.length > 0)
			return aDD_FEATUREs[0];
		else
			return null;
	}
	
	public ADD_FEATURE loadADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ADD_FEATURE[] aDD_FEATUREs = listADD_FEATUREByQuery(session, condition, orderBy, lockMode);
		if (aDD_FEATUREs != null && aDD_FEATUREs.length > 0)
			return aDD_FEATUREs[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateADD_FEATUREByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return iterateADD_FEATUREByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateADD_FEATUREByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession();
			return iterateADD_FEATUREByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.ADD_FEATURE as ADD_FEATURE");
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
	
	public java.util.Iterator iterateADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From esca_orm.ADD_FEATURE as ADD_FEATURE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ADD_FEATURE", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public ADD_FEATURE createADD_FEATURE() {
		return new esca_orm.ADD_FEATURE();
	}
	
	public boolean save(esca_orm.ADD_FEATURE aDD_FEATURE) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().saveObject(aDD_FEATURE);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(esca_orm.ADD_FEATURE aDD_FEATURE) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().deleteObject(aDD_FEATURE);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(esca_orm.ADD_FEATURE aDD_FEATURE)throws PersistentException {
		try {
			esca_orm.GENERAL_PURPOSE[] lGENERAL_PURPOSEs = aDD_FEATURE.GENERAL_PURPOSE.toArray();
			for(int i = 0; i < lGENERAL_PURPOSEs.length; i++) {
				lGENERAL_PURPOSEs[i].ADD_FEATURE.remove(aDD_FEATURE);
			}
			esca_orm.Constraint[] lConstraints = aDD_FEATURE.constraint.toArray();
			for(int i = 0; i < lConstraints.length; i++) {
				lConstraints[i].ADD_FEATURE.remove(aDD_FEATURE);
			}
			return delete(aDD_FEATURE);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(esca_orm.ADD_FEATURE aDD_FEATURE, org.orm.PersistentSession session)throws PersistentException {
		try {
			esca_orm.GENERAL_PURPOSE[] lGENERAL_PURPOSEs = aDD_FEATURE.GENERAL_PURPOSE.toArray();
			for(int i = 0; i < lGENERAL_PURPOSEs.length; i++) {
				lGENERAL_PURPOSEs[i].ADD_FEATURE.remove(aDD_FEATURE);
			}
			esca_orm.Constraint[] lConstraints = aDD_FEATURE.constraint.toArray();
			for(int i = 0; i < lConstraints.length; i++) {
				lConstraints[i].ADD_FEATURE.remove(aDD_FEATURE);
			}
			try {
				session.delete(aDD_FEATURE);
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
	
	public boolean refresh(esca_orm.ADD_FEATURE aDD_FEATURE) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().refresh(aDD_FEATURE);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(esca_orm.ADD_FEATURE aDD_FEATURE) throws PersistentException {
		try {
			esca_orm.EmbeddedSystemMMPersistentManager.instance().getSession().evict(aDD_FEATURE);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
