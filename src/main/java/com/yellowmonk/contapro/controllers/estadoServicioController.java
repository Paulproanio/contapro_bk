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

import com.yellowmonk.contapro.services.estadoServicioService;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.estadoServicio;

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
public class estadoServicioController {
	@Autowired
	estadoServicioService service;
	
	@GetMapping("/estadoServicio")
	public ResponseEntity<List<estadoServicio>> getAll() {
		List<estadoServicio> list = service.getAll();
		return new ResponseEntity<List<estadoServicio>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/estadoServicio/{id}")
	public ResponseEntity<estadoServicio> getestadoServicioByIdEstadoServicio(@PathVariable("id") Long idEstadoServicio) throws RecordNotFoundException {
		estadoServicio entity = service.findByIdEstadoServicio(idEstadoServicio);
		return new ResponseEntity<estadoServicio>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/estadoServicio")
	public ResponseEntity<estadoServicio> createestadoServicio(@RequestBody estadoServicio estadoServicio){
		service.createestadoServicio(estadoServicio);
		return new ResponseEntity<estadoServicio>(estadoServicio, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/estadoServicio")
	public ResponseEntity<estadoServicio> updateestadoServicio(@RequestBody estadoServicio estadoServicio) throws RecordNotFoundException{
		service.updateestadoServicio(estadoServicio);
		return new ResponseEntity<estadoServicio>(estadoServicio, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/estadoServicio/{id}")
	public HttpStatus deleteestadoServicioByIdEstadoServicio(@PathVariable("id") Long idEstadoServicio) throws RecordNotFoundException {
		service.deleteestadoServicioByIdEstadoServicio(idEstadoServicio);
		return HttpStatus.OK;
	}
}				
