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
@Table(name = "tipoRegistro")
public class tipoRegistro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoRegistro;
	
	private String nombreTipoRegistro;
	
	public Long getIdTipoRegistro() {
		return idTipoRegistro;
	}
	
	public void setIdTipoRegistro(Long idTipoRegistro) {
		this.idTipoRegistro = idTipoRegistro;
	}
	
	public String getNombreTipoRegistro() {
		return nombreTipoRegistro;
	}
	
	public void setNombreTipoRegistro(String nombreTipoRegistro) {
		this.nombreTipoRegistro = nombreTipoRegistro;
	}
	
}
