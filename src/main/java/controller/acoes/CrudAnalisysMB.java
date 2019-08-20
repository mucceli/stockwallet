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
import model.Analysis;
import model.AnalysisStatus;
import model.Stock;

@ManagedBean(name="crudAnalisysMB")
@ViewScoped
public class CrudAnalisysMB {
	
	public ArrayList<Stock> stockList;
	public Stock stockSelected;
	public AnalysisStatus analisysStatusSelected;
	public List<AnalysisStatus> analisysStatusList;
	public Analysis entity;
	
	@PostConstruct
	public void init() {
		entity = new Analysis();
		//TODO Include BLANK OPTIONS
		stockList = new StocksDAO().findAll();
		analisysStatusList = new AnalisysStatusDAO().findAll();
		analisysStatusList.get(0);
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

	public Analysis getEntity() {
		return entity;
	}

	public void setEntity(Analysis entity) {
		this.entity = entity;
	}

	public AnalysisStatus getAnalisysStatusSelected() {
		return analisysStatusSelected;
	}

	public void setAnalisysStatusSelected(AnalysisStatus analisysStatusSelected) {
		this.analisysStatusSelected = analisysStatusSelected;
	}

	public List<AnalysisStatus> getAnalisysStatusList() {
		return analisysStatusList;
	}

	public void setAnalisysStatusList(List<AnalysisStatus> analisysStatusList) {
		this.analisysStatusList = analisysStatusList;
	}
}
