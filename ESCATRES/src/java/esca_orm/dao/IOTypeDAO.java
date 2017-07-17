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

public interface IOTypeDAO {
	public IOType loadIOTypeByORMID(int id) throws PersistentException;
	public IOType getIOTypeByORMID(int id) throws PersistentException;
	public IOType loadIOTypeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public IOType getIOTypeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public IOType loadIOTypeByORMID(PersistentSession session, int id) throws PersistentException;
	public IOType getIOTypeByORMID(PersistentSession session, int id) throws PersistentException;
	public IOType loadIOTypeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public IOType getIOTypeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public IOType[] listIOTypeByQuery(String condition, String orderBy) throws PersistentException;
	public IOType[] listIOTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryIOType(String condition, String orderBy) throws PersistentException;
	public java.util.List queryIOType(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateIOTypeByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateIOTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public IOType[] listIOTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public IOType[] listIOTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryIOType(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryIOType(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateIOTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateIOTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public IOType loadIOTypeByQuery(String condition, String orderBy) throws PersistentException;
	public IOType loadIOTypeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public IOType loadIOTypeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public IOType loadIOTypeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public IOType createIOType();
	public boolean save(esca_orm.IOType iOType) throws PersistentException;
	public boolean delete(esca_orm.IOType iOType) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.IOType iOType) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.IOType iOType, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.IOType iOType) throws PersistentException;
	public boolean evict(esca_orm.IOType iOType) throws PersistentException;
}
