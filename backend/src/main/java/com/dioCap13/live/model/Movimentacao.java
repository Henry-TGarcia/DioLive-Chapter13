package com.dioCap13.live.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {

	//Resolvendo problema de Chave composta
	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class MovimentacaoId implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Long idMovimento;
		private Long idUsuario;
	}
	
	//Atributos
	@EmbeddedId
	private MovimentacaoId id;
	private LocalDateTime dataEntrada;
	private LocalDateTime dataSaida;
	private BigDecimal periodo;
	
	//Associação
	private Ocorrencia ocorrencia;
	private Calendario calendario;
	
}
