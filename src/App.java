import herramientas.VocalesNoVocales;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese caracteres (letras, símbolos, números).");
        System.out.println("Cuando no quiera seguir, ingrese lo siguiente: 'adiosin'");

        VocalesNoVocales vnv = new VocalesNoVocales();
        while (true) {
            System.out.print("Ingrese un caracter: ");
            /* toLowerCase() es un métod0 perteneciente a la clase String que convierte todas las letras de un
            *  String a minúsculas. EJ: HOLA => hola. A => a */
            String caracter = sc.nextLine().toLowerCase();
            /* No podemos comparar "objetos" con variables. En el caso de los String, tenemos que comparar con
            *  String.equals(valor). */
            if (caracter.equals("adiosin")) {
                break;
            } else {
                vnv.agregarCaracter(caracter);
            }
        }

        System.out.println("Contamos " + vnv.obtenerContadorVocales() + " vocales");
        System.out.println("Contamos " + vnv.obtenerContadorNoVocales() + " de otros caracteres");
    }
}
