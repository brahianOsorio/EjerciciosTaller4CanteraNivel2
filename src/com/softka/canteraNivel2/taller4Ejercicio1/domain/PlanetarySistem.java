package com.softka.canteraNivel2.taller4Ejercicio1.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Esta clase es la representacion de un sistema planetario con sus respectivos
 * planetas y cuerpos espaciales
 * 
 * PlanetSistem planetSistem = new PlanetSistem();
 *
 * @version 1.00.000 2022-03-04
 * 
 * @author Brhaian Stiven Osorio brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-03-04
 */
public class PlanetarySistem {
	/**
	 * Este es el arreglo representa los planetas que existen en el sistema
	 * planetario
	 */
	private List<Planet> planets = new ArrayList<Planet>();
	/**
	 * Este es el arreglo que representa los cuerpos espaciales del sistema
	 * planetario
	 */
	private List<SpacialBody> bodys = new ArrayList<SpacialBody>();

	/**
	 * ese metodo nos permite visualizar en otra parte del codigo el arreglo planets
	 * el cual representaa los planetas que pertenecen al sistema planetario
	 * 
	 * @return el arreglo de planetas del sistema planetario
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	public List<Planet> getPlanets() {
		return planets;
	}

	/**
	 * este metodo permite acceder un planeta a el sistema planetario
	 * 
	 * @param planet es el nuevo planeta en el sistema planetario
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	public void addPlanet(Planet planet) {
		this.planets.add(planet);
	}

	/**
	 * ese metodo nos permite visualizar en otra parte del codigo el arreglo bodys
	 * el cual representaa los cuerpos espaciales que pertenecen al sistema
	 * planetario
	 * 
	 * @return el arreglo de cuerpos espaciales del sistema planetario
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	public List<SpacialBody> getBodys() {
		return bodys;
	}

	/**
	 * este metodo permite acceder un cuerpo espacial a el sistema planetario
	 * 
	 * @param body es el nuevo cuerpo espacial en el sistema planetario
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	public void addBody(SpacialBody body) {
		this.bodys.add(body);
	}

	/**
	 * este metodo calcula la atraccion planetaria entre cualquier objeto del
	 * sistema planetario
	 * 
	 * @param nameOfOneElement     este parametro representa al nombre de un objeto
	 *                             en el sistema planetario cualquiera involucrado
	 *                             en la atraccion planetaria deseada
	 * @param nameOfTwoElementeste parametro representa al nombre de un objeto en el
	 *                             sistema planetario cualquiera involucrado en la
	 *                             atraccion planetaria deseada
	 * @return retorna la fuerza de atraccion entre los dos objetos involucrados en
	 *         el sistema
	 *         
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04 
	 */
	public double planetaryAttraction(String nameOfOneElement, String nameOfTwoElement) {
		/**
		 * 
		 */
		double massOfFistObject = loadMassOfAName(nameOfOneElement);
		/**
		 * 
		 */
		double massOfSecondObject = loadDistanceOfAName(nameOfTwoElement);
		/**
		 * 
		 */
		double distanceOfFistObject = loadDistanceOfAName(nameOfOneElement);
		/**
		 * 
		 */
		double distanceOfSecondObject = loadDistanceOfAName(nameOfTwoElement);

		
		/**
		 * aqui validamos que los datos que se cargaron sean correctos y no tengan errores
		 * si alguna variable es igual a cero entonces significa que hubo un error   
		 */
		if (massOfFistObject == 0 | massOfSecondObject == 0 | distanceOfFistObject == 0 | distanceOfSecondObject == 0) {
			throw new Error("Ops Ocurrio Un Error ");
		} else {
			double divisor = 6.67E-11 * massOfFistObject * massOfSecondObject;
			double dividendo = Math.pow(distanceOfFistObject, 2) + Math.pow(distanceOfSecondObject, 2);
			return divisor / dividendo;
		}

	}
	/**
	 *  
	 * @param name
	 * @return
	 */
	private Planet findPlanetByName(String name) {
		try {

			return planets.stream().filter(planet -> planet.getName().equals(name)).collect(Collectors.toList()).get(0);

		} catch (Exception mistake) {
			System.out.println(mistake.getMessage());
			System.out.println("No se encontro el Planeta");
			return null;
		}

	}

	private SpacialBody findBodyByName(String name) {
		try {
			return bodys.stream().filter(body -> body.getName().equals(name)).collect(Collectors.toList()).get(0);
		} catch (Exception mistake) {
			System.out.println(mistake.getMessage());
			System.out.println("No se encontro el Cuerpo Planetario");
			return null;
		}

	}

	private double loadMassOfAName(String name) {
		double answer = 0;
		try {
			Planet planet;
			planet = findPlanetByName(name);
			SpacialBody body;
			body = findBodyByName(name);

			if (!planet.equals(null) && body == null) {
				answer = planet.getMass();
			} else if (!body.equals(null) && planet == null) {
				answer = body.getMass();
			} else if (planet == null && body == null) {
				throw new Error("No Existe Un Objeto Con Nombre: " + name);
			}

		} catch (Exception mistake) {
			System.out.println(mistake.getMessage());
			throw new Error("Ops Ocurrio Un Error ");
		}
		return answer;
	}

	private double loadDistanceOfAName(String name) {
		double answer = 0;
		try {
			Planet planet;
			planet = findPlanetByName(name);
			SpacialBody body;
			body = findBodyByName(name);

			if (!planet.equals(null) && body == null) {
				answer = planet.getDistanceSun();
			} else if (!body.equals(null) && planet == null) {
				answer = body.getDistanceSun();
			} else if (planet == null && body == null) {
				throw new Error("Ops Ocurrio Un Error ");
			}

		} catch (Exception mistake) {
			System.out.println(mistake.getMessage());
			throw new Error("Ops Ocurrio Un Error ");
		}
		return answer;
	}
}
