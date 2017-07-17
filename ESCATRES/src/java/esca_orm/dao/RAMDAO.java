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

public interface RAMDAO {
	public RAM loadRAMByORMID(int id) throws PersistentException;
	public RAM getRAMByORMID(int id) throws PersistentException;
	public RAM loadRAMByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public RAM getRAMByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public RAM loadRAMByORMID(PersistentSession session, int id) throws PersistentException;
	public RAM getRAMByORMID(PersistentSession session, int id) throws PersistentException;
	public RAM loadRAMByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public RAM getRAMByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public RAM[] listRAMByQuery(String condition, String orderBy) throws PersistentException;
	public RAM[] listRAMByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryRAM(String condition, String orderBy) throws PersistentException;
	public java.util.List queryRAM(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateRAMByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateRAMByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public RAM[] listRAMByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public RAM[] listRAMByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryRAM(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryRAM(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateRAMByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateRAMByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public RAM loadRAMByQuery(String condition, String orderBy) throws PersistentException;
	public RAM loadRAMByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public RAM loadRAMByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public RAM loadRAMByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public RAM createRAM();
	public boolean save(esca_orm.RAM rAM) throws PersistentException;
	public boolean delete(esca_orm.RAM rAM) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.RAM rAM) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.RAM rAM, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.RAM rAM) throws PersistentException;
	public boolean evict(esca_orm.RAM rAM) throws PersistentException;
}
