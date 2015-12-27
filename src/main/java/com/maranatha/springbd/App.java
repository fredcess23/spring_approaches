package com.maranatha.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maranatha.beans.Jugador;
import com.maranatha.service.ServiceJugador;

public class App {

	public static void main(String[] args) {
		
		//Marca marca = new Marca();
		//marca.setId(4);
		//marca.setNombre("Under Armour");
		
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springxml/xml/beans.xml");
		//ServiceMarca sm = (ServiceMarca) appContext.getBean("serviceMarcaImpl");
		ServiceJugador sm = (ServiceJugador) appContext.getBean("serviceJugadorImpl");
		Jugador jugador = (Jugador) appContext.getBean("jugador");
		
		try{
			sm.registrar(jugador);
		}catch(Exception e){
			
		}
		
	}

}
