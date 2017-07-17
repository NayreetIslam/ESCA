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

public interface ProcessorDAO {
	public Processor loadProcessorByORMID(int id) throws PersistentException;
	public Processor getProcessorByORMID(int id) throws PersistentException;
	public Processor loadProcessorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Processor getProcessorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Processor loadProcessorByORMID(PersistentSession session, int id) throws PersistentException;
	public Processor getProcessorByORMID(PersistentSession session, int id) throws PersistentException;
	public Processor loadProcessorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Processor getProcessorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Processor[] listProcessorByQuery(String condition, String orderBy) throws PersistentException;
	public Processor[] listProcessorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryProcessor(String condition, String orderBy) throws PersistentException;
	public java.util.List queryProcessor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateProcessorByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateProcessorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Processor[] listProcessorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Processor[] listProcessorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryProcessor(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryProcessor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateProcessorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateProcessorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Processor loadProcessorByQuery(String condition, String orderBy) throws PersistentException;
	public Processor loadProcessorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Processor loadProcessorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Processor loadProcessorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Processor createProcessor();
	public boolean save(esca_orm.Processor processor) throws PersistentException;
	public boolean delete(esca_orm.Processor processor) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.Processor processor) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.Processor processor, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.Processor processor) throws PersistentException;
	public boolean evict(esca_orm.Processor processor) throws PersistentException;
}
