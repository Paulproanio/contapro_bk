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

import com.yellowmonk.contapro.services.tipoUsuarioService;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.tipoUsuario;

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
public class tipoUsuarioController {
	@Autowired
	tipoUsuarioService service;
	
	@GetMapping("/tipoUsuario")
	public ResponseEntity<List<tipoUsuario>> getAll() {
		List<tipoUsuario> list = service.getAll();
		return new ResponseEntity<List<tipoUsuario>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/tipoUsuario/{id}")
	public ResponseEntity<tipoUsuario> gettipoUsuarioByIdTipoUsuario(@PathVariable("id") Long idTipoUsuario) throws RecordNotFoundException {
		tipoUsuario entity = service.findByIdTipoUsuario(idTipoUsuario);
		return new ResponseEntity<tipoUsuario>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/tipoUsuario")
	public ResponseEntity<tipoUsuario> createtipoUsuario(@RequestBody tipoUsuario tipoUsuario){
		service.createtipoUsuario(tipoUsuario);
		return new ResponseEntity<tipoUsuario>(tipoUsuario, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/tipoUsuario")
	public ResponseEntity<tipoUsuario> updatetipoUsuario(@RequestBody tipoUsuario tipoUsuario) throws RecordNotFoundException{
		service.updatetipoUsuario(tipoUsuario);
		return new ResponseEntity<tipoUsuario>(tipoUsuario, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/tipoUsuario/{id}")
	public HttpStatus deletetipoUsuarioByIdTipoUsuario(@PathVariable("id") Long idTipoUsuario) throws RecordNotFoundException {
		service.deletetipoUsuarioByIdTipoUsuario(idTipoUsuario);
		return HttpStatus.OK;
	}
}				
