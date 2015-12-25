package com.beans.springxml;

import org.springframework.stereotype.Component;

@Component

public class Marca {

	private int numero;
	private String nombre;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
