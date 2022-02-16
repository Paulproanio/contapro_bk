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

import com.yellowmonk.contapro.services.registroService;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.registro;

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
public class registroController {
	@Autowired
	registroService service;
	
	@GetMapping("/registro")
	public ResponseEntity<List<registro>> getAll() {
		List<registro> list = service.getAll();
		return new ResponseEntity<List<registro>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/registro/{id}")
	public ResponseEntity<registro> getregistroByIdRegistro(@PathVariable("id") Long idRegistro) throws RecordNotFoundException {
		registro entity = service.findByIdRegistro(idRegistro);
		return new ResponseEntity<registro>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/registro")
	public ResponseEntity<registro> createregistro(@RequestBody registro registro){
		service.createregistro(registro);
		return new ResponseEntity<registro>(registro, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/registro")
	public ResponseEntity<registro> updateregistro(@RequestBody registro registro) throws RecordNotFoundException{
		service.updateregistro(registro);
		return new ResponseEntity<registro>(registro, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/registro/{id}")
	public HttpStatus deleteregistroByIdRegistro(@PathVariable("id") Long idRegistro) throws RecordNotFoundException {
		service.deleteregistroByIdRegistro(idRegistro);
		return HttpStatus.OK;
	}
}				
