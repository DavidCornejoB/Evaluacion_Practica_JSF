package ec.edu.ups.pw59.prueba.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw59.prueba.dao.PersonaDAO;
import ec.edu.ups.pw59.prueba.modelo.Persona;

@Stateless
public class PersonaON implements PersonaONLocal, PersonaONRemote{
	
	@Inject
	private PersonaDAO daoPersona;
	
	public void insert(Persona p) throws Exception{
		daoPersona.insert(p);
	}
	
	public void update(Persona p) throws Exception{
		daoPersona.update(p);
	}
	
	public Persona read(String id) throws Exception{
		return daoPersona.read(id);
	}
	
	public void delete(String id) throws Exception{
		daoPersona.delete(id);
	}
	
	public List<Persona> getPersonas() throws Exception{
		return daoPersona.getList();
	}

}
