package br.com.webservice.skinapp.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.webservice.skinapp.beans.Cliente;
import br.com.webservice.skinapp.dao.ClienteDAO;
import br.com.webservice.skinapp.exceptions.NoContentException;

import com.google.gson.Gson;

@Path("/cliente")
public class ClienteResource {

	@GET
	@Path("/getClientes")
	@Produces("application/json")
	public List<Cliente> getClientes() {
		return ClienteDAO.getInstance().getClientes();
	}

	@GET
	@Path("/getClientesGSON")
	@Produces("application/json")
	public String getClientesGSON() {
		return new Gson().toJson(ClienteDAO.getInstance().getClientes());
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Cliente getCliente(@PathParam("id") String id) {
		Cliente cliente = ClienteDAO.getInstance().getCliente(id);
		if (cliente == null)
			throw new NoContentException("Cliente não encontrado!");

		return cliente;
	}
}
