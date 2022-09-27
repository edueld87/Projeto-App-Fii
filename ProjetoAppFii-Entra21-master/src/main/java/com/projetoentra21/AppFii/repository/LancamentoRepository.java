package com.projetoentra21.AppFii.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoentra21.AppFii.models.Lancamento;
import com.projetoentra21.AppFii.models.Tabela_Fii;

public interface LancamentoRepository extends JpaRepository<Lancamento,Long>{
	
//	Tabela_Fii findByCodigo(long codigo);

}
