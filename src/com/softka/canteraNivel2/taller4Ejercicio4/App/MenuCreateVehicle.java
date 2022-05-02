package com.softka.canteraNivel2.taller4Ejercicio4.App;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.softka.canteraNivel2.taller4Ejercicio4.domain.ObjectVehicle;
import com.softka.canteraNivel2.taller4Ejercicio4.domain.Vehicle;
import com.softka.canteraNivel2.taller4Ejercicios.Util.ValidatorMenu;

/**
 * Esta clse es la que nos va a permitir mostrar el menu necesario para crear un
 * vehicle
 * 
 * MenuCreateVehicle newMenuVehicle = new MenuCreateVehicle();
 * newMenuVehicle.start(); Vehicle newVehicle = newMenuVehicle.createVehicle();
 * 
 * @version 1.00.001 2022-04-28
 * 
 * @author Brahian Stiven Osorio Velasquez brahainstiven.osorio@gmail.com
 *
 * @since 1.00.000 2022-03-08
 *
 */
public class MenuCreateVehicle {
	/**
	 * Esta variable almacena al tipo de vehiculo
	 */
	private String typeOfVehicle;
	/**
	 * Esta variable almacena al numero de pasajeros que tiene el vehiculo
	 */
	private int numberOfPassengers;
	/**
	 * Esta variable almacena la confirmacion delos pasageros
	 */
	private boolean thereArePassagers;
	/**
	 * Esta variable almacena el numero de ruedas que tiene el vehiculo
	 */
	private int numberOfWheels;
	/**
	 * Esta variable almacena la fecha de matricula del vehiculo
	 */
	private Calendar dateOfRegistraton;
	/**
	 * Esta variable almacena al tipo de via en la que se desplaza el vehiculo
	 */
	private String typeOfRoad;
	/**
	 * Esta variable almacena color del vehiculo
	 */
	private String color;
	/**
	 * esta variable almacena el año de la fecha de matricula del vehiculo
	 */
	private int year;
	/**
	 * esta variable almacena el mes de la fecha de matricula del vehiculo
	 */
	private int month;
	/**
	 * esta variable almacena el dia de la fecha de matricula del vehiculo
	 */
	private int day;

	/**
	 * este metodo se usa para desplegar el menu para crear un vehiculo
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 */
	public void start() {
		try {

			System.out.println(" Bienvenido ");
			typeOfVehicle = ValidatorMenu.getText("Ingrese el tipo de Vehiculo: ");
			numberOfPassengers =(int)ValidatorMenu.getNumber("Ingrese el numero de pasajeros del Vehiculo: ");
			boolean exit = false;
			while (!exit) {
				System.out.println("");
				System.out.println("");
				int option = ValidatorMenu.getNumberToTwoOptions("1-> Hay pasageros en el vehiculo \n2-> No hay pasajeros en el vehiculo ");
				switch (option) {
				case 1:
					thereArePassagers = true;
					exit = true;
					break;
				case 2:
					thereArePassagers = false;
					exit = true;
					break;

				default:
					System.out.println("Numero No Valido Intente Nuevamente ");
					break;
				}
			}
			numberOfWheels = (int)ValidatorMenu.getNumber("Ingrese el numero de ruedas del Vehiculo: ");

			year = ValidatorMenu.getNumberToYear("Ingrese el año de la fecha de la Matricula del Vehiculo: ");			
			month = ValidatorMenu.getNumberToMonth("Ingrese el mes de la fecha de la Matricula del Vehiculo: ");		
			day = ValidatorMenu.getNumberToDay("Ingrese el dia de la fecha de la Matricula del Vehiculo: ");
			
			dateOfRegistraton = new GregorianCalendar(year, month, day);

			typeOfRoad = ValidatorMenu.getText("Ingrese el tipo de via en la que se desplaza el Vehiculo: ");

			color = ValidatorMenu.getText("Ingrese el color del Vehiculo: ");

		} catch (Exception mistake) {
			System.out.println(mistake.toString());
			throw new Error("ocurrio un problema");
		}

	}

	/**
	 * este metodo se usa para crear un vehiculo
	 * 
	 * @return retorna una instancia de vehiculo con los datos cargados
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 */
	public ObjectVehicle createNewVehicle() {
		return new ObjectVehicle(typeOfVehicle, numberOfPassengers, thereArePassagers, numberOfWheels, dateOfRegistraton,
				typeOfRoad, color);
	}

	/**
	 * este metodo sirve para imprimir por consola un vehiculo
	 * 
	 * @param vehicle Vehicle este parametro es el vehiculo a imprimir
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 * 
	 */
	private static void printVehicle(Vehicle vehicle) {
		System.out.println("El Vehiculo Es: " + vehicle.getTypeOfVehicle() + ", El Numero De Pasajeros Es: "
				+ vehicle.getNumberOfPassengers() + ", Lleva Pasajeros: " + vehicle.isThereArePassagers()
				+ ", El Numero De Ruedas Es: " + vehicle.getNumberOfWheels()
				+ ", La Fecha De Matricula Del Vehiculo Es: " + vehicle.getDateOfRegistraton().getTime()
				+ ", El Tipo De Via En La Que Se Desplaza Es: " + vehicle.getTypeOfRoad() + ", El Color Es: "
				+ vehicle.getColor() + ".");
	}
	
	/**
	 * Este Metodo Es para poder imprimir los vehiculos de una lista por consola 
	 * 
	 * @param vehicles List<ObjectVehicle> es la lista de vehiculos a imprimir por consola 
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 * 
	 */
	public static void printListOfVehicles(List<Vehicle> vehicles) {
		for (int i = 0; i < vehicles.size(); i++) {
			printVehicle(vehicles.get(i));
		}
	}
}
