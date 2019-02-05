package dao;

import java.util.ArrayList;

import model.Stock;
import util.AbstractDao;

public class StocksDAO extends AbstractDao{
	
	public void save(Stock entity) {
		getEntityManagerInstance().getTransaction().begin();
		getEntityManagerInstance().persist(entity);
		getEntityManagerInstance().getTransaction().commit();
	}
	
	public ArrayList<Stock> findAll() {
		return (ArrayList<Stock>) getEntityManagerInstance().createNamedQuery("Stock.findAll",Stock.class).getResultList();
	}
}
