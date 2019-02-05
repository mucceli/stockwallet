package controller.acoes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.AnalisysDAO;
import dao.AnalisysStatusDAO;
import dao.StocksDAO;
import model.Analisys;
import model.AnalisysStatus;
import model.Stock;

@ManagedBean(name="crudAnalisysMB")
@ViewScoped
public class CrudAnalisysMB {
	
	public ArrayList<Stock> stockList;
	public Stock stockSelected;
	public AnalisysStatus analisysStatusSelected;
	public List<AnalisysStatus> analisysStatusList;
	public Analisys entity;
	
	@PostConstruct
	public void init() {
		entity = new Analisys();
		stockList = new StocksDAO().findAll();
		analisysStatusList = new AnalisysStatusDAO().findAll();
	}
	
	public String saveEntity() {
		//FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "PrimeFaces Rocks."));
		entity.setStock(stockSelected);
		entity.setStatus(analisysStatusSelected);
		entity.setDateAnalisys(new Date());
		new AnalisysDAO().save(entity);
		return "analisys";
	}

	public ArrayList<Stock> getStockList() {
		return stockList;
	}

	public void setStockList(ArrayList<Stock> stockList) {
		this.stockList = stockList;
	}

	public Stock getStockSelected() {
		return stockSelected;
	}

	public void setStockSelected(Stock stockSelected) {
		this.stockSelected = stockSelected;
	}

	public Analisys getEntity() {
		return entity;
	}

	public void setEntity(Analisys entity) {
		this.entity = entity;
	}

	public AnalisysStatus getAnalisysStatusSelected() {
		return analisysStatusSelected;
	}

	public void setAnalisysStatusSelected(AnalisysStatus analisysStatusSelected) {
		this.analisysStatusSelected = analisysStatusSelected;
	}

	public List<AnalisysStatus> getAnalisysStatusList() {
		return analisysStatusList;
	}

	public void setAnalisysStatusList(List<AnalisysStatus> analisysStatusList) {
		this.analisysStatusList = analisysStatusList;
	}
}
