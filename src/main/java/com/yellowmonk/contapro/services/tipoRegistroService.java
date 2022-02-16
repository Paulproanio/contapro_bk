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
package com.yellowmonk.contapro.services;

import com.yellowmonk.contapro.repositories.tipoRegistroRepository;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.tipoRegistro;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class tipoRegistroService {

	@Autowired
	tipoRegistroRepository repo;

	public List<tipoRegistro> getAll(){
		List<tipoRegistro> tipoRegistroList = repo.findAll();
		if(tipoRegistroList.size() > 0) {
			return tipoRegistroList;
		} else {
			return new ArrayList<tipoRegistro>();
		}
	}
     		
	public tipoRegistro findByIdTipoRegistro(Long idTipoRegistro) throws RecordNotFoundException{
		Optional<tipoRegistro> tipoRegistro = repo.findByIdTipoRegistro(idTipoRegistro);
		if(tipoRegistro.isPresent()) {
			return tipoRegistro.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public tipoRegistro createtipoRegistro(tipoRegistro tipoRegistro){
		return repo.save(tipoRegistro);
	}

	public tipoRegistro updatetipoRegistro(tipoRegistro tipoRegistro) throws RecordNotFoundException {
		Optional<tipoRegistro> tipoRegistroTemp = repo.findByIdTipoRegistro(tipoRegistro.getIdTipoRegistro());
	
		if(tipoRegistroTemp.isPresent()){
			return repo.save(tipoRegistro);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deletetipoRegistroByIdTipoRegistro(Long idTipoRegistro) throws RecordNotFoundException{
		Optional<tipoRegistro> tipoRegistro = repo.findByIdTipoRegistro(idTipoRegistro);
		if(tipoRegistro.isPresent()) {
		repo.deleteByIdTipoRegistro(idTipoRegistro);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
