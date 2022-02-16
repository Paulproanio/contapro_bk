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

import com.yellowmonk.contapro.repositories.institucionRepository;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.institucion;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class institucionService {

	@Autowired
	institucionRepository repo;

	public List<institucion> getAll(){
		List<institucion> institucionList = repo.findAll();
		if(institucionList.size() > 0) {
			return institucionList;
		} else {
			return new ArrayList<institucion>();
		}
	}
     		
	public institucion findByIdInstitucion(Long idInstitucion) throws RecordNotFoundException{
		Optional<institucion> institucion = repo.findByIdInstitucion(idInstitucion);
		if(institucion.isPresent()) {
			return institucion.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public institucion createinstitucion(institucion institucion){
		return repo.save(institucion);
	}

	public institucion updateinstitucion(institucion institucion) throws RecordNotFoundException {
		Optional<institucion> institucionTemp = repo.findByIdInstitucion(institucion.getIdInstitucion());
	
		if(institucionTemp.isPresent()){
			return repo.save(institucion);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteinstitucionByIdInstitucion(Long idInstitucion) throws RecordNotFoundException{
		Optional<institucion> institucion = repo.findByIdInstitucion(idInstitucion);
		if(institucion.isPresent()) {
		repo.deleteByIdInstitucion(idInstitucion);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
