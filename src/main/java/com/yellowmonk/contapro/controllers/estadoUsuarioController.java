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

import com.yellowmonk.contapro.services.estadoUsuarioService;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.estadoUsuario;

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
public class estadoUsuarioController {
	@Autowired
	estadoUsuarioService service;
	
	@GetMapping("/estadoUsuario")
	public ResponseEntity<List<estadoUsuario>> getAll() {
		List<estadoUsuario> list = service.getAll();
		return new ResponseEntity<List<estadoUsuario>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/estadoUsuario/{id}")
	public ResponseEntity<estadoUsuario> getestadoUsuarioByIdEstadoUsuario(@PathVariable("id") Long idEstadoUsuario) throws RecordNotFoundException {
		estadoUsuario entity = service.findByIdEstadoUsuario(idEstadoUsuario);
		return new ResponseEntity<estadoUsuario>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/estadoUsuario")
	public ResponseEntity<estadoUsuario> createestadoUsuario(@RequestBody estadoUsuario estadoUsuario){
		service.createestadoUsuario(estadoUsuario);
		return new ResponseEntity<estadoUsuario>(estadoUsuario, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/estadoUsuario")
	public ResponseEntity<estadoUsuario> updateestadoUsuario(@RequestBody estadoUsuario estadoUsuario) throws RecordNotFoundException{
		service.updateestadoUsuario(estadoUsuario);
		return new ResponseEntity<estadoUsuario>(estadoUsuario, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/estadoUsuario/{id}")
	public HttpStatus deleteestadoUsuarioByIdEstadoUsuario(@PathVariable("id") Long idEstadoUsuario) throws RecordNotFoundException {
		service.deleteestadoUsuarioByIdEstadoUsuario(idEstadoUsuario);
		return HttpStatus.OK;
	}
}				
