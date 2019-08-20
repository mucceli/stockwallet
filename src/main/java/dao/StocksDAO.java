package dao;

import java.util.ArrayList;

import model.Stock;
import util.AbstractDao;

public class StocksDAO extends AbstractDao{
	
	public void save(Stock entity) {
		persist(entity);
	}
	
	public ArrayList<Stock> findAll() {
		return (ArrayList<Stock>) getEntityManagerInstance().createNamedQuery("Stock.findAll",Stock.class).getResultList();
	}
}
