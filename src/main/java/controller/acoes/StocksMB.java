package controller.acoes;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Inject;

import dao.StocksDAO;
import model.Stock;
import util.FacesContextUtil;
import util.StockWalletConstants;

@ManagedBean(name="stocksMB")
@ViewScoped
public class StocksMB {
	
	public ArrayList<Stock> stockList;
	
	@Inject
	private FacesContextUtil facesContextUtil;
	
	public void init(ComponentSystemEvent event) {
		
		//Show message after action in CRUD.
		if(StockWalletConstants.CALLBACK_SUCCESS.equals(facesContextUtil.getExternalContext().getSessionMap().get(StockWalletConstants.CALLBACK))) {
			FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Stock saved with success!");
			FacesContext.getCurrentInstance().addMessage("message", facesMessage);
		}
		
		stockList = new StocksDAO().findAll();
	}
	
	public ArrayList<Stock> getStockList() {
		return stockList;
	}

	public void setStockList(ArrayList<Stock> stockList) {
		this.stockList = stockList;
	}
}
