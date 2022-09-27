package com.projetoentra21.AppFii.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoentra21.AppFii.models.Tabela_Fii;

public interface Tabela_FiiRepository extends JpaRepository<Tabela_Fii, String> { 
	
//	Tabela_Fii findByCodigo(String CODIGO);

}
