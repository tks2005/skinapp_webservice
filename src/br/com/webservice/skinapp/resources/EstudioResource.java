package br.com.webservice.skinapp.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.webservice.skinapp.beans.Estudio;
import br.com.webservice.skinapp.dao.EstudioDAO;
import br.com.webservice.skinapp.exceptions.NoContentException;

import com.google.gson.Gson;

@Path("/estudio")
public class EstudioResource {

	@GET
	@Path("/getEstudios")
	@Produces("application/json")
	public List<Estudio> getEstudios() {
		return EstudioDAO.getInstance().getEstudios();
	}

	@GET
	@Path("/getEstudiosGSON")
	@Produces("application/json")
	public String getEstudiossGSON() {
		return new Gson().toJson(EstudioDAO.getInstance().getEstudios());
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Estudio getEstudio(@PathParam("id") String id) {
		Estudio estudio = EstudioDAO.getInstance().getEstudio(id);
		if (estudio == null)
			throw new NoContentException("Cliente não encontrado!");

		return estudio;
	}
}
