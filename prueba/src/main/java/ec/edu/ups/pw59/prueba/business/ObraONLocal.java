package ec.edu.ups.pw59.prueba.business;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.pw59.prueba.modelo.Obra;

@Local
public interface ObraONLocal {
	
	public void insert(Obra o) throws Exception;
	
	public void update(Obra o) throws Exception;
	
	public Obra read(int id) throws Exception;
	
	public void delete(int id) throws Exception;
	
	public List<Obra> getObras() throws Exception;

}
