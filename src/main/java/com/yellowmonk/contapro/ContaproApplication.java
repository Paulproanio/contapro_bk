																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. Gómez (2020)
| File Date: Tue Feb 15 22:47:34 ECT 2022
| 
 -------------------------------------------------------------------
																*/
package com.yellowmonk.contapro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.TimeZone;
import javax.annotation.PostConstruct;					

@SpringBootApplication
public class ContaproApplication {
	public static void main(String[] args) {
		SpringApplication.run(ContaproApplication.class, args);
		System.out.println("Active resources for usuario entity");
		System.out.println("GET");
		System.out.println("/api/conta/usuario");
		System.out.println("/api/conta/usuario/{id}");
		System.out.println("POST");
		System.out.println("/api/conta/usuario");
		System.out.println("PUT");
		System.out.println("/api/conta/usuario");
		System.out.println("DELETE");
		System.out.println("/api/conta/usuario/{id}");
		System.out.println("Active resources for estadoUsuario entity");
		System.out.println("GET");
		System.out.println("/api/conta/estadoUsuario");
		System.out.println("/api/conta/estadoUsuario/{id}");
		System.out.println("POST");
		System.out.println("/api/conta/estadoUsuario");
		System.out.println("PUT");
		System.out.println("/api/conta/estadoUsuario");
		System.out.println("DELETE");
		System.out.println("/api/conta/estadoUsuario/{id}");
		System.out.println("Active resources for tipoUsuario entity");
		System.out.println("GET");
		System.out.println("/api/conta/tipoUsuario");
		System.out.println("/api/conta/tipoUsuario/{id}");
		System.out.println("POST");
		System.out.println("/api/conta/tipoUsuario");
		System.out.println("PUT");
		System.out.println("/api/conta/tipoUsuario");
		System.out.println("DELETE");
		System.out.println("/api/conta/tipoUsuario/{id}");
		System.out.println("Active resources for registro entity");
		System.out.println("GET");
		System.out.println("/api/conta/registro");
		System.out.println("/api/conta/registro/{id}");
		System.out.println("POST");
		System.out.println("/api/conta/registro");
		System.out.println("PUT");
		System.out.println("/api/conta/registro");
		System.out.println("DELETE");
		System.out.println("/api/conta/registro/{id}");
		System.out.println("Active resources for tipoRegistro entity");
		System.out.println("GET");
		System.out.println("/api/conta/tipoRegistro");
		System.out.println("/api/conta/tipoRegistro/{id}");
		System.out.println("POST");
		System.out.println("/api/conta/tipoRegistro");
		System.out.println("PUT");
		System.out.println("/api/conta/tipoRegistro");
		System.out.println("DELETE");
		System.out.println("/api/conta/tipoRegistro/{id}");
		System.out.println("Active resources for institucionRegistro entity");
		System.out.println("GET");
		System.out.println("/api/conta/institucionRegistro");
		System.out.println("/api/conta/institucionRegistro/{id}");
		System.out.println("POST");
		System.out.println("/api/conta/institucionRegistro");
		System.out.println("PUT");
		System.out.println("/api/conta/institucionRegistro");
		System.out.println("DELETE");
		System.out.println("/api/conta/institucionRegistro/{id}");
		System.out.println("Active resources for servicio entity");
		System.out.println("GET");
		System.out.println("/api/conta/servicio");
		System.out.println("/api/conta/servicio/{id}");
		System.out.println("POST");
		System.out.println("/api/conta/servicio");
		System.out.println("PUT");
		System.out.println("/api/conta/servicio");
		System.out.println("DELETE");
		System.out.println("/api/conta/servicio/{id}");
		System.out.println("Active resources for tipoServicio entity");
		System.out.println("GET");
		System.out.println("/api/conta/tipoServicio");
		System.out.println("/api/conta/tipoServicio/{id}");
		System.out.println("POST");
		System.out.println("/api/conta/tipoServicio");
		System.out.println("PUT");
		System.out.println("/api/conta/tipoServicio");
		System.out.println("DELETE");
		System.out.println("/api/conta/tipoServicio/{id}");
		System.out.println("Active resources for estadoServicio entity");
		System.out.println("GET");
		System.out.println("/api/conta/estadoServicio");
		System.out.println("/api/conta/estadoServicio/{id}");
		System.out.println("POST");
		System.out.println("/api/conta/estadoServicio");
		System.out.println("PUT");
		System.out.println("/api/conta/estadoServicio");
		System.out.println("DELETE");
		System.out.println("/api/conta/estadoServicio/{id}");
		System.out.println("Active resources for institucion entity");
		System.out.println("GET");
		System.out.println("/api/conta/institucion");
		System.out.println("/api/conta/institucion/{id}");
		System.out.println("POST");
		System.out.println("/api/conta/institucion");
		System.out.println("PUT");
		System.out.println("/api/conta/institucion");
		System.out.println("DELETE");
		System.out.println("/api/conta/institucion/{id}");
	}
	
	@PostConstruct
	public void init(){
		TimeZone.setDefault(TimeZone.getTimeZone("America/Guayaquil"));
	}						
}
