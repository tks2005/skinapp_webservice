package br.com.webservice.skinapp.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.webservice.skinapp.beans.Evento;
import br.com.webservice.skinapp.dao.EventoDAO;
import br.com.webservice.skinapp.exceptions.NoContentException;

import com.google.gson.Gson;

@Path("/evento")
public class EventoResource {
	@GET
	@Path("/getEventos")
	@Produces("application/json")
	public List<Evento> getEventos() {
		return EventoDAO.getInstance().getEventos();
	}

	@GET
	@Path("/getEventosGSON")
	@Produces("application/json")
	public String getEventosGSON() {
		return new Gson().toJson(EventoDAO.getInstance().getEventos());
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Evento getEvento(@PathParam("id") String id) {
		Evento evento = EventoDAO.getInstance().getEvento(id);
		if (evento == null)
			throw new NoContentException("Cliente não encontrado!");

		return evento;
	}

}
