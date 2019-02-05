package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import enums.Liquidity;


/**
 * The persistent class for the STOCK database table.
 * 
 */
@Entity
@Table(name="STOCK")
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STOCK_ID")
	private int stockId;

	@Column(name="SYMBOL")
	private String symbol;

	@Column(name="NAME")
	private String name;
	
	@Column(name = "LIQUIDITY_ID")
	private Liquidity liquidity;
	
	@OneToMany(mappedBy="stock")
	private List<Analysis> analisysList;

	public Stock() {
	}

	public int getStockId() {
		return this.stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Liquidity getLiquidity() {
		return liquidity;
	}

	public void setLiquidity(Liquidity liquidity) {
		this.liquidity = liquidity;
	}

	public List<Analysis> getAnalisysList() {
		return analisysList;
	}

	public void setAnalisysList(List<Analysis> analisysList) {
		this.analisysList = analisysList;
	}
}