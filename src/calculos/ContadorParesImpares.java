package calculos;

import java.util.ArrayList;

public class ContadorParesImpares {
    public ArrayList<Integer> numeros;

    public ContadorParesImpares() {
        System.out.println("Instanciando clase ContadorParesImpares");
        numeros = new ArrayList<>();
    }

    public void agregarNumero(int numero) {
        this.numeros.add(numero);
    }

    public ArrayList<Integer> procesarDatos() {
        int pares = 0;
        int impares = 0;
        ArrayList<Integer> paresImpares = new ArrayList<>();
        for(int numero : this.numeros) {
            if (numero % 2 == 0) {
                pares++;
            }  else {
                impares++;
            }
        }
        paresImpares.add(pares);
        paresImpares.add(impares);

        return paresImpares;
    }
}
