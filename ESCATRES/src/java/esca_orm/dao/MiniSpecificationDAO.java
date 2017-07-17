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

public interface MiniSpecificationDAO {
	public MiniSpecification loadMiniSpecificationByORMID(int id) throws PersistentException;
	public MiniSpecification getMiniSpecificationByORMID(int id) throws PersistentException;
	public MiniSpecification loadMiniSpecificationByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public MiniSpecification getMiniSpecificationByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public MiniSpecification loadMiniSpecificationByORMID(PersistentSession session, int id) throws PersistentException;
	public MiniSpecification getMiniSpecificationByORMID(PersistentSession session, int id) throws PersistentException;
	public MiniSpecification loadMiniSpecificationByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public MiniSpecification getMiniSpecificationByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public MiniSpecification[] listMiniSpecificationByQuery(String condition, String orderBy) throws PersistentException;
	public MiniSpecification[] listMiniSpecificationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryMiniSpecification(String condition, String orderBy) throws PersistentException;
	public java.util.List queryMiniSpecification(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateMiniSpecificationByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateMiniSpecificationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public MiniSpecification[] listMiniSpecificationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public MiniSpecification[] listMiniSpecificationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryMiniSpecification(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryMiniSpecification(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateMiniSpecificationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateMiniSpecificationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public MiniSpecification loadMiniSpecificationByQuery(String condition, String orderBy) throws PersistentException;
	public MiniSpecification loadMiniSpecificationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public MiniSpecification loadMiniSpecificationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public MiniSpecification loadMiniSpecificationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public MiniSpecification createMiniSpecification();
	public boolean save(esca_orm.MiniSpecification miniSpecification) throws PersistentException;
	public boolean delete(esca_orm.MiniSpecification miniSpecification) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.MiniSpecification miniSpecification) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.MiniSpecification miniSpecification, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.MiniSpecification miniSpecification) throws PersistentException;
	public boolean evict(esca_orm.MiniSpecification miniSpecification) throws PersistentException;
}
