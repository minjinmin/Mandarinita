package Calculos;
/**
 *
 * @author minjinmin
 */
public class Calculos {
    public static int elMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    public static int elMenor(int num1, int num2, int num3) {
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        return menor;
    }
    
    public static int cantidadPares(int num) {
        int cantidadPares = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                cantidadPares++;
            }
        }
        return cantidadPares;
    }
    
    public static int sumatoria(int numero) {
        int sumatoria = 0;
        for (int i = 1; i <= numero; i++) {
            sumatoria += i;
        }
        return sumatoria;
    }
    
    public static int impares(int num1, int num2) {
        int cantidadImpares = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                cantidadImpares++;
            }
        }
        return cantidadImpares;
    }
    
    public static float conversor(float valorDolar, int cantidadDolares) {
        return valorDolar * cantidadDolares;
    }
}