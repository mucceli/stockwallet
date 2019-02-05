package util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class AbstractDao {
	
	protected EntityManager em;
	
	protected EntityManager getEntityManagerInstance() {
		if(em == null) {
			em = Persistence.createEntityManagerFactory("carteira_acoes").createEntityManager();
		}
		return em;
	}
}
