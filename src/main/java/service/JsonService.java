package main.java.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import main.java.model.Analysis;

@Path("/json/analisys")
public class JsonService {

	// This method is called if JSON is request
	@GET
	@Path("/get")
	@Produces("application/json")
	public Analysis getAnalisysInJSON() {
		Analysis analysis = new Analysis();
		analysis.setAnalisysId(1);
		return analysis; 
	}
}
