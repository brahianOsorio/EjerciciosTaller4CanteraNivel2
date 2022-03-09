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
	 * 
	 */
	public double planetaryAttraction(String nameOfOneElement, String nameOfTwoElement,
			double distanceBetweenTheOjebcts) {
		/**
		 * esta variable va a contener la masa del primer objeto que se encontro con el
		 * primer nombre nameOfOneElement
		 */
		double massOfFistObject = loadMassOfAName(nameOfOneElement);
		/**
		 * esta variable va a contener la masa del segunndo objeto que se encontro con
		 * el segundo nombre nameOfTwoElement
		 */
		double massOfSecondObject = loadMassOfAName(nameOfTwoElement);

		/**
		 * aqui validamos que los datos que se cargaron sean correctos y no tengan
		 * errores si alguna variable es igual a cero entonces significa que hubo un
		 * error
		 */
		if (massOfFistObject == 0 | massOfSecondObject == 0) {
			throw new Error("Ops Ocurrio Un Error ");
		} else {
			/**
			 * se encuantra el dividendo de la formula que nos permite hallar la fuerza de
			 * atraccion entre dos objetos multiplicando la costante 6.67E-11 con las masas
			 * de los objetos involucrados
			 */
			double dividendo = 6.67E-11 * massOfFistObject * massOfSecondObject;
			/**
			 * se encuantra el divisor de la formula el cual es la distancia de los dos
			 * objetos elevada al cuadrado *
			 */
			double divisor = Math.pow(distanceBetweenTheOjebcts, 2);
			
			
			return dividendo / divisor;
		}

	}

	/**
	 * este metodo permite encontrar un planeta por el nombre  
	 * 
	 * @param name es en nombre que tiene el planeta que se busca 
	 * 
	 * @return si se encuantra un planeta retorna el planeta si no lo encuentra retorna null
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 * 
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
	/**
	 * este metodo permite encontrar un cuerpo espacial por el nombre 
	 * 
	 * @param name es en nombre que tiene el cuerpo espacial que se busca
	 * 
	 * @return si se encuantra un cuerpo espacial retorna el cuerpo espacial si no lo encuentra retorna null
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	private SpacialBody findBodyByName(String name) {
		try {
			return bodys.stream().filter(body -> body.getName().equals(name)).collect(Collectors.toList()).get(0);
		} catch (Exception mistake) {
			System.out.println(mistake.getMessage());
			System.out.println("No se encontro el Cuerpo Planetario");
			return null;
		}

	}

	/**
	 * este metodo permite cargar la masa con el nombre de un objeto  
	 * 
	 * @param name es en nombre que tiene el objeto 
	 * 
	 * @return int retorna la masa del objeto con el nombre name, siempre y cuando exista 
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	private double loadMassOfAName(String name) {
		/**
		 * esta variable se usa para retornar la masa del objeto si existe en el sistema planetario
		 */
		double answer = 0;
		try {
			/**
			 * buscamos si existe un planeta de nombre name
			 */
			Planet planet;
			planet = findPlanetByName(name);
			/**
			 * buscamos si existe un cuerpo espacial de nombre name
			 */
			SpacialBody body;
			body = findBodyByName(name);
			
			/**
			 * validamos las posibles soluciones 
			 */
			if (!planet.equals(null) && body == null) {
				/**
				 * en caso de que el objeto sea un planeta 
				 */
				answer = planet.getMass();
			} else if (!body.equals(null) && planet == null) {
				/**
				 * en caso de que el objeto sea un cuerpo espacial 
				 */
				answer = body.getMass();
			} else if (planet == null && body == null) {
				/**
				 * el caso que no sea ninguno 
				 */
				throw new Error("No Existe Un Objeto Con Nombre: " + name);
			}

		} catch (Exception mistake) {
			System.out.println(mistake.getMessage());
			throw new Error("Ops Ocurrio Un Error ");
		}
		return answer;
	}

}
