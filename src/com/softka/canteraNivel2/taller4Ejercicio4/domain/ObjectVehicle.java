package com.softka.canteraNivel2.taller4Ejercicio4.domain;

import java.util.Calendar;

/**
 * Esta clase es la que representa a los vehiculos, sus aracteristicas y unos
 * metodos nesesarios
 * 
 * Vehicle newVehicle = new Vehicle(); var = newVehicle.getColor();
 * 
 * @version 1.01.000 2022-04-22
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-03-08
 *
 */
public class ObjectVehicle extends Vehicle implements VehicleInterface {

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
	public ObjectVehicle(String typeOfVehicle, int numberOfPassengers, boolean thereArePassagers, int numberOfWheels,
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
	@Override
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	
	@Override
	public boolean isThereArePassagers() {
		return thereArePassagers;
	}
	@Override
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	@Override
	public Calendar getDateOfRegistraton() {
		return dateOfRegistraton;
	}
	@Override
	public String getTypeOfRoad() {
		return typeOfRoad;
	}
	@Override
	public String getColor() {
		return color;
	}

	@Override
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tunrRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}
	
	

}
