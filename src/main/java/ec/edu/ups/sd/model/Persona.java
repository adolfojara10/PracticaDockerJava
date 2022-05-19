package ec.edu.ups.sd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String apellido;

	private String cedula;

	private String email;

	private String nombre;
	
	public Persona() {
	}
	
	

	public Persona(int id, String apellido, String cedula, String email, Date fechaNacimiento, String nombre,
			String tipo) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.cedula = cedula;
		this.email = email;
		
		this.nombre = nombre;
		
	}



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", apellido=" + apellido + ", cedula=" + cedula + ", email=" + email
				+ ", nombre=" + nombre;

	}

}
