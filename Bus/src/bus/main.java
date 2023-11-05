package bus;
import java.util.Scanner;

/**
 *
 * @author minjinmin
 */

public class main  {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Bus bus = new Bus();
            int opcion;
            
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Establecer valor de pasaje");
                System.out.println("2. Agregar pasajero");
                System.out.println("3. Ver ganancia");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el valor del pasaje: ");
                        int valorPasaje = scanner.nextInt();
                        bus.setValorPasaje(valorPasaje);
                    }
                    case 2 -> {
                        System.out.print("Ingrese el numero de asiento: ");
                        int numeroAsiento = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre del pasajero: ");
                        String nombrePasajero = scanner.nextLine();
                        System.out.print("¿Tiene descuento? (true/false): ");
                        boolean tieneDescuento = scanner.nextBoolean();
                        Persona pasajero = new Persona(nombrePasajero, tieneDescuento);
                        bus.agregarPasajero(numeroAsiento, pasajero);
                    }
                    case 3 -> {
                        double ganancia = bus.verGanancia();
                        System.out.println("Ganancia total del bus: " + ganancia);
                    }
                    case 4 -> System.out.println("Saliendo del programa.");
                    default -> System.out.println("Opcion no valida. Intente de nuevo.");
                }
                
            } while (opcion != 4);
        }
    }
}