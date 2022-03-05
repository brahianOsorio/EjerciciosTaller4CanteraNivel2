package com.softka.canteraNivel2.taller4Ejercicio1.domain;

import com.softka.canteraNivel2.taller4Ejercicio1.domain.interfacE.Objetc;

/**
 * 
 * Esta clase representa al objeto cuerpo espacial en el sistema planetario
 * 
 * SpacialBody body = new SpacialBody(int id, String name, double mass, double
 * density, double diameter, double distanceSun);
 * 
 * 
 * @version 1.00.000 2022-03-04
 * 
 * @author Brahian Stiven Osorio brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-03-04
 */
class SpacialBody extends Objetc {

	/**
	 * Este es el costructor de los cuerpos espaciales, el cual carga los datos
	 * 
	 * @param id          int es el numero de identificacion del cuerpo
	 * @param name        String es el nombre del cuerpo
	 * @param mass        double es la masa que tiene el cuerpo
	 * @param density     double es la densidad del cuerpo
	 * @param diameter    double es el diametro del cuerpo
	 * @param distanceSun double es la distancia que hay entre el cuerpo y el sol
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 * 
	 */
	public SpacialBody(int id, String name, double mass, double density, double diameter, double distanceSun) {
		super.id = id;
		super.name = name;
		super.mass = mass;
		super.density = density;
		super.diameter = diameter;
		super.distanceSun = distanceSun;
	}

}
