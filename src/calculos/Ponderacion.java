package calculos;

import java.util.ArrayList;

public class Ponderacion {

    private ArrayList<Integer> notas;
    private ArrayList<Integer> ponderaciones;

    public Ponderacion() {
        System.out.println("Instanciamos un nuevo objeto de la clase Ponderación");
        notas = new ArrayList<>();
        ponderaciones = new ArrayList<>();
    }

    public void agregarNotaPonderada(int nota, int ponderacion) {
        System.out.println("Agregando la nota: " + nota + ", que vale " + ponderacion + "% al listado");
        this.notas.add(nota);
        this.ponderaciones.add(ponderacion);
    }

    public Integer obtenerSumaPonderacion() {
        int sumaPonderaciones = 0;
        for (Integer ponderaciones : this.ponderaciones) {
            sumaPonderaciones += ponderaciones;
        }
        return sumaPonderaciones;
    }

    public Integer calcularPonderacion() {
        int sumaNotasPonderadas = 0;
        for(int i = 0; i < this.ponderaciones.size(); i++) {
            int calculo = (this.ponderaciones.get(i) * this.notas.get(i)) / 100;
            sumaNotasPonderadas += calculo;
        }
        return sumaNotasPonderadas;
    }
}