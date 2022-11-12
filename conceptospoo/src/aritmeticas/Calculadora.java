package aritmeticas;
import java.util.Scanner;

public class Calculadora {
    //metodos
    int num1, num2, suma, resta, NumeroMayor, numMenor;
    Scanner leer=new Scanner(System.in);
    
   
    //1.metodo sin valor de retorno que sume los dos numeros
    public void suma (int num1,int num2){
        int suma= num1 + num2;
        System.out.println("la suma de los dos numeros es " +suma);
    }


    //2. metodo con valor de retorno que reste los dos numeros
    public int restar(int num1,int num2) {
        int resta=num1-num2;
        System.out.println("la resta de los dos numeros es " +resta);
        return resta;
        }

    

    //3. metodo con valor de retorno que devuelva cual es el numero mayor
    public int numeroMayor(int num1, int num2){
        if(num1>num2){
            System.out.println("el numero mayor es: " +num1);
           NumeroMayor=num1;
        }

        else if(num2>num1){
            System.out.println("el numero mayor es " +num2);
            NumeroMayor=2;
        }
        return NumeroMayor;

    }
    //4. metodo sin valor de retorno que devuelva cual es el numero menor
    public void NumeroMenor(int num1, int num2){
        if(num1<num2){
            System.out.println("el numero menor es: " +num1);
           numMenor=num1;
        }

        else if(num2<num1){
            System.out.println("el numero menor es " +num2);
            numMenor=num2;
        }
        
    }
    //5. metodo con valor de retorno que eleve cada numero al exponente que sea indicado por el usuario

}



