package br.com.webservice.skinapp.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.webservice.skinapp.beans.Tatuador;

public class TatuadorDAO extends DAO {

	private static TatuadorDAO instance;

	public static TatuadorDAO getInstance() {
		if (instance == null)
			instance = new TatuadorDAO();
		return instance;
	}

	public List<Tatuador> getTatuadores() {
		// TODO
		return new ArrayList<Tatuador>();
	}

	public Tatuador getTatuador(String id) {
		// TODO
		return new Tatuador();
	}
}
