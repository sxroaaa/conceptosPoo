package SENA;
import java.util.Scanner;
public class Prueba2 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        Aprendiz salome=new Aprendiz();

        System.out.println("ingrese su nombre completo");
        salome.nombre=leer.nextLine();

        System.out.println("ingrese su numero de ficha: ");
        salome.numficha=leer.nextLine();

        System.out.println("ingrese el numero de su cedula: ");
        salome.cedula=leer.nextLine();

        System.out.println("escriba el programa en el que esta estudiando");
        salome.programa=leer.nextLine();

        leer.nextInt();

        System.out.println("ingrese su edad");
        salome.edad=leer.nextInt();

        System.out.println("el nombre del estudiante es " +salome.nombre+ " identificada con la cedula " +salome.cedula+ " y su edad es de " +salome.edad+ " estudia en el programa " +salome.programa+  " en la ficha " +salome.numficha );
        leer.close();
    }
}
