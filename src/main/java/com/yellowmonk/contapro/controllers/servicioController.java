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

import com.yellowmonk.contapro.services.servicioService;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.servicio;

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
public class servicioController {
	@Autowired
	servicioService service;
	
	@GetMapping("/servicio")
	public ResponseEntity<List<servicio>> getAll() {
		List<servicio> list = service.getAll();
		return new ResponseEntity<List<servicio>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/servicio/{id}")
	public ResponseEntity<servicio> getservicioByIdServicio(@PathVariable("id") Long idServicio) throws RecordNotFoundException {
		servicio entity = service.findByIdServicio(idServicio);
		return new ResponseEntity<servicio>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/servicio")
	public ResponseEntity<servicio> createservicio(@RequestBody servicio servicio){
		service.createservicio(servicio);
		return new ResponseEntity<servicio>(servicio, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/servicio")
	public ResponseEntity<servicio> updateservicio(@RequestBody servicio servicio) throws RecordNotFoundException{
		service.updateservicio(servicio);
		return new ResponseEntity<servicio>(servicio, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/servicio/{id}")
	public HttpStatus deleteservicioByIdServicio(@PathVariable("id") Long idServicio) throws RecordNotFoundException {
		service.deleteservicioByIdServicio(idServicio);
		return HttpStatus.OK;
	}
}				
