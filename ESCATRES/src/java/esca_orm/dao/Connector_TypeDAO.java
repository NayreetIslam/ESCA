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

public interface Connector_TypeDAO {
	public Connector_Type loadConnector_TypeByORMID(int id) throws PersistentException;
	public Connector_Type getConnector_TypeByORMID(int id) throws PersistentException;
	public Connector_Type loadConnector_TypeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Connector_Type getConnector_TypeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Connector_Type loadConnector_TypeByORMID(PersistentSession session, int id) throws PersistentException;
	public Connector_Type getConnector_TypeByORMID(PersistentSession session, int id) throws PersistentException;
	public Connector_Type loadConnector_TypeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Connector_Type getConnector_TypeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Connector_Type[] listConnector_TypeByQuery(String condition, String orderBy) throws PersistentException;
	public Connector_Type[] listConnector_TypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryConnector_Type(String condition, String orderBy) throws PersistentException;
	public java.util.List queryConnector_Type(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateConnector_TypeByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateConnector_TypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Connector_Type[] listConnector_TypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Connector_Type[] listConnector_TypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryConnector_Type(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryConnector_Type(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateConnector_TypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateConnector_TypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Connector_Type loadConnector_TypeByQuery(String condition, String orderBy) throws PersistentException;
	public Connector_Type loadConnector_TypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Connector_Type loadConnector_TypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Connector_Type loadConnector_TypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Connector_Type createConnector_Type();
	public boolean save(esca_orm.Connector_Type connector_Type) throws PersistentException;
	public boolean delete(esca_orm.Connector_Type connector_Type) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.Connector_Type connector_Type) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.Connector_Type connector_Type, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.Connector_Type connector_Type) throws PersistentException;
	public boolean evict(esca_orm.Connector_Type connector_Type) throws PersistentException;
}
