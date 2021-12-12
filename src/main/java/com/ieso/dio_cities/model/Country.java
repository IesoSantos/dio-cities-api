/**
 * 
 */
package com.ieso.dio_cities.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "pais")
public class Country {
	
	@Id
	private Long id;
	@Column(name = "nome")
	private String name;
	@Column(name = "nome_pt")
	private String portugueseName;
	@Column(name = "sigla")
	private String code;
	private Integer bacen;

}
