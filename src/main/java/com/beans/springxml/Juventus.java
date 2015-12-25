package com.beans.springxml;

import org.springframework.stereotype.Component;

@Component

public class Juventus implements IEquipo {

	public String mostrar() {
		return "Juventus";
	}

}
