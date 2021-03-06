package com.dioCap13.live.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

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
public class Calendario {

	//Atributos
	@Id
	private Long id;
	private String descricao;
	private LocalDateTime dataEspecial;
	
	//Associação
	private TipoData tipoData;
	
}
