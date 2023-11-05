package temperatura_v2;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dias a registrar: ");
        int numDias = scanner.nextInt();
        Clima clima = new Clima(numDias);

        for (int i = 0; i < numDias; i++) {
            Temperatura t = new Temperatura();
            System.out.println("Ingrese la maxima del dia " + (i + 1) + ":");
            t.setMaxima(leerFloat(scanner));
            System.out.println("Ingrese la minima del dia " + (i + 1) + ":");
            t.setMinima(leerFloat(scanner));
            clima.agregarTemperatura(i, t);
        }

        if (clima.hayTemperaturasSinRegistrar()) {
            System.out.println("No se pueden calcular promedios, temperatura mas alta ni temperatura mas baja " +
                    "debido a temperaturas sin registrar.");
        } else {
            System.out.println("Promedio de maximas: " + clima.verPromedioMaxima());
            System.out.println("Promedio de minimas: " + clima.verPromedioMinima());
            System.out.println("Temperatura mas alta: " + clima.verTemperaturaMaxima());
            System.out.println("Temperatura mas baja: " + clima.verTemperaturaMinima());
        }

        scanner.close();
    }

    public static float leerFloat(Scanner scanner) {
        return scanner.nextFloat();
    }
}
