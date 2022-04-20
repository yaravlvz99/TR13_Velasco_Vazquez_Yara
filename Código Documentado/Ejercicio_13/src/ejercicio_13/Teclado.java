package ejercicio_13;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Importamos todo el contenido dentro de io para la clase Teclado
 */
import java.io.*;

/**
 * Se define la clase Teclado para leer los datos
 * @version Teclado 1.0
 * @author Yara Velasco Vazquez
 * @since 17/04/2022
 */

/**
 * Se crea la clase
 */
public class Teclado
{
	/**
	 * Se inicializan las variables y los convertimos en el tipo de datos correspondiente
	 */
	static String inicializar()
	{
		/**
		 * Inicializamos en vacio la variable buzon
		 */
		String buzon ="";
		/**
		 * Creamos los obetos necesarios
		 */
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader miTeclado = new BufferedReader(flujo);
		
		/**
		 * Lee los datos
		 */
		try
		{
			buzon=miTeclado.readLine();
		}
		/**
		 * Para el caso de excepcion no ponemos nada
		 */
		catch (Exception e)
		{

		}
		/**
		 * @return buzon valor a devolver
		 */
		return buzon;
	}
	
	/**
	 * Para la variable valor la inicializamos y la pasamos a entero
	 * @return valor a devolver
	 */
	static int entero()
	{
		int valor=Integer.parseInt(inicializar());
		return valor;
	}
	
	/**
	 * Para la variable valor la inicializamos y la pasamos a float
	 * @return valor a devolver
	 */
	static float real()
	{
		float valor=Float.parseFloat(inicializar());
		return valor;
	}
	
	/**
	 * Para la variable valor la inicializamos y la pasamos a float doble
	 * @return valor a devolver
	 */
	static double realDoble()
	{
		double valor=Double.parseDouble(inicializar());
		return valor;
	}
	
	/**
	 * Para la variable valor la inicializamos y la pasamos a cadena
	 * @return valor a devolver
	 */
	static String cadena()
	{
		String valor= inicializar();
		return valor;
	}
	
	/**
	 * Para la variable valor la inicializamos y la pasamos a caracter
	 * @return valor a devolver
	 */
	static char caracter()
	{
		String valor= inicializar();
		return valor.charAt(0);
	}
}