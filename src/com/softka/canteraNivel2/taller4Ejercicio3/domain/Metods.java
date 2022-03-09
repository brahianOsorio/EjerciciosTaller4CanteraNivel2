package com.softka.canteraNivel2.taller4Ejercicio3.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta Clase contiene los metodos que se usaran en el negocio del ejercicio3
 * 
 * Metods.genrateNumber();
 * 
 * @version 1.00.000 2022-03-08
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-03-08
 *
 */
public class Metods {
	/**
	 * este metodo prmite generar una lista de numeros Aleatorios
	 * 
	 * @return List<Double> es la lista que contene un conjunto de numeros
	 *         aleatorios desordenados
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 */
	public static List<Double> generateNumbers(int size) {
		List<Double> numbers = new ArrayList<Double>();

		for (int i = 0; i < size; i++) {
			/**
			 * generamos un numero aleatorio Para proporcionarle el signo al numero
			 */
			double option = Math.random();
			if (option < 0.5) {
				/**
				 * generamos un numero Aleatorio
				 */
				numbers.add((Math.random() * (500 + 1)));

			} else {
				/**
				 * generar un numero alatorio negativo
				 */
				numbers.add(((Math.random() * (500 + 1))) * -1);

			}

		}

		return numbers;
	}

	/**
	 * este es el metodo QuickSort para ordenar un lista, toma una lista desordenada
	 * y la ordena de manera creciente, de menor a mayor
	 * 
	 * @param numbers    este parametro es la lista que se quiere ordenar.
	 * 
	 * @param lowerLimit este parametro es el limite inferior de la lista para este
	 *                   caso normalmente es cero
	 * @param upperLimit este parametro es el limite superior de la lista para este
	 *                   caso normalmente es el tamaño de la lista menos 1
	 *                   numbers.size
	 * @return List<Double> la lista ya ordenada
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 * 
	 */
	public static List<Double> quickSort(List<Double> numbers, int lowerLimit, int upperLimit) {
		/**
		 * Este metodo recibe un arreglo de numero, y dos enteros que referencian el
		 * primer valor Y el ultimo
		 */

		// Se toma como pivote el primer valor

		double pivot = numbers.get(lowerLimit);

		// Se definen los dos lados y un auxiliar

		int operatorI = lowerLimit;
		int operatorJ = upperLimit;
		double auxToTheMovements;

		while (operatorI < operatorJ) {
			while (numbers.get(operatorI) <= pivot && operatorI < operatorJ)
				operatorI++;

			while (numbers.get(operatorJ) > pivot)
				operatorJ--;

			if (operatorI < operatorJ) {
				auxToTheMovements = numbers.get(operatorI);
				numbers.set(operatorI, numbers.get(operatorJ));
				numbers.set(operatorJ, auxToTheMovements);
			}
		}

		numbers.set(lowerLimit, numbers.get(operatorJ));
		numbers.set(operatorJ, pivot);

		if (lowerLimit < operatorJ) {
			quickSort(numbers, lowerLimit, operatorJ);
		}
		if (operatorI < upperLimit) {
			quickSort(numbers, operatorI, upperLimit);

		}

		return numbers;
	}

	/**
	 * este metodo permite mostrar por consola una lista
	 * 
	 * @param numbers    lista de elementos a mostrar
	 * @param ziseOfList el tamaño de la lista
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 *
	 */
	public static void printAList(List<Double> numbers, int ziseOfList) {
		for (int i = 0; i < ziseOfList; i++) {
			System.out.println(numbers.get(i));
		}
	}

	/**
	 * este es el metodo bubbleSort para ordenar un lista, toma una lista
	 * desordenada y la ordena de manera creciente, de menor a mayor
	 * 
	 * @param numbers este parametro es la lista que se quiere ordenar.
	 * @return List<Double> la lista ya ordenada
	 * 
	 * @author Brahian Stive Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-08
	 */
	public static List<Double> bubbleSort(List<Double> numbers) {
		double auxToTheMovements;
		for (int i = 0; i < numbers.size() - 1; i++) {

			for (int j = 0; j < numbers.size() - 1; j++) {

				if (numbers.get(j) > numbers.get(j + 1)) {
					auxToTheMovements = numbers.get(j);
					numbers.set(j, numbers.get(j + 1));
					numbers.set(j + 1, auxToTheMovements);
				}

			}

		}

		return numbers;
	}
}
