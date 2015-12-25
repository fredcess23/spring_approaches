package com.maranatha.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maranatha.beans.Marca;
import com.maranatha.service.ServiceMarca;

public class App {

	public static void main(String[] args) {
		
		Marca marca = new Marca();
		marca.setId(4);
		marca.setNombre("Under Armour");
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springxml/xml/beans.xml");
		ServiceMarca sm = (ServiceMarca) appContext.getBean("serviceMarcaImpl");
		
		try{
			sm.registrar(marca);
		}catch(Exception e){
			
		}
		
	}

}
