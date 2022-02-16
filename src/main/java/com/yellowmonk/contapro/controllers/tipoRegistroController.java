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

import com.yellowmonk.contapro.services.tipoRegistroService;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.tipoRegistro;

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
public class tipoRegistroController {
	@Autowired
	tipoRegistroService service;
	
	@GetMapping("/tipoRegistro")
	public ResponseEntity<List<tipoRegistro>> getAll() {
		List<tipoRegistro> list = service.getAll();
		return new ResponseEntity<List<tipoRegistro>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/tipoRegistro/{id}")
	public ResponseEntity<tipoRegistro> gettipoRegistroByIdTipoRegistro(@PathVariable("id") Long idTipoRegistro) throws RecordNotFoundException {
		tipoRegistro entity = service.findByIdTipoRegistro(idTipoRegistro);
		return new ResponseEntity<tipoRegistro>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/tipoRegistro")
	public ResponseEntity<tipoRegistro> createtipoRegistro(@RequestBody tipoRegistro tipoRegistro){
		service.createtipoRegistro(tipoRegistro);
		return new ResponseEntity<tipoRegistro>(tipoRegistro, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/tipoRegistro")
	public ResponseEntity<tipoRegistro> updatetipoRegistro(@RequestBody tipoRegistro tipoRegistro) throws RecordNotFoundException{
		service.updatetipoRegistro(tipoRegistro);
		return new ResponseEntity<tipoRegistro>(tipoRegistro, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/tipoRegistro/{id}")
	public HttpStatus deletetipoRegistroByIdTipoRegistro(@PathVariable("id") Long idTipoRegistro) throws RecordNotFoundException {
		service.deletetipoRegistroByIdTipoRegistro(idTipoRegistro);
		return HttpStatus.OK;
	}
}				
