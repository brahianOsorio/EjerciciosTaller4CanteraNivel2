package com.softka.canteraNivel2.taller4Ejercicio4.domain;

import java.util.Calendar;

/**
 * esta es la clase que modela los vehiculos (generica)
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 * 
 * @version 1.01.000 2022-04-28
 *
 * @since 1.01.000 2022-04-28
 */
public abstract class Vehicle {
	/**
	 * Esta variable representa al tipo de vehiculo
	 */
	protected String typeOfVehicle;
	/**
	 * Esta variable representa al numero de pasajeros que tiene el vehiculo
	 */
	protected int numberOfPassengers;
	/**
	 * Esta variable confirma si los pasajeros estan en el vehiculo
	 */
	protected boolean thereArePassagers;
	/**
	 * Esta variable representa el numero de ruedas que tiene el vehiculo
	 */
	protected int numberOfWheels;
	/**
	 * Esta variable representa la fecha de matricula del vehiculo
	 */
	protected Calendar dateOfRegistraton;
	/**
	 * Esta variable representa al tipo de via en la que se desplaza el vehiculo
	 */
	protected String typeOfRoad;
	/**
	 * Esta variable representa color del vehiculo
	 */
	protected String color;

	

	public abstract String getTypeOfVehicle();

	public abstract int getNumberOfPassengers();

	public abstract boolean isThereArePassagers();

	public abstract int getNumberOfWheels();

	public abstract Calendar getDateOfRegistraton();

	public abstract String getTypeOfRoad();

	public abstract String getColor();

}
