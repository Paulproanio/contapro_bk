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

import com.yellowmonk.contapro.repositories.registroRepository;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.registro;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class registroService {

	@Autowired
	registroRepository repo;

	public List<registro> getAll(){
		List<registro> registroList = repo.findAll();
		if(registroList.size() > 0) {
			return registroList;
		} else {
			return new ArrayList<registro>();
		}
	}
     		
	public registro findByIdRegistro(Long idRegistro) throws RecordNotFoundException{
		Optional<registro> registro = repo.findByIdRegistro(idRegistro);
		if(registro.isPresent()) {
			return registro.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public registro createregistro(registro registro){
		return repo.save(registro);
	}

	public registro updateregistro(registro registro) throws RecordNotFoundException {
		Optional<registro> registroTemp = repo.findByIdRegistro(registro.getIdRegistro());
	
		if(registroTemp.isPresent()){
			return repo.save(registro);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteregistroByIdRegistro(Long idRegistro) throws RecordNotFoundException{
		Optional<registro> registro = repo.findByIdRegistro(idRegistro);
		if(registro.isPresent()) {
		repo.deleteByIdRegistro(idRegistro);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
