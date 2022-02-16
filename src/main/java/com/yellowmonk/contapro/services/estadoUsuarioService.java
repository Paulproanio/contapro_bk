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

import com.yellowmonk.contapro.repositories.estadoUsuarioRepository;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.estadoUsuario;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class estadoUsuarioService {

	@Autowired
	estadoUsuarioRepository repo;

	public List<estadoUsuario> getAll(){
		List<estadoUsuario> estadoUsuarioList = repo.findAll();
		if(estadoUsuarioList.size() > 0) {
			return estadoUsuarioList;
		} else {
			return new ArrayList<estadoUsuario>();
		}
	}
     		
	public estadoUsuario findByIdEstadoUsuario(Long idEstadoUsuario) throws RecordNotFoundException{
		Optional<estadoUsuario> estadoUsuario = repo.findByIdEstadoUsuario(idEstadoUsuario);
		if(estadoUsuario.isPresent()) {
			return estadoUsuario.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public estadoUsuario createestadoUsuario(estadoUsuario estadoUsuario){
		return repo.save(estadoUsuario);
	}

	public estadoUsuario updateestadoUsuario(estadoUsuario estadoUsuario) throws RecordNotFoundException {
		Optional<estadoUsuario> estadoUsuarioTemp = repo.findByIdEstadoUsuario(estadoUsuario.getIdEstadoUsuario());
	
		if(estadoUsuarioTemp.isPresent()){
			return repo.save(estadoUsuario);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteestadoUsuarioByIdEstadoUsuario(Long idEstadoUsuario) throws RecordNotFoundException{
		Optional<estadoUsuario> estadoUsuario = repo.findByIdEstadoUsuario(idEstadoUsuario);
		if(estadoUsuario.isPresent()) {
		repo.deleteByIdEstadoUsuario(idEstadoUsuario);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
