package com.softka.canteraNivel2.taller4Ejercicio3.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.softka.canteraNivel2.taller4Ejercicio3.domain.Metods;

/**
 * Esta clase es la que va a correr el programa
 * 
 * @version 1.00.000 2022-03-08
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-03-08
 */
public class App {

	public static void main(String[] args) {
		/**
		 * esta variable contiene el lector por consola
		 */
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println(" Bienvenido Ingrese numero de datos que desea ");
			int var = Integer.parseInt(read.readLine());// leemos datos

			List<Double> numbers = Metods.generateNumbers(var);// cargamos la lista de numeros aleatorios
			System.out.println("Esta es la lista: ");
			Metods.printAList(numbers, numbers.size());

			System.out.println("1-> Metodo de Ordenamiento quickSort ");
			System.out.println("2-> Metodo de Ordenamiento bubbleSort ");
			var = Integer.parseInt(read.readLine());// leemos la opcion que quiere el usuario

			if (var == 1) { // se opera segun el gusto del usuario
				System.out.println("Metodo de ordenamiento quickSort ");
				numbers = Metods.quickSort(numbers, 0, numbers.size() - 1);
				Metods.printAList(numbers, numbers.size());

			} else if (var == 2) {// se opera segun el gusto del usuario
				System.out.println("Metodo de ordenamiento bubbleSort ");
				numbers = Metods.bubbleSort(numbers);
				Metods.printAList(numbers, numbers.size());

			} else {
				throw new Error("Ops Ocurrio Un Error ");
			}

		} catch (Exception mistake) {
			System.out.println(mistake.toString());
			System.out.println("ocurrio un error");
		}

	}

}
