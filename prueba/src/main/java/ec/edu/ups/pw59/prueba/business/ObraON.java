package ec.edu.ups.pw59.prueba.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw59.prueba.dao.ObraDAO;
import ec.edu.ups.pw59.prueba.modelo.Obra;

@Stateless
public class ObraON implements ObraONLocal, ObraONRemote{
	
	@Inject
	private ObraDAO daoObra;
	
	public void insert(Obra o) throws Exception{
		daoObra.insert(o);
	}
	
	public void update(Obra o) throws Exception{
		daoObra.update(o);
	}
	
	public Obra read(int id) throws Exception{
		return daoObra.read(id);
	}
	
	public void delete(int id) throws Exception{
		daoObra.delete(id);
	}
	
	public List<Obra> getObras() throws Exception{
		return daoObra.getList();
	}

}
