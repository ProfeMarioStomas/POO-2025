package calculos;

import java.util.ArrayList;

public class Promedio {

    private ArrayList<Integer>notas;

    public Promedio() {
        System.out.println("Instanciamos un nuevo objeto de la clase Promedio");
        notas = new ArrayList<>();
    }

    public void agregarNota(int nota) {
        System.out.println("Agregando la nota: " + nota + " al listado");
        this.notas.add(nota);
    }

    public Integer obtenerCantidadDeNotas() {
        return this.notas.size();
    }

    public Integer calcularPromedio() {
        Integer sumaDeNotas = 0;
        for (int i = 0; i < this.notas.size(); i++) {
            sumaDeNotas += this.notas.get(i);
        }
        return sumaDeNotas / this.notas.size();
    }
}
