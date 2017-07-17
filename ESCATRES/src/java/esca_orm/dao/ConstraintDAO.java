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

public interface ConstraintDAO {
	public Constraint loadConstraintByORMID(int id) throws PersistentException;
	public Constraint getConstraintByORMID(int id) throws PersistentException;
	public Constraint loadConstraintByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Constraint getConstraintByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Constraint loadConstraintByORMID(PersistentSession session, int id) throws PersistentException;
	public Constraint getConstraintByORMID(PersistentSession session, int id) throws PersistentException;
	public Constraint loadConstraintByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Constraint getConstraintByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Constraint[] listConstraintByQuery(String condition, String orderBy) throws PersistentException;
	public Constraint[] listConstraintByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryConstraint(String condition, String orderBy) throws PersistentException;
	public java.util.List queryConstraint(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateConstraintByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateConstraintByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Constraint[] listConstraintByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Constraint[] listConstraintByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryConstraint(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryConstraint(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateConstraintByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateConstraintByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Constraint loadConstraintByQuery(String condition, String orderBy) throws PersistentException;
	public Constraint loadConstraintByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Constraint loadConstraintByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Constraint loadConstraintByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Constraint createConstraint();
	public boolean save(esca_orm.Constraint constraint) throws PersistentException;
	public boolean delete(esca_orm.Constraint constraint) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.Constraint constraint) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.Constraint constraint, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.Constraint constraint) throws PersistentException;
	public boolean evict(esca_orm.Constraint constraint) throws PersistentException;
}
