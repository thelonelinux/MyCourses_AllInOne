package co.edureka.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/edureka")
public class EdurekaServices {
	@GET
	@Produces("text/plain")
	public String indiaService() {
		return "India Customer Service Center";
	}
	
	@GET
	@Produces("text/html")
	@Path("/intl")
	public String internationalService() {
		return "<h2 style=color:blue>International Customer Service Center</h2>";
	}	
}
