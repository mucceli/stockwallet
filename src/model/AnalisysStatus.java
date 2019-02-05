package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ANALISYS_STATUS")
@NamedQuery(name="AnalisysStatus.findAll", query="SELECT s FROM AnalisysStatus s")
public class AnalisysStatus {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ANALISYS_STATUS_ID")
	private int analisysStatusId;
	
	@Column(name="NAME")
	private String name;

	public int getAnalisysStatusId() {
		return analisysStatusId;
	}

	public void setAnalisysStatusId(int analisysStatusId) {
		this.analisysStatusId = analisysStatusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
