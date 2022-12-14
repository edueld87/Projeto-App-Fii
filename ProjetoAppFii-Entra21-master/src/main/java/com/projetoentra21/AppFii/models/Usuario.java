package com.projetoentra21.AppFii.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;


@Entity
@Table(name = "usuarios", schema="appfii")
@Data
@Builder
public class Usuario {
	
	@Id
	@Column(name = "id")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column (name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	

	

	
	
	
	

}
