package com.softka.canteraNivel2.taller4Ejercicio1.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlanetSistem {

	private List<Planet> planets = new ArrayList<Planet>();
	private List<SpacialBody> bodys = new ArrayList<SpacialBody>();

	public List<Planet> getPlanets() {
		return planets;
	}

	public void addPlanet(Planet planet) {
		this.planets.add(planet);
	}

	public List<SpacialBody> getBodys() {
		return bodys;
	}

	public void addBody(SpacialBody body) {
		this.bodys.add(body);
	}

	public double atraccionPlanetaria(String nameOfOneElement, String nameOfTwoElement) {

		double massOfFistObject = loadMassOfAName(nameOfOneElement);
		double massOfSecondObject = loadDistanceOfAName(nameOfTwoElement);
		double distanceOfFistObject = loadDistanceOfAName(nameOfOneElement);
		double distanceOfSecondObject = loadDistanceOfAName(nameOfTwoElement);

		if (massOfFistObject == 0 | massOfSecondObject == 0 | distanceOfFistObject == 0 | distanceOfSecondObject == 0) {
			return 0;
		} else {
			double divisor = 6.67E-11 * massOfFistObject * massOfSecondObject;
			double dividendo = Math.pow(distanceOfFistObject, 2) + Math.pow(distanceOfSecondObject, 2);
			return divisor / dividendo;
		}

	}

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
				answer = 0;
			}

		} catch (Exception mistake) {
			System.out.println(mistake.getMessage());
			System.out.println("! Ocurrio un Eror ");
			answer = 0;
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
				answer = 0;
			}

		} catch (Exception mistake) {
			System.out.println(mistake.getMessage());
			System.out.println("! Ocurrio un Eror ");
			answer = 0;
		}
		return answer;
	}
}
