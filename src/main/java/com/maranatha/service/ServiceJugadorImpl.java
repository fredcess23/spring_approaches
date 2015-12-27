package com.maranatha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.maranatha.beans.Jugador;
import com.maranatha.dao.DAOJugador;

@Service
public class ServiceJugadorImpl implements ServiceJugador {
	
	@Autowired
	@Qualifier("jugadorQualifier")
	private DAOJugador daoJugador; //autowired by type (without @Qualifier) and by name (with @Qualifier)
	
	public void registrar(Jugador jugador) throws Exception {
	
		try{
			daoJugador.registar(jugador);
		}catch(Exception e){
			throw e;
		}
	}

}
