package ec.edu.ups.pw59.prueba.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw59.prueba.modelo.Obra;

@Stateless
public class ObraDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Obra o) {
		em.persist(o);
	}
	
	public void update(Obra o) {
		em.merge(o);
	}
	
	public Obra read(int id) {
		Obra o = em.find(Obra.class, id);
		return o;
	}
	
	public void delete(int id) {
		Obra o = em.find(Obra.class, id);
		em.remove(o);
	}
	
	public List<Obra> getList(){
		List<Obra> listaObras = new ArrayList<Obra>();
		
		String jpql = "SELECT o FROM Obra o";
		
		Query query = em.createQuery(jpql, Obra.class);
		
		listaObras = query.getResultList();
		
		return listaObras;
	}

}
