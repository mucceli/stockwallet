package main.java.dao;

import java.util.List;

import main.java.model.Analysis;
import main.java.util.AbstractDao;

public class AnalisysDAO extends AbstractDao {

	public List<Analysis>  findAll() {
		return getEntityManagerInstance().createNamedQuery("Analysis.findAll",Analysis.class).getResultList();
	}
	
	public void save(Analysis entity) {
		getEntityManagerInstance().getTransaction().begin();
		getEntityManagerInstance().persist(entity);
		getEntityManagerInstance().getTransaction().commit();
	}

}
