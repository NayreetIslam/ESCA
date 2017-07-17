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

public interface SensorDAO {
	public Sensor loadSensorByORMID(int id) throws PersistentException;
	public Sensor getSensorByORMID(int id) throws PersistentException;
	public Sensor loadSensorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Sensor getSensorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Sensor loadSensorByORMID(PersistentSession session, int id) throws PersistentException;
	public Sensor getSensorByORMID(PersistentSession session, int id) throws PersistentException;
	public Sensor loadSensorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Sensor getSensorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Sensor[] listSensorByQuery(String condition, String orderBy) throws PersistentException;
	public Sensor[] listSensorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List querySensor(String condition, String orderBy) throws PersistentException;
	public java.util.List querySensor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateSensorByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateSensorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Sensor[] listSensorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Sensor[] listSensorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List querySensor(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List querySensor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateSensorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateSensorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Sensor loadSensorByQuery(String condition, String orderBy) throws PersistentException;
	public Sensor loadSensorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Sensor loadSensorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Sensor loadSensorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Sensor createSensor();
	public boolean save(esca_orm.Sensor sensor) throws PersistentException;
	public boolean delete(esca_orm.Sensor sensor) throws PersistentException;
	public boolean refresh(esca_orm.Sensor sensor) throws PersistentException;
	public boolean evict(esca_orm.Sensor sensor) throws PersistentException;
}
