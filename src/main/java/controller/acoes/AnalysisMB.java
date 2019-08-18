package main.java.controller.acoes;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import main.java.dao.AnalisysDAO;
import main.java.model.Analysis;

@ManagedBean(name="analysisMB")
@ViewScoped
public class AnalysisMB {
	
	public List<Analysis> analysisList;
	
	@PostConstruct
	public void init() {
		analysisList = new AnalisysDAO().findAll();
	}

	public List<Analysis> getAnalysisList() {
		return analysisList;
	}

	public void setAnalysisList(List<Analysis> analysisList) {
		this.analysisList = analysisList;
	}

	
}
