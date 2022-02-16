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
@Table(name = "registro")
public class registro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRegistro;
	
	private String claveRegistro;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="idTipoRegistro")
	private tipoRegistro tipoRegistro;
	
	@ManyToOne
	@JoinColumn(name="idInstitucionRegistro")
	private institucionRegistro institucionRegistro;

	public Long getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Long idRegistro) {
		this.idRegistro = idRegistro;
	}

	public String getClaveRegistro() {
		return claveRegistro;
	}

	public void setClaveRegistro(String claveRegistro) {
		this.claveRegistro = claveRegistro;
	}

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	public tipoRegistro getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(tipoRegistro tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public institucionRegistro getInstitucionRegistro() {
		return institucionRegistro;
	}

	public void setInstitucionRegistro(institucionRegistro institucionRegistro) {
		this.institucionRegistro = institucionRegistro;
	}
	
}
