package com.beans.springxml;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.annotationxml.Jugador2;


/**
 * Un jugador de futbol se cambie de equipo dinamicamente 
 * por entrada de usuario y mostrar al final los valores del jugador
 *
 *Jugador
 *-------
 *id,nombre,Equipo,Camiseta
 *
 *Equipo
 *-------
 *id,nombre
 *
 *Camiseta
 *-------
 *id,numero,Marca
 *
 *Marca
 *------
 *id,nombre
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Eliga un equipo: 1-Barcelona 2-Juventus");
    	int respuesta = sc.nextInt();
    	

    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springxml/xml/beans.xml");
    	//Jugador jug = (Jugador) appContext.getBean("jugador1"); //xml approach
    	Jugador2 jug = (Jugador2) appContext.getBean("jugador2"); //annotation approach
		
    	//we can modify the default settings (from xml)
    	switch(respuesta){
    	case 1:
    		jug.setEquipo(new Barcelona());
    		break;
    	case 2:
    		jug.setEquipo(new Juventus());
    		break;    		
    	}
    	
    	
		System.out.println(jug.getNombre() + "-" + 
				jug.getEquipo().mostrar() + 
				"-" + jug.getCamiseta().getNumero() + "-" + jug.getCamiseta().getMarca().getNombre());
	}
}
