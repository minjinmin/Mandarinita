package com.mycompany.blackyard;

import java.util.Scanner;

public class BLACKYARD {

    public static void main(String[] args) {
        Mazo m = new Mazo();
        MANO j1 = new MANO();
        MANO mesa = new MANO();
        Scanner leer = new Scanner(System.in);

        m.BARAJA();
        j1.agregarCarta(m.pedirCarta());
        mesa.agregarCarta(m.pedirCarta());
        j1.agregarCarta(m.pedirCarta());
        mesa.agregarCarta(m.pedirCarta());

        if (mesa.getPuntos() < 17) {
            mesa.agregarCarta(m.pedirCarta());
        }

        mesa.imprimirMesa();
        j1.imprimirMano();

        int estatus = 1;
        int cartera = 1000;
        int apuesta = 0;
        int opcion = 0;

        while (estatus > 0) {
            System.out.println("ELIGE UNA OPCION:");
            System.out.println("1.PEDIR UNA CARTA");
            System.out.println("2.TERMINAR JUEGO");
            System.out.println("3. APOSTAR");
            System.out.println("4. REINICIAR JUEGO");
            System.out.println("5. VER CARTERA");
            System.out.println("0.SALIR DEL JUEGO");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    j1.agregarCarta(m.pedirCarta());
                    j1.imprimirMano();
                    if (!j1.getEstatus()) {
                        cartera -= apuesta;
                        apuesta = 0;
                    }
                    break;

                case 2:
                    System.out.println("Inserta la apuesta: ");
                    apuesta = leer.nextInt();
                    if (mesa.getPuntos() <= 21 && mesa.getPuntos() > j1.getPuntos()) {
                        System.out.println("La casa gana con puntos totales: " + mesa.getPuntos());
                        System.out.println("Puntos del jugador: " + j1.getPuntos());
                        cartera -= apuesta;
                        apuesta = 0;
                    } else {
                        System.out.println("El jugador gana con: " + j1.getPuntos() + " puntos");
                        System.out.println("La casa pierde con " + mesa.getPuntos() + " puntos");
                        cartera += apuesta;
                        apuesta = 0;
                    }
                    break;

                case 3:
                    System.out.println("INSERTA LA CANTIDAD A APOSTAR");
                    int apuestaAux = leer.nextInt();
                    if (apuestaAux <= cartera) {
                        apuesta = apuestaAux;
                    } else {
                        apuesta = 0;
                        System.out.println("SALDO INSUFICIENTE EN LA CARTERA");
                        System.out.println("cartera:$" + cartera);
                    }
                    break;

                case 4:
                    System.out.println("CARTERA:$" + cartera);
                    estatus = 0;
                    break;

                case 5:
                    System.out.println("CARTERA:$" + cartera);
                    break;

                case 0:
                    System.out.println("SALIENDO DEL JUEGO");
                    estatus = 0;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        }
    }
}
