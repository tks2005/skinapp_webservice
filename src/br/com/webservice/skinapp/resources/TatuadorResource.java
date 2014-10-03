package br.com.webservice.skinapp.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.webservice.skinapp.beans.Tatuador;
import br.com.webservice.skinapp.dao.TatuadorDAO;
import br.com.webservice.skinapp.exceptions.NoContentException;

import com.google.gson.Gson;

@Path("/tatuador")
public class TatuadorResource {

	@GET
	@Path("/getTatuadores")
	@Produces("application/json")
	public List<Tatuador> getTatuadores() {
		return TatuadorDAO.getInstance().getTatuadores();
	}

	@GET
	@Path("/getTatuadoresGSON")
	@Produces("application/json")
	public String getTatuadoresGSON() {
		return new Gson().toJson(TatuadorDAO.getInstance().getTatuadores());
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Tatuador getCliente(@PathParam("id") String id) {
		Tatuador tatuador = TatuadorDAO.getInstance().getTatuador(id);
		if (tatuador == null)
			throw new NoContentException("Cliente não encontrado!");

		return tatuador;
	}

}
