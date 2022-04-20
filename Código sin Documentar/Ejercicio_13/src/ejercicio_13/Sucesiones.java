/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13;

//---------------------------------------------------------------------
//  Objetivo:   Calcular una secuencia de fibonacci dada una posicion
//  Autor:  Yara Velasco Vázquez
//  Fecha:  10/01/2022
//---------------------------------------------------------------------

    public class Sucesiones
    {
        //  Metodo que mostrara en pantalla los "n" terminos
        public void Fibonacci (int posicion)
        {
            int Operando1, Operando2, acumulador;
            Operando1= 0;
            Operando2= 1;
            acumulador= 0;
            
            if (posicion>0)
            {
                if (posicion==1) System.out.print(Operando1);
                if (posicion==2) System.out.print(Operando1 + "," + Operando2);
                if ((posicion!=1)&(posicion!=2))
                {
                    System.out.print(Operando1 + "," + Operando2);
                }
                
                while(posicion>2)
                {
                    acumulador = Operando1 + Operando2;
                    System.out.print("," + acumulador);
                    Operando1= Operando2;
                    Operando2= acumulador;
                    posicion= posicion - 1;
                }
            }
        }
    }

