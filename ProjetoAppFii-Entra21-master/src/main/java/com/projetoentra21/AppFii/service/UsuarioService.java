package com.projetoentra21.AppFii.service;

import com.projetoentra21.AppFii.models.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);
	
	
	
	
}
