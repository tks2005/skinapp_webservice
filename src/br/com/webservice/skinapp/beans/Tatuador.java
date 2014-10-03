package br.com.webservice.skinapp.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tatuador extends Usuario {

	private List<String> estilos;

	public Tatuador() {
		estilos = new ArrayList<String>();
	}

	public List<String> getEstilos() {
		return estilos;
	}

	public void setEstilos(List<String> estilos) {
		this.estilos = estilos;
	}

}
