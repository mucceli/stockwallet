package main.java.dao;

import java.util.ArrayList;

import main.java.model.Stock;
import main.java.util.AbstractDao;

public class StocksDAO extends AbstractDao{
	
	public void save(Stock entity) {
		persist(entity);
	}
	
	public ArrayList<Stock> findAll() {
		return (ArrayList<Stock>) getEntityManagerInstance().createNamedQuery("Stock.findAll",Stock.class).getResultList();
	}
}
