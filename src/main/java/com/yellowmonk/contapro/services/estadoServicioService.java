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

import com.yellowmonk.contapro.repositories.estadoServicioRepository;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.estadoServicio;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class estadoServicioService {

	@Autowired
	estadoServicioRepository repo;

	public List<estadoServicio> getAll(){
		List<estadoServicio> estadoServicioList = repo.findAll();
		if(estadoServicioList.size() > 0) {
			return estadoServicioList;
		} else {
			return new ArrayList<estadoServicio>();
		}
	}
     		
	public estadoServicio findByIdEstadoServicio(Long idEstadoServicio) throws RecordNotFoundException{
		Optional<estadoServicio> estadoServicio = repo.findByIdEstadoServicio(idEstadoServicio);
		if(estadoServicio.isPresent()) {
			return estadoServicio.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public estadoServicio createestadoServicio(estadoServicio estadoServicio){
		return repo.save(estadoServicio);
	}

	public estadoServicio updateestadoServicio(estadoServicio estadoServicio) throws RecordNotFoundException {
		Optional<estadoServicio> estadoServicioTemp = repo.findByIdEstadoServicio(estadoServicio.getIdEstadoServicio());
	
		if(estadoServicioTemp.isPresent()){
			return repo.save(estadoServicio);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteestadoServicioByIdEstadoServicio(Long idEstadoServicio) throws RecordNotFoundException{
		Optional<estadoServicio> estadoServicio = repo.findByIdEstadoServicio(idEstadoServicio);
		if(estadoServicio.isPresent()) {
		repo.deleteByIdEstadoServicio(idEstadoServicio);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
