package com.softka.canteraNivel2.taller4Ejercicio1.domain;

import com.softka.canteraNivel2.taller4Ejercicio1.domain.interfacE.Objetc;

public class Planet extends Objetc {

	public Planet(int id, String name, double mass, double density, double diameter, double distanceSun) {
		super.id = id;
		super.name = name;
		super.mass = mass;
		super.density = density;
		super.diameter = diameter;
		super.distanceSun=distanceSun;
	}

	public Planet() {
		super();
	}
	
	

}
