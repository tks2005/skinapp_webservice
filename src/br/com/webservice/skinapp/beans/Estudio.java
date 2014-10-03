package br.com.webservice.skinapp.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Estudio {

	private String id;
	private String nome;
	private String perfil;
	private List<String> estilos;
	private String telefone;
	private String site;
	private List<Tatuador> tatuadores;
	private Endereco endereco;
	
	public Estudio(){
		estilos = new ArrayList<String>();
		tatuadores = new ArrayList<Tatuador>();
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public List<String> getEstilos() {
		return estilos;
	}

	public void setEstilos(List<String> estilos) {
		this.estilos = estilos;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public List<Tatuador> getTatuadores() {
		return tatuadores;
	}

	public void setTatuadores(List<Tatuador> tatuadores) {
		this.tatuadores = tatuadores;
	}

}
