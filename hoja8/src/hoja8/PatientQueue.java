/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja8;

import java.util.Comparator;
import java.util.PriorityQueue;


public class PatientQueue<E extends Comparable<E>> extends PriorityQueue<E>
{
    PriorityQueue cola;
	
    public PatientQueue()
    {
        cola = new PriorityQueue();
    }
    
    public void agregar(Paciente paciente)
    {
        cola.add(paciente);
    }
    
     public int compareTo(Paciente paciente1, Paciente paciente2) 
    {           
        int valor;
        char letra1 = paciente1.getPrioridad();
        char letra2 = paciente2.getPrioridad();

        if (letra1>letra2)
        {
            valor = 1;
        }
        else if (letra1<letra2)
        {	
            valor = -1;
        }
        else
        {
            valor = 0;
        }
        return valor; 
    }
}