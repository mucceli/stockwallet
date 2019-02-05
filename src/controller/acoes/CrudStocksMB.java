package controller.acoes;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.StocksDAO;
import enums.Liquidity;
import model.Stock;

@ManagedBean(name="crudStocksMB")
@ViewScoped
public class CrudStocksMB implements Serializable {

	private static final long serialVersionUID = 6900456117516623752L;

	public Liquidity liquiditySelected;
	public Stock entity;
	
	@PostConstruct
	public void init() {
		entity = new Stock();
	}
	public String saveEntity() {
		entity.setLiquidity(liquiditySelected);
		new StocksDAO().save(entity);
		return "stocks";
	}

	public Liquidity[] getAllLiquiditys() {
		return Liquidity.values();
	}

	public Liquidity getLiquiditySelected() {
		return liquiditySelected;
	}

	public void setLiquiditySelected(Liquidity liquiditySelected) {
		this.liquiditySelected = liquiditySelected;
	}

	public Stock getEntity() {
		return entity;
	}

	public void setEntity(Stock entity) {
		this.entity = entity;
	}
}
