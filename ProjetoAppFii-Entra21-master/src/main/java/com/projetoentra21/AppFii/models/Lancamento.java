package com.projetoentra21.AppFii.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.projetoentra21.AppFii.enums.StatusLancamento;
import com.projetoentra21.AppFii.enums.TipoLancamento;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "lancamento", schema ="appfii")
@Builder
@Data
public class Lancamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "id")
	private Long id;
	
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name ="mes")
	private Integer mes;
	
	@Column(name ="ano")
	private Integer ano;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	
	@Column(name = "data_cad_lanca")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate data_cad_lanca;
	
	@Column(name = "tipo")
	@Enumerated(value = EnumType.STRING)
	private TipoLancamento tipo;
	
	
	@Column (name = "status")
	@Enumerated(value = EnumType.STRING)
	private StatusLancamento status;



	
	

}
