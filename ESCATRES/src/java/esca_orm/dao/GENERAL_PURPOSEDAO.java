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

public interface GENERAL_PURPOSEDAO {
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByORMID(int id) throws PersistentException;
	public GENERAL_PURPOSE getGENERAL_PURPOSEByORMID(int id) throws PersistentException;
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public GENERAL_PURPOSE getGENERAL_PURPOSEByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByORMID(PersistentSession session, int id) throws PersistentException;
	public GENERAL_PURPOSE getGENERAL_PURPOSEByORMID(PersistentSession session, int id) throws PersistentException;
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public GENERAL_PURPOSE getGENERAL_PURPOSEByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public GENERAL_PURPOSE[] listGENERAL_PURPOSEByQuery(String condition, String orderBy) throws PersistentException;
	public GENERAL_PURPOSE[] listGENERAL_PURPOSEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryGENERAL_PURPOSE(String condition, String orderBy) throws PersistentException;
	public java.util.List queryGENERAL_PURPOSE(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateGENERAL_PURPOSEByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateGENERAL_PURPOSEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public GENERAL_PURPOSE[] listGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public GENERAL_PURPOSE[] listGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryGENERAL_PURPOSE(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryGENERAL_PURPOSE(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByQuery(String condition, String orderBy) throws PersistentException;
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public GENERAL_PURPOSE loadGENERAL_PURPOSEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public GENERAL_PURPOSE createGENERAL_PURPOSE();
	public boolean save(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE) throws PersistentException;
	public boolean delete(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE) throws PersistentException;
	public boolean evict(esca_orm.GENERAL_PURPOSE gENERAL_PURPOSE) throws PersistentException;
}
