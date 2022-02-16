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
package com.yellowmonk.contapro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yellowmonk.contapro.entities.tipoServicio;

import java.util.Optional;

@Repository
public interface tipoServicioRepository extends JpaRepository<tipoServicio, Long> {

	Optional <tipoServicio> findByIdTipoServicio(Long idTipoServicio);
	
	void deleteByIdTipoServicio(Long idTipoServicio);
	
}
