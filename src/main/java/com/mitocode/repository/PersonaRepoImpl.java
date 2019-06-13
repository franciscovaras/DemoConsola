package com.mitocode.repository;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import org.springframework.stereotype.Repository;

import com.example.demo.DemoConsolaApplication;


/*	
 *A la clase que se quiere ser manejada por spring para que pueda tener una estancia en su memoria
 *Se tiene que anotar con los esteriotipos
 */

@Repository //Esteriotipo que indica que se puede ingresar a datos o repositorios de información
public class PersonaRepoImpl implements IPersonaRepo{
	
	private static Logger LOG = (Logger) LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Override
	public void Registrar(String nombre) {
		
		LOG.info("Se registró a" + nombre);
	}

}
