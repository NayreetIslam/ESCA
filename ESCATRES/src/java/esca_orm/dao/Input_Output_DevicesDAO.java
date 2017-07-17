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

public interface Input_Output_DevicesDAO {
	public Input_Output_Devices loadInput_Output_DevicesByORMID(int id) throws PersistentException;
	public Input_Output_Devices getInput_Output_DevicesByORMID(int id) throws PersistentException;
	public Input_Output_Devices loadInput_Output_DevicesByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Input_Output_Devices getInput_Output_DevicesByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Input_Output_Devices loadInput_Output_DevicesByORMID(PersistentSession session, int id) throws PersistentException;
	public Input_Output_Devices getInput_Output_DevicesByORMID(PersistentSession session, int id) throws PersistentException;
	public Input_Output_Devices loadInput_Output_DevicesByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Input_Output_Devices getInput_Output_DevicesByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException;
	public Input_Output_Devices[] listInput_Output_DevicesByQuery(String condition, String orderBy) throws PersistentException;
	public Input_Output_Devices[] listInput_Output_DevicesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryInput_Output_Devices(String condition, String orderBy) throws PersistentException;
	public java.util.List queryInput_Output_Devices(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateInput_Output_DevicesByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateInput_Output_DevicesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Input_Output_Devices[] listInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Input_Output_Devices[] listInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryInput_Output_Devices(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryInput_Output_Devices(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Input_Output_Devices loadInput_Output_DevicesByQuery(String condition, String orderBy) throws PersistentException;
	public Input_Output_Devices loadInput_Output_DevicesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Input_Output_Devices loadInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Input_Output_Devices loadInput_Output_DevicesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Input_Output_Devices createInput_Output_Devices();
	public boolean save(esca_orm.Input_Output_Devices input_Output_Devices) throws PersistentException;
	public boolean delete(esca_orm.Input_Output_Devices input_Output_Devices) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.Input_Output_Devices input_Output_Devices) throws PersistentException;
	public boolean deleteAndDissociate(esca_orm.Input_Output_Devices input_Output_Devices, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(esca_orm.Input_Output_Devices input_Output_Devices) throws PersistentException;
	public boolean evict(esca_orm.Input_Output_Devices input_Output_Devices) throws PersistentException;
}
