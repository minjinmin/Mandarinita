package adivinaelnumerogame;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author minjinmin
 */
public class AdivinaElNumeroGame {
    private int numeroSecreto;

    public AdivinaElNumeroGame() {
        Random rand = new Random();
        numeroSecreto = rand.nextInt(10) + 1;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int conjetura;
        do {
            System.out.print("Adivina el numero secreto (entre 1 y 10): ");
            conjetura = scanner.nextInt();
            if (conjetura == numeroSecreto) {
                System.out.println("Felicidades Has adivinado el numero secreto.");
            } else if (conjetura < numeroSecreto) {
                System.out.println("El numero secreto es mas alto.");
            } else {
                System.out.println("El numero secreto es mas bajo.");
            }
        } while (conjetura != numeroSecreto);
    }
}
