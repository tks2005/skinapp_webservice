package br.com.webservice.skinapp.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.webservice.skinapp.beans.Estudio;

public class EstudioDAO extends DAO {

	public static EstudioDAO instance;

	public static EstudioDAO getInstance() {
		if (instance == null)
			instance = new EstudioDAO();
		return instance;
	}

	public List<Estudio> getEstudios() {
		// TODO
		return new ArrayList<Estudio>();
	}
	
	public Estudio getEstudio(String id){
		//TODO
		return new Estudio();
	}

}
