/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13;

/**
 * Objetivo: Calcular una secuencia de fibonacci dada una posicion
 * @version Sucesiones 1.0
 * @author Yara Velasco Vazquez
 * @since 17/04/2022
 */

/**
 * Creamos la clase Sucesiones
 */
    public class Sucesiones
    {
        //  Metodo que mostrara en pantalla los "n" terminos
    	/**
    	 * Metodo que mostrara la sucesion de Fibonacci en base al numero de iteraciones dado
    	 * @param posicion dada del usuario
    	 */
        public void Fibonacci (int posicion)
        {
        	/**
        	 * Definimos las variables
        	 */
            int Operando1, Operando2, acumulador;
            /**
             * Les asignamos un valor inicial
             */
            Operando1= 0;
            Operando2= 1;
            acumulador= 0;
            
            /**
             * Evaluacion de si la posicion dada es mayor a 0
             */
            if (posicion>0)
            {
            	/**
            	 * Si la posicion es 1, muestra el valor del primer operando
            	 */
                if (posicion==1) System.out.print(Operando1);
                /**
            	 * Si la posicion es 2, muestra el valor del primer operando junto al del segundo operando
            	 */
                if (posicion==2) System.out.print(Operando1 + "," + Operando2);
                /**
                 * Evaluacion de si la posicion dada es distinta a 1 y 2
                 */
                if ((posicion!=1)&(posicion!=2))
                {
                	/**
                	 * Mostraremos por pantalla a los dos primeros operandos separados por una coma
                	 */
                    System.out.print(Operando1 + "," + Operando2);
                }
                
                /**
                 * Bucle while para si la posicion es mayor a 2
                 */
                while(posicion>2)
                {
                	/**
                	 * Asignamos que el acumulador sea la suma entre Operando1 y Operando2
                	 */
                    acumulador = Operando1 + Operando2;
                    /**
                     * Mosraremos separado por una coma, al acumulador despues del Operando1 y Operando2
                     */
                    System.out.print("," + acumulador);
                    /**
                     * Asignamos a Operando1 el valor de Operando2
                     */
                    Operando1= Operando2;
                    /**
                     * Asignamos a Operando2 el valor de acumulador
                     */
                    Operando2= acumulador;
                    /**
                     * Restamos 1 a la posicion y volvemos al bucle
                     */
                    posicion= posicion - 1;
                }
            }
        }
    }
