package com.dioCap13.live.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Usuario {

	//Atributos
	@Id
	private Long id;
	private String nome;
	private BigDecimal tolerancia;
	private LocalDateTime inicioJornanda;
	private LocalDateTime finalJornada;
	
	
	//Associação
	@ManyToOne
	private CategoriaUsuario categoriaUsuario;
	
	@ManyToOne
	private Empresa empresa;
	
	@ManyToOne
	private NivelAcesso nivelAcesso;
	
	@ManyToOne
	private JornadaTrabalho jornadaTrabalho;
	
	
	
}
