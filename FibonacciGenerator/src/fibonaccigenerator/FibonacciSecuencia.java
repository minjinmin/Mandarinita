package fibonaccigenerator;
import java.math.BigInteger;

/**
 *
 * @author minjinmin
 */

class FibonacciSecuencia {
    public BigInteger calcularFibonacci(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        } else {
            return calcularFibonacciRecursivo(n);
        }
    }
    
    private BigInteger calcularFibonacciRecursivo(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        
        return calcularFibonacciRecursivo(n - 1).add(calcularFibonacciRecursivo(n - 2));
    }
}
