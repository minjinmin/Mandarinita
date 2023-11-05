package fibonaccigenerator;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author minjinmin
 */
public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de terminos de la secuencia Fibonacci a generar: ");
        int n = scanner.nextInt();

        FibonacciSecuencia secuencia = new FibonacciSecuencia();
        for (int i = 0; i < n; i++) {
            BigInteger fibonacciTerm = secuencia.calcularFibonacci(i);
            System.out.println("Termino " + i + ": " + fibonacciTerm);
        }
    }
}