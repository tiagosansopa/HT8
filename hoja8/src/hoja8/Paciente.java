
package hoja8;

public class Paciente
{
     String Nombre;
     String Enfermedad;
     char Prioridad;
     Boolean esEmergencia;
     
     public Paciente(String Nombre, String Enfermedad, char Prioridad ) 
     {
         this.Nombre = Nombre;
         this.Enfermedad = Enfermedad;
         this.Prioridad = Prioridad;
     }
     
     void setNombre (String Nombre)
     {
        this.Nombre = Nombre;
     }
     void setEnfermedad (String Enfermedad)
     {     
        this.Enfermedad = Enfermedad;
     }
     void setPrioridad (char Prioridad)
     {
        this.Prioridad = Prioridad;
     }
     char getPrioridad ()
     {
        return Prioridad;
     }
     String getNombre ()
     {
        return Nombre;
     }
     String getEnfermedad ()
     {
        return Enfermedad;
     }
     
     @Override
     public String toString()
     {  
        return "El paciente " + Nombre + " con la enfermedad " + Enfermedad + " tiene prioridad " + Prioridad;
     }
     
}
