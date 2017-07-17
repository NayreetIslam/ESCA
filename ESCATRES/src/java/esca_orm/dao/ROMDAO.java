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

public interface ROMDAO {
	public ROM loadROMByORMID(int id) throws PersistentException;
	public ROM getROMByORMID(int id) throws PersistentException;
	public ROM loadROMByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public ROM getROMByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public ROM loadROMByORMID(PersistentSession session, int id) throws PersistentException;
	public ROM getROMByORMID(PersistentSession session, int id) throws PersistentException;
	public ROM loadROMByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public ROM getROMByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public ROM[] listROMByQuery(String condition, String orderBy) throws PersistentException;
	public ROM[] listROMByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryROM(String condition, String orderBy) throws PersistentException;
	public java.util.List queryROM(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateROMByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateROMByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ROM[] listROMByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public ROM[] listROMByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryROM(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryROM(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateROMByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateROMByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ROM loadROMByQuery(String condition, String orderBy) throws PersistentException;
	public ROM loadROMByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ROM loadROMByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public ROM loadROMByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public ROM createROM();
	public boolean save(esca_orm.ROM rOM) throws PersistentException;
	public boolean delete(esca_orm.ROM rOM) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.ROM rOM) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.ROM rOM, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.ROM rOM) throws PersistentException;
	public boolean evict(esca_orm.ROM rOM) throws PersistentException;
}
