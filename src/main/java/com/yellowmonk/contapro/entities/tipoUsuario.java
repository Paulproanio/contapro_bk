																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. G�mez (2020)
| File Date: Tue Feb 15 22:47:34 ECT 2022
| 
 -------------------------------------------------------------------
																*/
package com.yellowmonk.contapro.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity
@Table(name = "tipoUsuario")
public class tipoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoUsuario;
	
	private String nombreTipoUsuario;
	
	public Long getIdTipoUsuario() {
		return idTipoUsuario;
	}
	
	public void setIdTipoUsuario(Long idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	
	public String getNombreTipoUsuario() {
		return nombreTipoUsuario;
	}
	
	public void setNombreTipoUsuario(String nombreTipoUsuario) {
		this.nombreTipoUsuario = nombreTipoUsuario;
	}
	
}
