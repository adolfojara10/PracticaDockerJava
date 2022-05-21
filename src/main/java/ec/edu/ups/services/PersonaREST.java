package ec.edu.ups.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ec.edu.ups.sd.business.PersonaON;
import ec.edu.ups.sd.model.Persona;

@Path("persona")
public class PersonaREST {
	
	@Inject
	private PersonaON perON;
	
	@GET
	@Path("listaPersonas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Persona> getPersona() {
		return perON.getClientes();
	}
	
	@POST
	@Path("crear")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String guardar(@QueryParam("cedula") String cedula, @QueryParam("nombre") String nombre, @QueryParam("apellido") String apellido, @QueryParam("email") String email) {
		
		Persona p= new Persona(perON.calcularID(), apellido, cedula, email, nombre);
		perON.guardarCliente(p);
		return p.toString();

	}

}
