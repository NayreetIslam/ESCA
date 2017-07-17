/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateEmbeddedSystemMMDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(esca_orm.EmbeddedSystemMMPersistentManager.instance());
			Utility.shutdownDerby(esca_orm.EmbeddedSystemMMPersistentManager.instance());
			esca_orm.EmbeddedSystemMMPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
