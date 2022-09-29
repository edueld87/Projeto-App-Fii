package com.projetoentra21.AppFii.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.projetoentra21.AppFii.models.Carteira;



public interface CarteiraRepository extends JpaRepository<Carteira, String> {
	
//	Iterable<Carteira>findByCarteira(Carteira carteira);
	
	Carteira findByCodigo(String codigo);

}
