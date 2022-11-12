package Salud;

public class Inicio {
    public static void main(String[] args) {
        Persona datos=new Persona();
        datos.pedirDatos();
        datos.calcularlmc();

        String resultado=datos.calcularlmc();
        if(resultado.equals("peso bajo")){
            System.out.println("ir al medico para que te recomiende uan dieta adecuada");
        }

        else if(resultado.equals("peso ideal")){
            System.out.println("sigue cuidandote");
        }

        else if(resultado.equals("sobrepeso")){
            System.out.println("no comer alimentos altos en grasa");
        }
    }
}