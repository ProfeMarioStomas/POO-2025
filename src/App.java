import java.util.ArrayList;
import java.util.Scanner;

import calculos.ContadorParesImpares;
import calculos.Ponderacion;
import calculos.Promedio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Ingrese 1 para calcular promedio, 2 para calcular ponderaciones, 3 para contar pares e impares: ");

        Scanner sc = new Scanner(System.in);
        try {
            int opcion = sc.nextInt();

            if (opcion == 1) {
                Promedio p1 = new Promedio();

                System.out.println("-----------------------------------");
                System.out.println("Ingrese las notas. Ejemplo: 60, 45.");
                System.out.println("Para terminar, ingrese -1");
                System.out.println("-------------------------");

                int nota = 0;
                while (true) {
                    System.out.println("-- Actualmente tenemos: " + p1.obtenerCantidadDeNotas() + " notas ingresadas.");
                    System.out.print("Ingrese nota: ");
                    nota = sc.nextInt();
                    if (nota == -1) {
                        System.out.println("Calculando promedio de notas en base a las " + p1.obtenerCantidadDeNotas() + " notas ingresadas ...");
                        System.out.println("El promedio de notas es: " + p1.calcularPromedio());
                        break;
                    } else if (nota < 10) {
                        System.out.println("La nota ingresada es menor a 10. No fue ingresada");
                    } else {
                        p1.agregarNota(nota);
                    }
                }
            }
            else if(opcion == 2) {
                Ponderacion p2 = new Ponderacion();

                while(p2.obtenerSumaPonderacion() < 100) {
                    System.out.print("Ingrese la nota: ");
                    int nota = sc.nextInt();

                    System.out.print("Ingrese ponderación: ");
                    int ponderacion = sc.nextInt();

                    if (p2.obtenerSumaPonderacion() + ponderacion <= 100) {
                        p2.agregarNotaPonderada(nota, ponderacion);
                    } else {
                        System.out.print("La suma sobrepasó el 100%. No se ingresó la nota.");
                        System.out.println(p2.obtenerSumaPonderacion() + ponderacion + "%");
                    }

                    System.out.println("Llevamos acumulado un "
                            + p2.obtenerSumaPonderacion() + "%");
                }

                System.out.println("La nota final es de: " + p2.calcularPonderacion());

            }
            else if (opcion == 3) {
                ContadorParesImpares cpi = new ContadorParesImpares();

                int numero = 0;
                while (numero != -1) {
                    System.out.print("Ingrese un nº (-1 para terminar)" +
                            ": ");
                    numero = sc.nextInt();
                    cpi.agregarNumero(numero);
                }
                ArrayList<Integer> procesados = cpi.procesarDatos();
                int pares = procesados.get(0);
                int impares = procesados.get(1);

                System.out.println("La cantidad de nº pares fue de: " + pares + ".");
                System.out.println("La cantidad de nº impares fue de: " + impares + ".");
            }
            else {
                System.out.println("Opción no válida. La aplicación se cerrará");
            }
        } catch (Exception ex) {
            System.out.println("Se ha ingresado un valor no válido. La aplicación se cerrará");
        } finally {
            sc.close();
        }
    }
}
