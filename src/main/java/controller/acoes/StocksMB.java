package main.java.controller.acoes;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import main.java.dao.StocksDAO;
import main.java.model.Stock;

@ManagedBean(name="stocksMB")
@ViewScoped
public class StocksMB {
	
	public ArrayList<Stock> stockList;
	
	public String login() {
		return "stocks.xhtml";
	}
	
	@PostConstruct
	public void init() {
		stockList = new StocksDAO().findAll();
	}
	
	public ArrayList<Stock> getStockList() {
		return stockList;
	}

	public void setStockList(ArrayList<Stock> stockList) {
		this.stockList = stockList;
	}
}
