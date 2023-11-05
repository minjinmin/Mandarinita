package Calculos;
import java.util.Scanner;

/**
 *
 * @author minjinmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. El mayor");
            System.out.println("2. El menor");
            System.out.println("3. Cantidad pares");
            System.out.println("4. Sumatoria");
            System.out.println("5. Impares");
            System.out.println("6. Conversor");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opcion:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese dos numeros:");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    System.out.println("El mayor es: " + Calculos.elMayor(num1, num2));
                    break;
                case 2:
                    System.out.println("Ingrese tres numeros:");
                    int num3 = scanner.nextInt();
                    int num4 = scanner.nextInt();
                    int num5 = scanner.nextInt();
                    System.out.println("El menor es: " + Calculos.elMenor(num3, num4, num5));
                    break;
                case 3:
                    System.out.println("Ingrese un numero:");
                    int num6 = scanner.nextInt();
                    System.out.println("La cantidad de numeros pares entre 1 y " + num6 + " es: " + Calculos.cantidadPares(num6));
                    break;
                case 4:
                    System.out.println("Ingrese un numero:");
                    int num7 = scanner.nextInt();
                    System.out.println("La sumatoria de los numeros entre 1 y " + num7 + " es: " + Calculos.sumatoria(num7));
                    break;
                case 5:
                    System.out.println("Ingrese dos numeros:");
                    int num8 = scanner.nextInt();
                    int num9 = scanner.nextInt();
                    System.out.println("La cantidad de numeros impares entre " + num8 + " y " + num9 + " es: " + Calculos.impares(num8, num9));
                    break;
                case 6:
                    System.out.println("Ingrese el valor en dolares:");
                    float valorDolar = scanner.nextFloat();
                    System.out.println("Ingrese la cantidad de dolares:");
                    int cantidadDolares = scanner.nextInt();
                    float resultado = Calculos.conversor(valorDolar, cantidadDolares);
                    System.out.println("La conversion a pesos es: " + resultado);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }
}
