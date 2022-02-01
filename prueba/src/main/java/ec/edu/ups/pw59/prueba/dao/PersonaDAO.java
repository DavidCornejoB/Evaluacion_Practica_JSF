package ec.edu.ups.pw59.prueba.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw59.prueba.modelo.Persona;

@Stateless
public class PersonaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Persona p) {
		em.persist(p);
	}
	
	public void update(Persona p) {
		em.merge(p);
	}
	
	public Persona read(String id) {
		Persona p = em.find(Persona.class, id);
		return p;
	}
	
	public void delete(String id) {
		Persona p = em.find(Persona.class, id);
		em.remove(p);
	}
	
	public List<Persona> getList(){
		List<Persona> listado = new ArrayList<Persona>();
		
		String jpql = "SELECT p FROM Persona p";
		
		Query query = em.createQuery(jpql, Persona.class);
		
		listado = query.getResultList();
		
		return listado;
	}

}
