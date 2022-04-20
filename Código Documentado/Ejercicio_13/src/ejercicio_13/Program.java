/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_13;

/**
 * @version Program 1.0
 * @author Yara Velasco Vazquez
 * @since 17/04/2022
 */
/**
 * Creamos la clase Program
 */
public class Program 
{
	/**
	 * Metodo vacio para mostrar datos por pantalla
	 * @param args instrucciones del metodo estatico void del programa
	 */
    //  Metodo por el cual comenzara a ejecutarse el programa
    public static void main(String[] args)
    {
    	/**
    	 * Declaramos la variable termino
    	 */
        int termino;
        /**
         * Creamos el objeto de la clase Sucesiones
         */
        Sucesiones objfibo= new Sucesiones();
        /**
         * Pedimos al usuario que introduzca el numero de iteraciones que se van a mostrar de la sucesion
         */
        System.out.print("Introduzca un valor: ");
        /**
         * Leemos la variable
         * @see Teclado para realizar lectura de datos
         */
        termino = Teclado.entero();
        /**
         * El objeto invoca al metodo Fibonacci de la clase Sucesiones para pasarle la variable
         */
        objfibo.Fibonacci(termino);
        
    }
}

 