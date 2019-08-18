package main.java.dao;

import java.io.Serializable;
import java.util.List;

import main.java.model.AnalysisStatus;
import main.java.util.AbstractDao;

public class AnalisysStatusDAO extends AbstractDao implements Serializable {

	private static final long serialVersionUID = 5560143731646020130L;
	
	public List<AnalysisStatus> findAll() {
		return getEntityManagerInstance().createNamedQuery("AnalysisStatus.findAll",AnalysisStatus.class).getResultList();
	}
}
