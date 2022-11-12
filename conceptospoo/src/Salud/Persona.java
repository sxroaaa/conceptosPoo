package Salud;
import java.util.Scanner;
public class Persona {
        Scanner leer=new Scanner(System.in);
        String tipodoc, documento, nombre, apellido, sexo;
        int peso, estatura, edad, pesoActual=0;
        String resultado;

        public void pedirDatos(){
            System.out.println("ingrese su tipo de documento");
            tipodoc=leer.nextLine();

            System.out.println("ingrese el numero de documento");
            documento=leer.nextLine();

            System.out.println("ingrese su nombre");
            nombre=leer.nextLine();

            System.out.println("ingrese su apellido");
            apellido=leer.nextLine();

            System.out.println("ingrese su sexo ");
            sexo=leer.nextLine();

            System.out.println("ingrese su peso");
            peso=leer.nextInt();

            System.out.println("ingrese su estatura en cm");
            estatura=leer.nextInt();

            System.out.println("ingrese su edad");
            edad=leer.nextInt();
        }

        public void mostrarPersona(){
            System.out.println("el nombre de la persona es " +nombre+ "y el apellido" +apellido+ "con el documento " +tipodoc+ "y numero" +documento+ "su sexo es " +sexo+ " con un peso de " +peso+ "y una estatura de " +estatura+ " con la edad de " +edad);
        }

        public String calcularlmc(){
            pesoActual= (int) (peso /(Math.pow(estatura, 2)));

            if (pesoActual<20){
                resultado= "peso bajo";
               
            }
            
            else if(pesoActual >=20 || pesoActual <=25){
                resultado="peso ideal";
        }

            else if(pesoActual>25){
                resultado= "Sobrepeso";
            }
       return resultado;
    }
}
