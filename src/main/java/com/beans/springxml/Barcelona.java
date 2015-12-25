package com.beans.springxml;

import org.springframework.stereotype.Component;

@Component

public class Barcelona implements IEquipo{

	public String mostrar() {
		return "Barcelona";
	}

}
