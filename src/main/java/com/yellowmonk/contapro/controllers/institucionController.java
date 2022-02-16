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
package com.yellowmonk.contapro.controllers;

import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.institucion;
import com.yellowmonk.contapro.services.institucionService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;	
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
@RequestMapping("/api/conta")
public class institucionController {
	@Autowired
	institucionService service;
	
	@GetMapping("/institucion")
	public ResponseEntity<List<institucion>> getAll() {
		List<institucion> list = service.getAll();
		return new ResponseEntity<List<institucion>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/institucion/{id}")
	public ResponseEntity<institucion> getinstitucionByIdInstitucion(@PathVariable("id") Long idInstitucion) throws RecordNotFoundException {
		institucion entity = service.findByIdInstitucion(idInstitucion);
		return new ResponseEntity<institucion>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/institucion")
	public ResponseEntity<institucion> createinstitucion(@RequestBody institucion institucion){
		service.createinstitucion(institucion);
		return new ResponseEntity<institucion>(institucion, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/institucion")
	public ResponseEntity<institucion> updateinstitucion(@RequestBody institucion institucion) throws RecordNotFoundException{
		service.updateinstitucion(institucion);
		return new ResponseEntity<institucion>(institucion, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/institucion/{id}")
	public HttpStatus deleteinstitucionByIdInstitucion(@PathVariable("id") Long idInstitucion) throws RecordNotFoundException {
		service.deleteinstitucionByIdInstitucion(idInstitucion);
		return HttpStatus.OK;
	}
}				
