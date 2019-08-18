package main.java.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ANALYSIS")
@NamedQuery(name="Analysis.findAll", query="SELECT s FROM Analysis s")
public class Analysis {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ANALYSIS_ID")
	private int analisysId;
	
	@Column(name = "ANALYSIS_DATE")
	@Temporal(TemporalType.DATE)
	private Date dateAnalisys; 
	
	@Column(name = "NOTE")
	private String note;
	
	@Column(name = "ALERT_DATE")
	@Temporal(TemporalType.DATE)
	private Date alertDate;
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ANALYSIS_STATUS_ID")
	private AnalysisStatus status;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "STOCK_ID")
	private Stock stock;

	public int getAnalisysId() {
		return analisysId;
	}

	public void setAnalisysId(int analisysId) {
		this.analisysId = analisysId;
	}

	public Date getDateAnalisys() {
		return dateAnalisys;
	}

	public void setDateAnalisys(Date dateAnalisys) {
		this.dateAnalisys = dateAnalisys;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getAlertDate() {
		return alertDate;
	}

	public void setAlertDate(Date alertDate) {
		this.alertDate = alertDate;
	}

	public AnalysisStatus getStatus() {
		return status;
	}

	public void setStatus(AnalysisStatus status) {
		this.status = status;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
}
