package br.com.webservice.skinapp.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.webservice.skinapp.beans.Evento;

public class EventoDAO extends DAO {

	public static EventoDAO instance;

	public static EventoDAO getInstance() {
		if (instance == null)
			instance = new EventoDAO();
		return instance;
	}

	public List<Evento> getEventos() {
		// TODO
		return new ArrayList<Evento>();
	}

	public Evento getEvento(String id) {
		// TODO
		return new Evento();
	}

}
