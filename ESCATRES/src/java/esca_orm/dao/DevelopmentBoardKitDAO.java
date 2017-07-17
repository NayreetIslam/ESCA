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

public interface DevelopmentBoardKitDAO {
	public DevelopmentBoardKit loadDevelopmentBoardKitByORMID(int id) throws PersistentException;
	public DevelopmentBoardKit getDevelopmentBoardKitByORMID(int id) throws PersistentException;
	public DevelopmentBoardKit loadDevelopmentBoardKitByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public DevelopmentBoardKit getDevelopmentBoardKitByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public DevelopmentBoardKit loadDevelopmentBoardKitByORMID(PersistentSession session, int id) throws PersistentException;
	public DevelopmentBoardKit getDevelopmentBoardKitByORMID(PersistentSession session, int id) throws PersistentException;
	public DevelopmentBoardKit loadDevelopmentBoardKitByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public DevelopmentBoardKit getDevelopmentBoardKitByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public DevelopmentBoardKit[] listDevelopmentBoardKitByQuery(String condition, String orderBy) throws PersistentException;
	public DevelopmentBoardKit[] listDevelopmentBoardKitByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDevelopmentBoardKit(String condition, String orderBy) throws PersistentException;
	public java.util.List queryDevelopmentBoardKit(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDevelopmentBoardKitByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDevelopmentBoardKitByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DevelopmentBoardKit[] listDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public DevelopmentBoardKit[] listDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryDevelopmentBoardKit(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryDevelopmentBoardKit(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DevelopmentBoardKit loadDevelopmentBoardKitByQuery(String condition, String orderBy) throws PersistentException;
	public DevelopmentBoardKit loadDevelopmentBoardKitByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DevelopmentBoardKit loadDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public DevelopmentBoardKit loadDevelopmentBoardKitByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public DevelopmentBoardKit createDevelopmentBoardKit();
	public boolean save(esca_orm.DevelopmentBoardKit developmentBoardKit) throws PersistentException;
	public boolean delete(esca_orm.DevelopmentBoardKit developmentBoardKit) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.DevelopmentBoardKit developmentBoardKit) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.DevelopmentBoardKit developmentBoardKit, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.DevelopmentBoardKit developmentBoardKit) throws PersistentException;
	public boolean evict(esca_orm.DevelopmentBoardKit developmentBoardKit) throws PersistentException;
}
