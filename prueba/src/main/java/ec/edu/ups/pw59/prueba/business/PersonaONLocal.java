package ec.edu.ups.pw59.prueba.business;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.pw59.prueba.modelo.Persona;

@Local
public interface PersonaONLocal {
	
	public void insert(Persona p) throws Exception;
	
	public void update(Persona p) throws Exception;
	
	public Persona read(String id) throws Exception;
	
	public void delete(String id) throws Exception;
	
	public List<Persona> getPersonas() throws Exception;

}
