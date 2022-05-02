package com.softka.canteraNivel2.taller4Ejercicios.Util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Esta clase Proporciona herramientas que usan las diferentes clases para leer
 * y validar los datos ingresados
 * 
 * ValidatorMenu.getText("Ingrese un texto aqui");
 * 
 * @version 1.00.001 2022-04-08
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.001 2022-04-08
 */

public class ValidatorMenu {
	/**
	 * reader representa a la variable que va a leer los datos de la consola.
	 */
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Este metodo lee por teclado y valida que la entrada sea texto con posibilidad
	 * de numeros
	 * 
	 * @param title String es el dato que va a decirle al usuario que va a ingresar
	 * 
	 * @return retorna un texto el cual no es vacio, no contiene caracteses
	 *         especiales y puede tener numeros
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.001 2022-04-08
	 */
	public static String getText(String title) {
		String text = "";
		try {
			while (text.equals("")) {
				System.out.println(title);
				text = reader.readLine().trim();
				if (!text.matches("[A-Za-z][A-Za-z\\s]+")) {
					text = "";
				}
			}

		} catch (Exception mistake) {
			System.err.println(mistake.getMessage());

		}

		return text;
	}

	/**
	 * Este metodo lee por teclado y valida que la entrada sea numerica numeros
	 * enteros o decimales
	 * 
	 * @param title String es el dato que va a decirle al usuario que va a ingresar
	 * 
	 * @return retorna un numero decimal leido por teclado
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.001 2022-04-08
	 */
	public static double getNumber(String title) {
		String text = "";
		double number = 0;
		try {
			while (text.equals("")) {
				System.out.println(title);
				text = reader.readLine().trim();
				if (!text.matches("([+-]?[0-9]+(?:\\.[0-9]*)?)")) {
					text = "";
				}
			}
			number = Double.parseDouble(text);

		} catch (Exception mistake) {
			System.err.println(mistake.getMessage());

		}

		return number;
	}

	/**
	 * Este metodo lee por teclado y valida que la entrada sea numerica numeros
	 * que concuerden con la forma del año
	 * 
	 * @param title String es el dato que va a decirle al usuario que va a ingresar
	 * 
	 * @return retorna un numero entero leido por teclado
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.001 2022-04-08
	 */
	public static int getNumberToYear(String title) {
		String text = "";
		int number = 0;
		try {
			while (text.equals("")) {
				System.out.println(title);
				text = reader.readLine().trim();
				if (!text.matches("([+]?[0-9]+[0-9]+[0-9]+[0-9])")) {
					text = "";
				}
			}
			number = Integer.parseInt(text);

		} catch (Exception mistake) {
			System.err.println(mistake.getMessage());

		}

		return number;
	}
	
	/**
	 * Este metodo lee por teclado y valida que la entrada sea numerica numeros
	 * que concuerden con la forma del mes
	 * 
	 * @param title String es el dato que va a decirle al usuario que va a ingresar
	 * 
	 * @return retorna un numero entero leido por teclado
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.001 2022-04-08
	 */
	public static int getNumberToMonth(String title) {
		String text = "";
		int number = 0;
		try {
			while (text.equals("")) {
				System.out.println(title);
				text = reader.readLine().trim();
				if (!text.matches("([0][0-9]|[0-9]|[1][0-2])")) {
					text = "";
				}
			}
			number = Integer.parseInt(text);

		} catch (Exception mistake) {
			System.err.println(mistake.getMessage());

		}

		return number;
	}
	/**
	 * Este metodo lee por teclado y valida que la entrada sea numerica numeros
	 * que concuerden con la forma del Dia
	 * 
	 * @param title String es el dato que va a decirle al usuario que va a ingresar
	 * 
	 * @return retorna un numero entero leido por teclado
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.001 2022-04-08
	 */
	public static int getNumberToDay(String title) {
		String text = "";
		int number = 0;
		try {
			while (text.equals("")) {
				System.out.println(title);
				text = reader.readLine().trim();
				if (!text.matches("[0][0-9]|[0-9]|[1-2][0-9]|[3][0-1]")) {
					text = "";
				}
			}
			number = Integer.parseInt(text);

		} catch (Exception mistake) {
			System.err.println(mistake.getMessage());

		}

		return number;
	}
	
	public static int getNumberToTwoOptions(String title) {
		String text = "";
		int number = 0;
		try {
			while (text.equals("")) {
				System.out.println(title);
				text = reader.readLine().trim();
				if (!text.matches("([+]?[1-2])")) {
					text = "";
				}
			}
			number = Integer.parseInt(text);

		} catch (Exception mistake) {
			System.err.println(mistake.getMessage());

		}

		return number;
	}

}
