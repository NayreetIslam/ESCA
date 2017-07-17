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

public interface TypePortDAO {
	public TypePort loadTypePortByORMID(int id) throws PersistentException;
	public TypePort getTypePortByORMID(int id) throws PersistentException;
	public TypePort loadTypePortByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public TypePort getTypePortByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public TypePort loadTypePortByORMID(PersistentSession session, int id) throws PersistentException;
	public TypePort getTypePortByORMID(PersistentSession session, int id) throws PersistentException;
	public TypePort loadTypePortByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public TypePort getTypePortByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public TypePort[] listTypePortByQuery(String condition, String orderBy) throws PersistentException;
	public TypePort[] listTypePortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryTypePort(String condition, String orderBy) throws PersistentException;
	public java.util.List queryTypePort(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateTypePortByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateTypePortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public TypePort[] listTypePortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public TypePort[] listTypePortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryTypePort(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryTypePort(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateTypePortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateTypePortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public TypePort loadTypePortByQuery(String condition, String orderBy) throws PersistentException;
	public TypePort loadTypePortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public TypePort loadTypePortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public TypePort loadTypePortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public TypePort createTypePort();
	public boolean save(esca_orm.TypePort typePort) throws PersistentException;
	public boolean delete(esca_orm.TypePort typePort) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.TypePort typePort) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.TypePort typePort, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.TypePort typePort) throws PersistentException;
	public boolean evict(esca_orm.TypePort typePort) throws PersistentException;
}
