package com.dioCap13.live.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Localidade {

	//Atributos
	@Id
	private long id;
	private String descricao;
	
	//Associação
	@OneToMany
	private NivelAcesso nivelAcesso;
	
}
