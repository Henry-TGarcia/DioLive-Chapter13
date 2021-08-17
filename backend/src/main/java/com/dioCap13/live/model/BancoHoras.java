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
public class BancoHoras {

	//Resolvendo problema de Chave composta
	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	@Getter
	@Setter
	public class BancoHorasId implements Serializable {
			
			/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
			private Long idBancoHoras;
			private Long idMovimentacao;
			private Long idUsuario;
		}
		
	//Atributos
	@EmbeddedId
	private BancoHorasId id;	
	private LocalDateTime dataTrabalhada;
	private BigDecimal quantidadeHoras;
	private BigDecimal saldohoras;
		
		
}
