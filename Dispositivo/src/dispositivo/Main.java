package dispositivo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author minjinmin
 */
public class Main {
    public static void main(String[] args) {
        Taller taller = new Taller();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Registrar un cliente y su dispositivo.");
            System.out.println("2. Registrar una observación en un dispositivo.");
            System.out.println("3. Devolver un dispositivo.");
            System.out.println("4. Salir");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                if (opcion == 4) {
                    System.out.println("Saliendo del programa.");
                    break;
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el RUT del cliente:");
                        int rut = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Ingrese la falla del dispositivo:");
                        String falla = scanner.nextLine();
                        Dispositivo dispositivo = new Dispositivo(falla);
                        Cliente cliente = new Cliente(rut, dispositivo);
                        taller.agregar(cliente);
                        break;
                    case 2:
                        System.out.println("Ingrese el RUT del cliente:");
                        int rutObservacion = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Ingrese la observación:");
                        String observacion = scanner.nextLine();
                        taller.registrarObservacion(rutObservacion, observacion);
                        break;
                    case 3:
                        System.out.println("Ingrese el RUT del cliente a devolver:");
                        int rutDevolucion = scanner.nextInt();
                        taller.devolver(rutDevolucion);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine(); 
            }
        }
        scanner.close();
    }
}