package util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class AbstractDao {
	
	protected EntityManager em;
	
	protected EntityManager getEntityManagerInstance() {
		if(em == null) {
			em = Persistence.createEntityManagerFactory("stockwallet").createEntityManager();
		}
		return em;
	}
	
	protected <T> void persist(T entity) {
		getEntityManagerInstance().getTransaction().begin();
		getEntityManagerInstance().persist(entity);
		getEntityManagerInstance().getTransaction().commit();
	}
}
