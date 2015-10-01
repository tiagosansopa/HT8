package hoja8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main 
{

  public static void main (String[] args) throws FileNotFoundException, IOException 
  {
      PriorityQueue<Paciente> PacientesQueue = new PriorityQueue<Paciente>(new Comparator<Paciente>() 
      {
        public int compare(Paciente paciente1, Paciente paciente2) 
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
       });
      
      
      Scanner teclado = new Scanner (System.in);
      String cadena;
      FileReader f = new FileReader("pacientes.txt");
      BufferedReader b = new BufferedReader(f);
      
      while((cadena = b.readLine()) != null) 
      {
          String [] Datos = cadena.split(",");
          
          String Nombre = Datos[0];
          String Enfermedad = Datos[1];
          String Prioridad = Datos[2];
          char codigo = Prioridad.charAt(0);
          
          Paciente enfermo = new Paciente(Nombre, Enfermedad, codigo);
      
          PacientesQueue.add(enfermo);
      }
      b.close();
      
    System.out.println("Ordenado segun prioridad de enfermedad");
    
    while(true) 
    {
        Paciente currentPatient = PacientesQueue.poll();
        if(currentPatient == null) 
        {
            break;
        }
        System.out.println("El paciente " + currentPatient.getNombre() + " con la enfermedad " + currentPatient.getEnfermedad() + " tiene prioridad " + currentPatient.getPrioridad());
    }
  }
}