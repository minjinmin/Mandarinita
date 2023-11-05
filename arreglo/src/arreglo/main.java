package arreglo;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Clima clima = new Clima();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            Temperatura t = new Temperatura();
            System.out.println("Ingrese la maxima del dia " + (i) + ":");
            t.setMaxima(leerFloat(scanner));
            System.out.println("Ingrese la minima del dia " + (i) + ":");
            t.setMinima(leerFloat(scanner));
            clima.agregarTemperatura(i, t);
        }

        System.out.println("Promedio de maximas: " + clima.verPromedioMaxima());
        System.out.println("Promedio de minimas: " + clima.verPromedioMinima());
        
        scanner.close();
    }

    public static float leerFloat(Scanner scanner) {
        float valor = scanner.nextFloat();
        return valor;
    }
}
