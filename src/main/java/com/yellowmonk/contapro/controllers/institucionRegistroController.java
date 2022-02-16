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

import com.yellowmonk.contapro.services.institucionRegistroService;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.institucionRegistro;

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
public class institucionRegistroController {
	@Autowired
	institucionRegistroService service;
	
	@GetMapping("/institucionRegistro")
	public ResponseEntity<List<institucionRegistro>> getAll() {
		List<institucionRegistro> list = service.getAll();
		return new ResponseEntity<List<institucionRegistro>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/institucionRegistro/{id}")
	public ResponseEntity<institucionRegistro> getinstitucionRegistroByIdInstitucionRegistro(@PathVariable("id") Long idInstitucionRegistro) throws RecordNotFoundException {
		institucionRegistro entity = service.findByIdInstitucionRegistro(idInstitucionRegistro);
		return new ResponseEntity<institucionRegistro>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/institucionRegistro")
	public ResponseEntity<institucionRegistro> createinstitucionRegistro(@RequestBody institucionRegistro institucionRegistro){
		service.createinstitucionRegistro(institucionRegistro);
		return new ResponseEntity<institucionRegistro>(institucionRegistro, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/institucionRegistro")
	public ResponseEntity<institucionRegistro> updateinstitucionRegistro(@RequestBody institucionRegistro institucionRegistro) throws RecordNotFoundException{
		service.updateinstitucionRegistro(institucionRegistro);
		return new ResponseEntity<institucionRegistro>(institucionRegistro, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/institucionRegistro/{id}")
	public HttpStatus deleteinstitucionRegistroByIdInstitucionRegistro(@PathVariable("id") Long idInstitucionRegistro) throws RecordNotFoundException {
		service.deleteinstitucionRegistroByIdInstitucionRegistro(idInstitucionRegistro);
		return HttpStatus.OK;
	}
}				
