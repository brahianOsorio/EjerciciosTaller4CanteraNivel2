package com.softka.canteraNivel2.taller4Ejercicio5.App;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.softka.canteraNivel2.taller4Ejercicio4.domain.ObjectVehicle;
import com.softka.canteraNivel2.taller4Ejercicio4.domain.Vehicle;
import com.softka.canteraNivel2.taller4Ejercicio5.domain.Bicycle;
import com.softka.canteraNivel2.taller4Ejercicio5.domain.Boat;
import com.softka.canteraNivel2.taller4Ejercicio5.domain.Car;
import com.softka.canteraNivel2.taller4Ejercicio5.domain.Motorcycle;
import com.softka.canteraNivel2.taller4Ejercicio5.domain.Truck;
import com.softka.canteraNivel2.taller4Ejercicios.Util.ValidatorMenu;
/**
 * Esta clse es la que nos va a permitir mostrar el menu necesario para crear un
 * vehicle
 * 
 * MenuOfVehicle newMenuVehicle = new MenuOfVehicle();
 * newMenuVehicle.start(); Vehicle newVehicle = newMenuVehicle.newVehicle();
 * 
 * @version 1.00.001 2022-04-28
 * 
 * @author Brahian Stiven Osorio Velasquez brahainstiven.osorio@gmail.com
 *
 * @since 1.01.000 2022-04-28
 *
 */
public class MenuOfVehicle {
		
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
		 * @since 1.01.000 2022-04-28
		 */
		public void start() {
			try {

				System.out.println(" Bienvenido ");
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
		
		public Vehicle newVehicle(){
			if (numberOfPassengers==1) {
				//bicy
				return new Bicycle(numberOfPassengers, thereArePassagers, numberOfWheels, dateOfRegistraton, typeOfRoad, color);
			}else if (numberOfWheels==0) {
				//bote
				return new Boat(numberOfPassengers, thereArePassagers, numberOfWheels, dateOfRegistraton, typeOfRoad, color);
						
			}else if (numberOfPassengers==5) {
				//carro
				return new Car(numberOfPassengers, thereArePassagers, numberOfWheels, dateOfRegistraton, typeOfRoad, color);
			}else if (numberOfWheels==2) {
				//moto
				return new Motorcycle(numberOfPassengers, thereArePassagers, numberOfWheels, dateOfRegistraton, typeOfRoad, color);
			}else if (numberOfWheels > 4) {
				//camion
				return new Truck(numberOfPassengers, thereArePassagers, numberOfWheels, dateOfRegistraton, typeOfRoad, color);
			}else {
				//default
				return new ObjectVehicle("Vehiculo Desconocido ", numberOfPassengers, thereArePassagers, numberOfWheels, dateOfRegistraton, typeOfRoad, color);
			}
		}
}
