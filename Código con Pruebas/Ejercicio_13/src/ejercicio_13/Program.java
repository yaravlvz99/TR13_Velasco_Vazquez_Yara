/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_13;

/**
 *
 * @author dam1d13
 */
public class Program 
{
    //  Metodo por el cual comenzara a ejecutarse el programa
    public static void main(String[] args)
    {
        int termino;
        Sucesiones objfibo= new Sucesiones();
        System.out.print("Introduzca un valor: ");
        termino = Teclado.entero();
        objfibo.Fibonacci(termino);
        
    }
}
