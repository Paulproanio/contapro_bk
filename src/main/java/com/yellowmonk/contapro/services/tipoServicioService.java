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

import com.yellowmonk.contapro.repositories.tipoServicioRepository;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.tipoServicio;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class tipoServicioService {

	@Autowired
	tipoServicioRepository repo;

	public List<tipoServicio> getAll(){
		List<tipoServicio> tipoServicioList = repo.findAll();
		if(tipoServicioList.size() > 0) {
			return tipoServicioList;
		} else {
			return new ArrayList<tipoServicio>();
		}
	}
     		
	public tipoServicio findByIdTipoServicio(Long idTipoServicio) throws RecordNotFoundException{
		Optional<tipoServicio> tipoServicio = repo.findByIdTipoServicio(idTipoServicio);
		if(tipoServicio.isPresent()) {
			return tipoServicio.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public tipoServicio createtipoServicio(tipoServicio tipoServicio){
		return repo.save(tipoServicio);
	}

	public tipoServicio updatetipoServicio(tipoServicio tipoServicio) throws RecordNotFoundException {
		Optional<tipoServicio> tipoServicioTemp = repo.findByIdTipoServicio(tipoServicio.getIdTipoServicio());
	
		if(tipoServicioTemp.isPresent()){
			return repo.save(tipoServicio);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deletetipoServicioByIdTipoServicio(Long idTipoServicio) throws RecordNotFoundException{
		Optional<tipoServicio> tipoServicio = repo.findByIdTipoServicio(idTipoServicio);
		if(tipoServicio.isPresent()) {
		repo.deleteByIdTipoServicio(idTipoServicio);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
