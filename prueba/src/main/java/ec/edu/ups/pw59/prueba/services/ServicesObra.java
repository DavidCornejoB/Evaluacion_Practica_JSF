package ec.edu.ups.pw59.prueba.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.pw59.prueba.business.ObraONLocal;
import ec.edu.ups.pw59.prueba.business.PersonaONLocal;
import ec.edu.ups.pw59.prueba.modelo.Obra;
import ec.edu.ups.pw59.prueba.modelo.Persona;

@WebService
public class ServicesObra {
	
	@Inject
	private ObraONLocal obraON;
	
	@Inject
	private PersonaONLocal personaON;
	
	@WebMethod
	public String insertarObra(Obra obra) {//INSERTAR OBRA
		
		Persona p = obra.getPersona();
		
		try {
			p = personaON.read(p.getCedula());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(p == null) {
			try {
				personaON.insert(obra.getPersona());
				obraON.insert(obra);
				return "OK";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "ERROR";
			}
		} else {
			try {
				obraON.insert(obra);
				return "OK";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "ERROR";	
			}
		}	
	}//INSERTAR OBRA
	
	@WebMethod
	public List<Obra> getObra(){
		List<Obra> obras = new ArrayList<Obra>();
		
		try {
			obras = obraON.getObras();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obras;
	}

}
