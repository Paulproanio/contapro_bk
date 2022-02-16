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
@Table(name = "institucionRegistro")
public class institucionRegistro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInstitucionRegistro;
	
	private String nombreInstitucionRegistro;
	
	public Long getIdInstitucionRegistro() {
		return idInstitucionRegistro;
	}
	
	public void setIdInstitucionRegistro(Long idInstitucionRegistro) {
		this.idInstitucionRegistro = idInstitucionRegistro;
	}
	
	public String getNombreInstitucionRegistro() {
		return nombreInstitucionRegistro;
	}
	
	public void setNombreInstitucionRegistro(String nombreInstitucionRegistro) {
		this.nombreInstitucionRegistro = nombreInstitucionRegistro;
	}
	
}
