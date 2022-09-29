package com.projetoentra21.AppFii.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;



@Entity
public class Carteira implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codigo;
	@NotBlank
	private String cotas;
	@NotBlank
	private String local;
	@NotBlank
	private String data;
	@NotBlank
	private String horario;
	
	@OneToMany
	private List<Carteira> carteiras;
	
		
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCotas() {
		return cotas;
	}
	public void setCotas(String cotas) {
		this.cotas = cotas;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public List<Carteira> getCarteira() {
		return carteiras;
	}
	public void setCarteiras(List<Carteira> carteiras) {
		this.carteiras = carteiras;
	}

}
