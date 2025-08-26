import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Integer valorSueldoBase = 1000000;
        Integer valorBonoTrabajadorDelMes = 500000;
        Integer sueldoFinalTrabajador = valorSueldoBase;

        System.out.println("Ingrese datos del trabajador para calcular sueldo final a pagar");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese si trabajador fue o no el mejor (S/N): ");

        String fueTrabajador = sc.nextLine().toUpperCase();

        if (fueTrabajador.equals("S")) {
            sueldoFinalTrabajador += valorBonoTrabajadorDelMes;
        }

        System.out.print("Ingrese días trabajados por el trabajador: ");
        Integer diasTrabajados = sc.nextInt();

        sueldoFinalTrabajador += diasTrabajados * 5000;

        System.out.print("Ingrese cargas familiares: ");
        Integer cargasFamiliares = sc.nextInt();

        sueldoFinalTrabajador += cargasFamiliares * 100000;

        Integer montoDescuentoSalud = (int) (valorSueldoBase * 0.07);
        Integer montoDescuentoPrevision = (int) (valorSueldoBase * 0.15);

        sueldoFinalTrabajador -= montoDescuentoPrevision;
        sueldoFinalTrabajador -= montoDescuentoSalud;

        System.out.println("Sueldo final: " + sueldoFinalTrabajador);
    }
}
