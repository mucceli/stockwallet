package dao;

import java.io.Serializable;
import java.util.List;

import model.AnalisysStatus;
import util.AbstractDao;

public class AnalisysStatusDAO extends AbstractDao implements Serializable {

	private static final long serialVersionUID = 5560143731646020130L;
	
	public List<AnalisysStatus> findAll() {
		return getEntityManagerInstance().createNamedQuery("AnalisysStatus.findAll",AnalisysStatus.class).getResultList();
	}
}
