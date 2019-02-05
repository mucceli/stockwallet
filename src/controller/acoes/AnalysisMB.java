package controller.acoes;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.AnalisysDAO;
import model.Analysis;

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
