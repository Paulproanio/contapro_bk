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

import com.yellowmonk.contapro.repositories.institucionRegistroRepository;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.institucionRegistro;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class institucionRegistroService {

	@Autowired
	institucionRegistroRepository repo;

	public List<institucionRegistro> getAll(){
		List<institucionRegistro> institucionRegistroList = repo.findAll();
		if(institucionRegistroList.size() > 0) {
			return institucionRegistroList;
		} else {
			return new ArrayList<institucionRegistro>();
		}
	}
     		
	public institucionRegistro findByIdInstitucionRegistro(Long idInstitucionRegistro) throws RecordNotFoundException{
		Optional<institucionRegistro> institucionRegistro = repo.findByIdInstitucionRegistro(idInstitucionRegistro);
		if(institucionRegistro.isPresent()) {
			return institucionRegistro.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public institucionRegistro createinstitucionRegistro(institucionRegistro institucionRegistro){
		return repo.save(institucionRegistro);
	}

	public institucionRegistro updateinstitucionRegistro(institucionRegistro institucionRegistro) throws RecordNotFoundException {
		Optional<institucionRegistro> institucionRegistroTemp = repo.findByIdInstitucionRegistro(institucionRegistro.getIdInstitucionRegistro());
	
		if(institucionRegistroTemp.isPresent()){
			return repo.save(institucionRegistro);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteinstitucionRegistroByIdInstitucionRegistro(Long idInstitucionRegistro) throws RecordNotFoundException{
		Optional<institucionRegistro> institucionRegistro = repo.findByIdInstitucionRegistro(idInstitucionRegistro);
		if(institucionRegistro.isPresent()) {
		repo.deleteByIdInstitucionRegistro(idInstitucionRegistro);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
