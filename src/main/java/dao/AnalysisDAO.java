package dao;

import java.util.List;

import model.Analysis;
import util.AbstractDao;

public class AnalysisDAO extends AbstractDao {

	public List<Analysis>  findAll() {
		return getEntityManagerInstance().createNamedQuery("Analysis.findAll",Analysis.class).getResultList();
	}
	
	public void save(Analysis entity) {
		getEntityManagerInstance().getTransaction().begin();
		getEntityManagerInstance().persist(entity);
		getEntityManagerInstance().getTransaction().commit();
	}

}
