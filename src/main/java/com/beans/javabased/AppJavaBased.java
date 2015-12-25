package com.beans.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.annotationxml.Jugador2;
import com.beans.javabased.AppConfig;



public class AppJavaBased {

	public static void main(String...args){
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	Jugador2 jug = (Jugador2) appContext.getBean("jugador2"); //factory design

    	System.out.println(jug.getNombre() + "-" + 
				jug.getEquipo().mostrar() + 
				"-" + jug.getCamiseta().getNumero() + "-" + jug.getCamiseta().getMarca().getNombre());

	}
}
