package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import model.Analisys;

@Path("/json/analisys")
public class JsonService {

	// This method is called if JSON is request
	@GET
	@Path("/get")
	@Produces("application/json")
	public Analisys getAnalisysInJSON() {
		Analisys analisys = new Analisys();
		analisys.setAnalisysId(1);
		return analisys; 
	}
}
