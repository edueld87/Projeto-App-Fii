package com.projetoentra21.AppFii.repository;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoentra21.AppFii.models.Carteira;
import com.projetoentra21.AppFii.models.Tabela_Fii;

public interface Tabela_FiiRepository extends JpaRepository<Tabela_Fii, String> {

	void save(@Valid Carteira carteira); 
	
//	Tabela_Fii findByCodigo(String CODIGO);

}
