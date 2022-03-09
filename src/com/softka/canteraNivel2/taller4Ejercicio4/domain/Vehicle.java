package com.softka.canteraNivel2.taller4Ejercicio4.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Esta clase es la que representa a los vehiculos, sus aracteristicas y unos
 * metodos nesesarios
 * 
 * Vehicle newVehicle = new Vehicle(); var = newVehicle.getColor();
 * 
 * @version 1.00.000 2022-03-08
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-03-08
 *
 */
public class Vehicle {
	/**
	 * Esta variable representa al tipo de vehiculo
	 */
	private String typeOfVehicle;
	/**
	 * Esta variable representa al numero de pasajeros que tiene el vehiculo
	 */
	private int numberOfPassengers;
	/**
	 * Esta variable confirma si los pasajeros estan en el vehiculo
	 */
	private boolean thereArePassagers;
	/**
	 * Esta variable representa el numero de ruedas que tiene el vehiculo
	 */
	private int numberOfWheels;
	/**
	 * Esta variable representa la fecha de matricula del vehiculo
	 */
	private Calendar dateOfRegistraton; 
	/**
	 * Esta variable representa al tipo de via en la que se desplaza el vehiculo
	 */
	private String typeOfRoad;
	/**
	 * Esta variable representa color del vehiculo
	 */
	private String color;
	
	
	/**
	 * Este es el constructor del objeto vehiculo 
	 * 
	 * @param typeOfVehicle String este parametro es el tipo de vehiculo 
	 * @param numberOfPassengers int este parametro es el numero de pasajeros del vehiculo 
	 * @param thereArePassagers boolean es el estado de los pasajeros si se encuantran en el vehiculo
	 * @param numberOfWheels int este parametro es numero de ruedas que tiene el vehiculo 
	 * @param dateOfRegistraton Calendar esta es la fecha de mtricula del vehiculo 
	 * @param typeOfRoad String este el la via po el cual se desplaza el vehiculo
	 * @param color String este es el color que tiene el vehiculo
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 * 
	 */
	public Vehicle(String typeOfVehicle, int numberOfPassengers, boolean thereArePassagers, int numberOfWheels,
			Calendar dateOfRegistraton, String typeOfRoad, String color) {
		super();
		this.typeOfVehicle = typeOfVehicle;
		this.numberOfPassengers = numberOfPassengers;
		this.thereArePassagers = thereArePassagers;
		this.numberOfWheels = numberOfWheels;
		this.dateOfRegistraton = dateOfRegistraton;
		this.typeOfRoad = typeOfRoad;
		this.color = color;
		
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public boolean isThereArePassagers() {
		return thereArePassagers;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public Calendar getDateOfRegistraton() {
		return dateOfRegistraton;
	}

	public String getTypeOfRoad() {
		return typeOfRoad;
	}

	public String getColor() {
		return color;
	}
	
	

}
