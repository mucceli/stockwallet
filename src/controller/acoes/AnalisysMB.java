package controller.acoes;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.AnalisysDAO;
import model.Analisys;

@ManagedBean(name="analisysMB")
@ViewScoped
public class AnalisysMB {
	
	public List<Analisys> analisysList;
	
	@PostConstruct
	public void init() {
		analisysList = new AnalisysDAO().findAll();
	}

	public List<Analisys> getAnalisysList() {
		return analisysList;
	}

	public void setAnalisysList(List<Analisys> analisysList) {
		this.analisysList = analisysList;
	}
}
