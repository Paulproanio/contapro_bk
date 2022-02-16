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
@Table(name = "estadoUsuario")
public class estadoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstadoUsuario;
	
	private String nombreEstadoUsuario;
	
	public Long getIdEstadoUsuario() {
		return idEstadoUsuario;
	}
	
	public void setIdEstadoUsuario(Long idEstadoUsuario) {
		this.idEstadoUsuario = idEstadoUsuario;
	}
	
	public String getNombreEstadoUsuario() {
		return nombreEstadoUsuario;
	}
	
	public void setNombreEstadoUsuario(String nombreEstadoUsuario) {
		this.nombreEstadoUsuario = nombreEstadoUsuario;
	}
	
}
