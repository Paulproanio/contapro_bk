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
@Table(name = "estadoServicio")
public class estadoServicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstadoServicio;
	
	private String nombreEstadoServicio;
	
	public Long getIdEstadoServicio() {
		return idEstadoServicio;
	}
	
	public void setIdEstadoServicio(Long idEstadoServicio) {
		this.idEstadoServicio = idEstadoServicio;
	}
	
	public String getNombreEstadoServicio() {
		return nombreEstadoServicio;
	}
	
	public void setNombreEstadoServicio(String nombreEstadoServicio) {
		this.nombreEstadoServicio = nombreEstadoServicio;
	}
	
}
