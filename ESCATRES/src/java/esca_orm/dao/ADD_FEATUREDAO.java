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
package esca_orm.dao;

import org.orm.*;
import org.hibernate.LockMode;
import esca_orm.*;

public interface ADD_FEATUREDAO {
	public ADD_FEATURE loadADD_FEATUREByORMID(int id) throws PersistentException;
	public ADD_FEATURE getADD_FEATUREByORMID(int id) throws PersistentException;
	public ADD_FEATURE loadADD_FEATUREByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public ADD_FEATURE getADD_FEATUREByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public ADD_FEATURE loadADD_FEATUREByORMID(PersistentSession session, int id) throws PersistentException;
	public ADD_FEATURE getADD_FEATUREByORMID(PersistentSession session, int id) throws PersistentException;
	public ADD_FEATURE loadADD_FEATUREByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public ADD_FEATURE getADD_FEATUREByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public ADD_FEATURE[] listADD_FEATUREByQuery(String condition, String orderBy) throws PersistentException;
	public ADD_FEATURE[] listADD_FEATUREByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryADD_FEATURE(String condition, String orderBy) throws PersistentException;
	public java.util.List queryADD_FEATURE(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateADD_FEATUREByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateADD_FEATUREByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ADD_FEATURE[] listADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public ADD_FEATURE[] listADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryADD_FEATURE(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryADD_FEATURE(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ADD_FEATURE loadADD_FEATUREByQuery(String condition, String orderBy) throws PersistentException;
	public ADD_FEATURE loadADD_FEATUREByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ADD_FEATURE loadADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public ADD_FEATURE loadADD_FEATUREByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ADD_FEATURE createADD_FEATURE();
	public boolean save(esca_orm.ADD_FEATURE aDD_FEATURE) throws PersistentException;
	public boolean delete(esca_orm.ADD_FEATURE aDD_FEATURE) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.ADD_FEATURE aDD_FEATURE) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.ADD_FEATURE aDD_FEATURE, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.ADD_FEATURE aDD_FEATURE) throws PersistentException;
	public boolean evict(esca_orm.ADD_FEATURE aDD_FEATURE) throws PersistentException;
}
