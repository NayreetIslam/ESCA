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

public interface PortDAO {
	public Port loadPortByORMID(int id) throws PersistentException;
	public Port getPortByORMID(int id) throws PersistentException;
	public Port loadPortByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Port getPortByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Port loadPortByORMID(PersistentSession session, int id) throws PersistentException;
	public Port getPortByORMID(PersistentSession session, int id) throws PersistentException;
	public Port loadPortByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Port getPortByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Port[] listPortByQuery(String condition, String orderBy) throws PersistentException;
	public Port[] listPortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryPort(String condition, String orderBy) throws PersistentException;
	public java.util.List queryPort(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iteratePortByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iteratePortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Port[] listPortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Port[] listPortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryPort(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryPort(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iteratePortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iteratePortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Port loadPortByQuery(String condition, String orderBy) throws PersistentException;
	public Port loadPortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Port loadPortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Port loadPortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Port createPort();
	public boolean save(esca_orm.Port port) throws PersistentException;
	public boolean delete(esca_orm.Port port) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.Port port) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.Port port, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.Port port) throws PersistentException;
	public boolean evict(esca_orm.Port port) throws PersistentException;
}
