package com.softka.canteraNivel2.taller4Ejercicio5.App;

import java.util.ArrayList;
import java.util.List;

import com.softka.canteraNivel2.taller4Ejercicio4.App.MenuCreateVehicle;
import com.softka.canteraNivel2.taller4Ejercicio4.domain.ObjectVehicle;
import com.softka.canteraNivel2.taller4Ejercicio4.domain.Vehicle;
import com.softka.canteraNivel2.taller4Ejercicio5.domain.Bicycle;
import com.softka.canteraNivel2.taller4Ejercicio5.domain.Boat;
/**
 * Esta clase es la que va a correr el programa
 * 
 * @version 1.01.000 2022-04-08
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 * 
 * @since 1.01.000 2022-04-28
 */
public class App {

	public static void main(String[] args) {
		/**
		 * esta variable va a contener la lista de vehiculos creados
		 */
		List<Vehicle> ListOfVehicles = new ArrayList<Vehicle>();

		try {
			MenuOfVehicle newMenuOfVehicle = new MenuOfVehicle();
			Vehicle newVehicle;
			/**
			 * se creo un ciclo para crear los 10 vehiculos
			 */
			for (int i = 0; i < 2 /* 10 */ ; i++) {
				/*
				 * se cargan los datos del vehiculo
				 */
				newMenuOfVehicle.start();
				/*
				 * se obtiene un vehiculo nuevo
				 */
				newVehicle = newMenuOfVehicle.newVehicle();
				/**
				 * se valida que no se tenga un error
				 */
				if (newVehicle.equals(null)) {
					i--;
					System.out.println("Ocurrio Un Error Vuelva a ingresar el vehiculo ");
				} else {
					/**
					 * se guarda el vehiculo creado
					 */
					ListOfVehicles.add(newVehicle);
				}
			}
			/**
			 * se imprimen los vehiclulos ya creados
			 */
			MenuCreateVehicle.printListOfVehicles(ListOfVehicles);

		} catch (Exception mistake) {

			System.out.println(mistake.toString());

		}
	}

}
