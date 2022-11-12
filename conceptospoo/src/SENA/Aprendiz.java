package SENA;
import java.util.Scanner;

public class Aprendiz {
 //atributos
   Scanner leer=new Scanner(System.in);
   String nombre="salome";
   String numficha;
   int edad;
   String cedula;
   String programa;

   public void cambiarNombre(){
      System.out.println("su nombre actual es " +nombre);
      leer.nextLine();
      System.out.println("ingrese el nuevo nombre: ");
      nombre=leer.nextLine();

      System.out.println("su nombre actual es " +nombre);

      leer.close();
      
   
 }
} 

    
