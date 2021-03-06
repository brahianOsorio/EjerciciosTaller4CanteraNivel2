package com.softka.canteraNivel2.taller4Ejercicio3.App;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.softka.canteraNivel2.taller4Ejercicio3.domain.Metods;
import com.softka.canteraNivel2.taller4Ejercicios.Util.ValidatorMenu;

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
		

		try {
			int var = (int)ValidatorMenu.getNumber(" Bienvenido Ingrese numero de datos que desea ");// leemos datos

			List<Double> numbers = Metods.generateNumbers(var);// cargamos la lista de numeros aleatorios
			System.out.println("Esta es la lista: ");
			Metods.printAList(numbers, numbers.size());

			System.out.println("");
			System.out.println("");
			var = ValidatorMenu.getNumberToTwoOptions("1-> Metodo de Ordenamiento quickSort \n2-> Metodo de Ordenamiento bubbleSort ");// leemos la opcion que quiere el usuario

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
