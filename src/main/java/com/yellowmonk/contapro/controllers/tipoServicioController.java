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

import com.yellowmonk.contapro.services.tipoServicioService;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.tipoServicio;

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
public class tipoServicioController {
	@Autowired
	tipoServicioService service;
	
	@GetMapping("/tipoServicio")
	public ResponseEntity<List<tipoServicio>> getAll() {
		List<tipoServicio> list = service.getAll();
		return new ResponseEntity<List<tipoServicio>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/tipoServicio/{id}")
	public ResponseEntity<tipoServicio> gettipoServicioByIdTipoServicio(@PathVariable("id") Long idTipoServicio) throws RecordNotFoundException {
		tipoServicio entity = service.findByIdTipoServicio(idTipoServicio);
		return new ResponseEntity<tipoServicio>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/tipoServicio")
	public ResponseEntity<tipoServicio> createtipoServicio(@RequestBody tipoServicio tipoServicio){
		service.createtipoServicio(tipoServicio);
		return new ResponseEntity<tipoServicio>(tipoServicio, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/tipoServicio")
	public ResponseEntity<tipoServicio> updatetipoServicio(@RequestBody tipoServicio tipoServicio) throws RecordNotFoundException{
		service.updatetipoServicio(tipoServicio);
		return new ResponseEntity<tipoServicio>(tipoServicio, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/tipoServicio/{id}")
	public HttpStatus deletetipoServicioByIdTipoServicio(@PathVariable("id") Long idTipoServicio) throws RecordNotFoundException {
		service.deletetipoServicioByIdTipoServicio(idTipoServicio);
		return HttpStatus.OK;
	}
}				
