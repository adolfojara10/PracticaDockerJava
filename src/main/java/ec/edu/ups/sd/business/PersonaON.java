package ec.edu.ups.sd.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.sd.dao.PersonaDAO;
import ec.edu.ups.sd.model.Persona;

@Stateless
public class PersonaON {

	@Inject
	private PersonaDAO personaDAO;
	
	
	public void guardarCliente(Persona persona) {

		Persona p = personaDAO.read(persona.getId());
		if (p == null) {
			personaDAO.insert(persona);
		} else {
			personaDAO.update(persona);
		}
	}
	
	public int calcularID() {
		var lista = personaDAO.getList();

		if (lista.size() == 0) {
			return 1;
		} else {
			return lista.size() + 1;
		}

	}
	
	
	public List<Persona> getClientes() {
		return personaDAO.getList();
	}
	
	
	
	
	
	
}
