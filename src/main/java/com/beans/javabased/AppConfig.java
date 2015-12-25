package com.beans.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.annotationxml.Jugador2;
import com.beans.springxml.Barcelona;
import com.beans.springxml.Camiseta;
import com.beans.springxml.Juventus;
import com.beans.springxml.Marca;

@Configuration
public class AppConfig {

	@Bean
	public Jugador2 jugador2(){
		return new Jugador2();
	}
	
	@Bean
	public Barcelona barcelona(){
		return new Barcelona();
	}

	@Bean
	public Juventus juventus(){
		return new Juventus();
	}
	
	@Bean
	public Camiseta camiseta(){
		return new Camiseta();
	}
	
	@Bean
	public Marca marca(){
		return new Marca();
	}
}
