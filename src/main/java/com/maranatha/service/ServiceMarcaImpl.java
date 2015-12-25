package com.maranatha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.maranatha.beans.Marca;
import com.maranatha.dao.DAOMarca;

@Service
public class ServiceMarcaImpl implements ServiceMarca{

	@Autowired
	@Qualifier("marcaQualifier")
	private DAOMarca daoMarca; //autowired by type (without @Qualifier) and by name (with @Qualifier)
	
	public void registrar(Marca marca) throws Exception {
		
		try{
			daoMarca.registar(marca);
		}catch(Exception e){
			throw e;
		}
	}

}
