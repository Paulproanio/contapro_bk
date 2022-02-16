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
@Table(name = "usuario")
public class usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	private String cedulaUsuario;
	private String nombreUsuario;
	private String telefonoCelUsuario;
	private String telefonoFijUsuario;
	
	@ManyToOne
	@JoinColumn(name="idEstadoUsuario")
	private estadoUsuario estadoUsuario;
	
	@ManyToOne
	@JoinColumn(name="idTipoUsuario")
	private tipoUsuario tipoUsuario;
	
	@ManyToOne
	@JoinColumn(name="idInstitucion")
	private institucion institucion;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCedulaUsuario() {
		return cedulaUsuario;
	}

	public void setCedulaUsuario(String cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getTelefonoCelUsuario() {
		return telefonoCelUsuario;
	}

	public void setTelefonoCelUsuario(String telefonoCelUsuario) {
		this.telefonoCelUsuario = telefonoCelUsuario;
	}

	public String getTelefonoFijUsuario() {
		return telefonoFijUsuario;
	}

	public void setTelefonoFijUsuario(String telefonoFijUsuario) {
		this.telefonoFijUsuario = telefonoFijUsuario;
	}

	public estadoUsuario getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(estadoUsuario estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public tipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(tipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public institucion getInstitucion() {
		return institucion;
	}

	public void setInstitucion(institucion institucion) {
		this.institucion = institucion;
	}
	
}
