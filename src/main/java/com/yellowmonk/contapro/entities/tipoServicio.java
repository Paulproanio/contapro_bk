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
@Table(name = "tipoServicio")
public class tipoServicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoServicio;
	
	private String nombreTipoServicio;
	
	public Long getIdTipoServicio() {
		return idTipoServicio;
	}
	
	public void setIdTipoServicio(Long idTipoServicio) {
		this.idTipoServicio = idTipoServicio;
	}
	
	public String getNombreTipoServicio() {
		return nombreTipoServicio;
	}
	
	public void setNombreTipoServicio(String nombreTipoServicio) {
		this.nombreTipoServicio = nombreTipoServicio;
	}
	
}
