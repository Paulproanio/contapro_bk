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

import com.yellowmonk.contapro.repositories.servicioRepository;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.servicio;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class servicioService {

	@Autowired
	servicioRepository repo;

	public List<servicio> getAll(){
		List<servicio> servicioList = repo.findAll();
		if(servicioList.size() > 0) {
			return servicioList;
		} else {
			return new ArrayList<servicio>();
		}
	}
     		
	public servicio findByIdServicio(Long idServicio) throws RecordNotFoundException{
		Optional<servicio> servicio = repo.findByIdServicio(idServicio);
		if(servicio.isPresent()) {
			return servicio.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public servicio createservicio(servicio servicio){
		return repo.save(servicio);
	}

	public servicio updateservicio(servicio servicio) throws RecordNotFoundException {
		Optional<servicio> servicioTemp = repo.findByIdServicio(servicio.getIdServicio());
	
		if(servicioTemp.isPresent()){
			return repo.save(servicio);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteservicioByIdServicio(Long idServicio) throws RecordNotFoundException{
		Optional<servicio> servicio = repo.findByIdServicio(idServicio);
		if(servicio.isPresent()) {
		repo.deleteByIdServicio(idServicio);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
