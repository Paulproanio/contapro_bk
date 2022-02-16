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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity
@Table(name = "servicio")
public class servicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idServicio;
	
	private String observacionServicio;
	private Double valorServicio;
	
	@ManyToOne
	@JoinColumn(name="idTipoServicio")
	private tipoServicio tipoServicio;
	
	@ManyToOne
	@JoinColumn(name="idEstadoServicio")
	private estadoServicio estadoServicio;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private usuario usuario;

	public Long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}

	public String getObservacionServicio() {
		return observacionServicio;
	}

	public void setObservacionServicio(String observacionServicio) {
		this.observacionServicio = observacionServicio;
	}

	public Double getValorServicio() {
		return valorServicio;
	}

	public void setValorServicio(Double valorServicio) {
		this.valorServicio = valorServicio;
	}

	public tipoServicio getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(tipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public estadoServicio getEstadoServicio() {
		return estadoServicio;
	}

	public void setEstadoServicio(estadoServicio estadoServicio) {
		this.estadoServicio = estadoServicio;
	}

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}
}
