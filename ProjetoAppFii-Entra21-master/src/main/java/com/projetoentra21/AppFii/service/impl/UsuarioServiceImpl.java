package com.projetoentra21.AppFii.service.impl;

import com.projetoentra21.AppFii.models.Usuario;
import com.projetoentra21.AppFii.repository.UsuarioRepository;
import com.projetoentra21.AppFii.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{

	
	private UsuarioRepository repository;
	
	
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		// TODO Auto-generated method stub
		
	}

}
