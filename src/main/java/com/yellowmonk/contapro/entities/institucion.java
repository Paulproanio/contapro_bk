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
@Table(name = "institucion")
public class institucion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInstitucion;
	
	private String nombreInstitucion;
	
	public Long getIdInstitucion() {
		return idInstitucion;
	}
	
	public void setIdInstitucion(Long idInstitucion) {
		this.idInstitucion = idInstitucion;
	}
	
	public String getNombreInstitucion() {
		return nombreInstitucion;
	}
	
	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}
	
}
