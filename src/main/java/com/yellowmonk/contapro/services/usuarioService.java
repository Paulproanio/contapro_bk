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

import com.yellowmonk.contapro.repositories.usuarioRepository;
import com.yellowmonk.contapro.RecordNotFoundException;
import com.yellowmonk.contapro.entities.usuario;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class usuarioService {

	@Autowired
	usuarioRepository repo;

	public List<usuario> getAll(){
		List<usuario> usuarioList = repo.findAll();
		if(usuarioList.size() > 0) {
			return usuarioList;
		} else {
			return new ArrayList<usuario>();
		}
	}
     		
	public usuario findByIdUsuario(Long idUsuario) throws RecordNotFoundException{
		Optional<usuario> usuario = repo.findByIdUsuario(idUsuario);
		if(usuario.isPresent()) {
			return usuario.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public usuario createusuario(usuario usuario){
		return repo.save(usuario);
	}

	public usuario updateusuario(usuario usuario) throws RecordNotFoundException {
		Optional<usuario> usuarioTemp = repo.findByIdUsuario(usuario.getIdUsuario());
	
		if(usuarioTemp.isPresent()){
			return repo.save(usuario);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteusuarioByIdUsuario(Long idUsuario) throws RecordNotFoundException{
		Optional<usuario> usuario = repo.findByIdUsuario(idUsuario);
		if(usuario.isPresent()) {
		repo.deleteByIdUsuario(idUsuario);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
