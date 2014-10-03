package br.com.webservice.skinapp.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.webservice.skinapp.beans.Cliente;

public class ClienteDAO extends DAO {

	private static ClienteDAO instance;

	public static ClienteDAO getInstance() {
		if (instance == null)
			instance = new ClienteDAO();
		return instance;
	}
	
	public List<Cliente> getClientes(){
		//TODO
		return new ArrayList<Cliente>();
	}
	
	public Cliente getCliente(String id){
		//TODO
		return new Cliente();
	}

}
