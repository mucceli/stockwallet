package dao;

import java.util.List;

import model.Analisys;
import util.AbstractDao;

public class AnalisysDAO extends AbstractDao {

	public List<Analisys>  findAll() {
		return getEntityManagerInstance().createNamedQuery("Analisys.findAll",Analisys.class).getResultList();
	}
	
	public void save(Analisys entity) {
		getEntityManagerInstance().getTransaction().begin();
		getEntityManagerInstance().persist(entity);
		getEntityManagerInstance().getTransaction().commit();
	}

}
