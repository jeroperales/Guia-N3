import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc;
        int horasTrabajadas;
        int loop = 0;
        double salario;
        String nombre;
        int horas;
        double costoProyecto;
        Scanner scanner = new Scanner(System.in);
        Empleado empleado;

        System.out.println("1- CARGAR TRABAJADOR TIEMPO COMPLETO\n" +
                "2- CARGAR TRABAJADOR POR HORA\n" +
                "3- CARGAR TRABAJADOR CONTRATISTA");
        opc = scanner.nextInt();
        switch (opc) {
            case 1:// CARGAR TRABAJADOR DE TIEMPO COMPLETO
                System.out.println("TRABAJADOR TIEMPO COMPLETO!");
                System.out.println("INGRESE NOMBRE: \n");
                scanner = new Scanner(System.in);
                nombre = scanner.nextLine();

                System.out.println("INGRESE SALARIO FIJO");
                scanner = new Scanner(System.in);
                salario = scanner.nextFloat();

                EmpleadoTiempoCompleto empleadoTC = new EmpleadoTiempoCompleto(nombre, salario);

                empleadoTC.mostrarEmpleado();
                break;

            case 2: // CARGAR TRABAJADOR POR HORA
                System.out.println("TRABAJADOR POR HORA!");
                System.out.println("INGRESE NOMBRE");
                scanner = new Scanner(System.in);
                nombre = scanner.nextLine();

                System.out.println("INGRESE PAGA POR HORA");
               scanner = new Scanner(System.in);
                salario = scanner.nextFloat();

                System.out.println("INGRESE HORAS TRABAJADAS\n");
               scanner = new Scanner(System.in);
                horas = scanner.nextInt();

                EmpleadoPorHora empleadoPH = new EmpleadoPorHora(nombre, salario, horas);

                salario = empleadoPH.calcularPago();
                empleadoPH.setSalario(salario);
                empleadoPH.mostrarEmpleado();
                break;
            case 3: //CARGAR TRABAJADOR CONTRAISTA
                System.out.println("INGRESE NOMBRE: ");
                scanner = new Scanner(System.in);
                nombre = scanner.nextLine();

                System.out.println("INGRESE HORAS TRABAJADAS");
                scanner = new Scanner(System.in);
                horas = scanner.nextInt();

                System.out.println("INGRESE PAGO POR HORA");
                scanner = new Scanner(System.in);
                salario = scanner.nextDouble();

                System.out.println("INGRESE COSTO DE PROYECTO");
                scanner = new Scanner(System.in);
                costoProyecto = scanner.nextDouble();

                EmpleadoContratista empleadoC = new EmpleadoContratista(nombre, horas, salario, costoProyecto);
                salario = empleadoC.calcularPago();

                System.out.println("SALARIO FINAL: " + salario);
                break;
            default:
                break;
        }


    }
}