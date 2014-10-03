package br.com.webservice.skinapp.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente extends Usuario {

	private List<Evento> eventoPretendeParticipar;
	
	public Cliente(){
		eventoPretendeParticipar = new ArrayList<Evento>();
	}

	public List<Evento> getEventoPretendeParticipar() {
		return eventoPretendeParticipar;
	}

	public void setEventoPretendeParticipar(
			List<Evento> eventoPretendeParticipar) {
		this.eventoPretendeParticipar = eventoPretendeParticipar;
	}

}