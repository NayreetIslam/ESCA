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
package esca_orm;

import org.orm.*;

public class DevelopmentBoardKitSetCollection extends org.orm.util.ORMSet {
	public DevelopmentBoardKitSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public DevelopmentBoardKitSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persistent objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(DevelopmentBoardKit value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(DevelopmentBoardKit value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(DevelopmentBoardKit value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public DevelopmentBoardKit[] toArray() {
		return (DevelopmentBoardKit[]) super.toArray(new DevelopmentBoardKit[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>id</li>
	 * <li>name</li>
	 * <li>copany</li>
	 * <li>cost</li>
	 * <li>urlImage</li>
	 * <li>power_consumption</li>
	 * <li>buy_url</li>
	 * <li>weight</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public DevelopmentBoardKit[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>id</li>
	 * <li>name</li>
	 * <li>copany</li>
	 * <li>cost</li>
	 * <li>urlImage</li>
	 * <li>power_consumption</li>
	 * <li>buy_url</li>
	 * <li>weight</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public DevelopmentBoardKit[] toArray(String propertyName, boolean ascending) {
		return (DevelopmentBoardKit[]) super.toArray(new DevelopmentBoardKit[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return esca_orm.EmbeddedSystemMMPersistentManager.instance();
	}
	
}

