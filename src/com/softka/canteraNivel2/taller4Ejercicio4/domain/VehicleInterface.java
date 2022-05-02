package com.softka.canteraNivel2.taller4Ejercicio4.domain;
/**
 * Esta es La interfaz que va a implementar los metodos de movimiento de los vehiculos
 * 
 * 
 * @version 1.01.000 2022-04-22
 * 
 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
 *
 * @since 1.01.000 2022-04-22
 */
public interface VehicleInterface {
	/**
	 * Este metodo permite al vehiculo andar o ponerse en marcha.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.01.000 2022-04-22
	 */
	public abstract void run();
	/**
	 * Este metodo permite al vehiculo girar ala izquierda.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.01.000 2022-04-22
	 */
	public abstract void turnLeft();
	/**
	 * Este metodo permite al vehiculo girar ala derecha.
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.01.000 2022-04-22
	 */
	public abstract void tunrRight();
	/**
	 * Este metodo permite al vehiculo ponerce marcha atras .
	 * 
	 * @author Brahian Stiven Osorio Velasquez brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.01.000 2022-04-22
	 */
	public abstract void reverse();

}
