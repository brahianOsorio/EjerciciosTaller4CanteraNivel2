package com.softka.canteraNivel2.taller4Ejercicio5.domain;

import java.util.Calendar;

import com.softka.canteraNivel2.taller4Ejercicio4.domain.Vehicle;
import com.softka.canteraNivel2.taller4Ejercicio4.domain.VehicleInterface;
/**
 * Esta clase es la que representa a una moto
 * 
 * Vehicle newVehicle = new Vehicle(); var = newVehicle.getColor();
 * 
 * @version 1.01.000 2022-04-22
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 * 
 * @since 1.01.000 2022-04-28
 *
 */
public class Motorcycle extends Vehicle implements VehicleInterface{
	/**
	 * Este es el constructor del objeto Motorcycle 
	 * 
	 * @param numberOfPassengers int este parametro es el numero de pasajeros del vehiculo 
	 * @param thereArePassagers boolean es el estado de los pasajeros si se encuantran en el vehiculo
	 * @param numberOfWheels int este parametro es numero de ruedas que tiene el vehiculo 
	 * @param dateOfRegistraton Calendar esta es la fecha de mtricula del vehiculo 
	 * @param typeOfRoad String este el la via po el cual se desplaza el vehiculo
	 * @param color String este es el color que tiene el vehiculo
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.01.000 2022-04-28
	 * 
	 */
	public Motorcycle(int numberOfPassengers, boolean thereArePassagers, int numberOfWheels,
			Calendar dateOfRegistraton, String typeOfRoad, String color) {
		super();
		this.typeOfVehicle="Motorcycle";
		this.numberOfPassengers = numberOfPassengers;
		this.thereArePassagers = thereArePassagers;
		this.numberOfWheels = numberOfWheels;
		this.dateOfRegistraton = dateOfRegistraton;
		this.typeOfRoad = typeOfRoad;
		this.color = color;
	}

	@Override
	public int getNumberOfPassengers() {
		// TODO Auto-generated method stub
		return this.numberOfPassengers;
	}

	@Override
	public boolean isThereArePassagers() {
		// TODO Auto-generated method stub
		return this.thereArePassagers;
	}

	@Override
	public int getNumberOfWheels() {
		// TODO Auto-generated method stub
		return this.numberOfWheels;
	}

	@Override
	public Calendar getDateOfRegistraton() {
		// TODO Auto-generated method stub
		return this.dateOfRegistraton;
	}

	@Override
	public String getTypeOfRoad() {
		// TODO Auto-generated method stub
		return this.typeOfRoad;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}
	@Override
	public String getTypeOfVehicle() {
		return this.typeOfVehicle;
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
