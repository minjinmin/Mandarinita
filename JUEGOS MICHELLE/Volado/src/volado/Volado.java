package volado;
import java.util.Scanner;

public class Volado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ranita ranita = new Ranita();
        Moneda moneda = new Moneda();
        int menu = 0;
        int apuesta = 0;
        ranita.mostrarSaldo();
        int cara = 0; 

        while (menu < 4) {
            System.out.println("1. Cuanto quieres perder");
            System.out.println("2. Seleccione una opcion");
                        System.out.println("3. Salir");

            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Inserta la cantidad que quieres apostar para perder");
                    apuesta = leer.nextInt();
                    if (apuesta > ranita.getSaldo()) {
                        System.out.println("JAJAJA PERDISTE");
                        apuesta = 0;
                        menu = 3;
                    }
                    break;

                case 2:
                    System.out.println("Selecciona Sol=0 Aguila=1");
                    cara = leer.nextInt();
                    moneda.lanzar();
                    moneda.mostrarCara();
                    if (cara == moneda.getCara()) {
                        System.out.println("¡QUE PRO!");
                        ranita.masMoney(apuesta);
                    } else {
                        System.out.println("Suerte JAJAJA");
                        ranita.menosMoney(apuesta);
                    }
                    ranita.mostrarSaldo();
                    break;

                default:
                    break;
            }
        }
    }
}
