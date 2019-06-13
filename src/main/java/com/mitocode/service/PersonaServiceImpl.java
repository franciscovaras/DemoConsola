package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.repository.IPersonaRepo;

@Service//Esteriotipo que indica que corresponde a una lógica de negocio
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired //permite acceder a la instacia que está definida en el contenedor de spring
	private IPersonaRepo repo;
	
	@Override
	public void Registrar(String nombre) {
		// TODO Auto-generated method stub
		
		//repo = new PersonaRepoImpl();
		repo.Registrar(nombre);
	}
	
}
