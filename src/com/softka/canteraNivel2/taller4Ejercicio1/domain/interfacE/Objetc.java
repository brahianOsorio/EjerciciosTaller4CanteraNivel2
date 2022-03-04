package com.softka.canteraNivel2.taller4Ejercicio1.domain.interfacE;

/**
 * esta clase busca representar un cuerpo cualquiera en un sistema planetario
 * 
 * @version 1.00.000 2022-03-01
 * 
 * @author Brahian Striven Osorio Velasquez 
 * 		   brahianstiven.osorio@gmail.com
 * 
 * @since 1.00.000 2022-03-01
 */
public abstract class Objetc {
	/**
	 * Esta variable representa el numero de identificacion del objeto
	 */
	protected int id;
	/**
	 * Esta variabre representa el nombre del objeto  
	 */
	protected String name;
	/**
	 * Esta variabre representa la masa del objeto
	 */
	protected double mass;
	/**
	 * Esta variabre representa la densidad del objeto
	 */
	protected double density;
	/**
	 * Esta variabre representa el diametro que tiene el objeto  
	 */
	protected double diameter;
	/**
	 * Esta variabre representa la distancia que hay del objeto al sol   
	 */
	protected double distanceSun;
	/**
	 * ese metodo nos permite visualizar en otra parte del codigo la variable privada id
	 * 
	 * @return el numero de identificacion 
	 * 
	 * @author Brahian Stiven Osorio Velasquez
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	public int getId() {
		return id;
	}
	/**
	 * ese metodo nos permite visualizar en otra parte del codigo la variable privada name
	 * 
	 * @return el numero de identificacion 
	 * 
	 * @author Brahian Stiven Osorio Velasquez
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	public String getName() {
		return name;
	}
	/**
	 * ese metodo nos permite visualizar en otra parte del codigo la variable privada mass
	 * 
	 * @return el numero de identificacion 
	 * 
	 * @author Brahian Stiven Osorio Velasquez
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	public double getMass() {
		return mass;
	}
	/**
	 * ese metodo nos permite visualizar en otra parte del codigo la variable privada density
	 * 
	 * @return el numero de identificacion 
	 * 
	 * @author Brahian Stiven Osorio Velasquez
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	public double getDensity() {
		return density;
	}
	/**
	 * ese metodo nos permite visualizar en otra parte del codigo la variable privada diameter
	 * 
	 * @return el numero de identificacion 
	 * 
	 * @author Brahian Stiven Osorio Velasquez
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04
	 */
	public double getDiameter() {
		return diameter;
	}
	/**
	 * ese metodo nos permite visualizar en otra parte del codigo la variable privada distanceSun
	 * 
	 * @return el numero de identificacion
	 * 
	 * @author Brahian Stiven Osorio Velasquez
	 * 		   brahianstiven.osorio@gmail.com
	 * 
	 * @since 1.00.000 2022-03-04 
	 */
	public double getDistanceSun() {
		return distanceSun;
	}

	
	
}
