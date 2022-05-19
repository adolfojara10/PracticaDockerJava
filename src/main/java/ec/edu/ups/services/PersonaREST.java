package ec.edu.ups.services;

import javax.inject.Inject;
import javax.ws.rs.Path;

import ec.edu.ups.sd.business.PersonaON;

@Path("cuenta")
public class PersonaREST {
	
	@Inject
	private PersonaON perON;
	
	

}
