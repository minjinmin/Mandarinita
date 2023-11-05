package com.mycompany.gato;
import java.util.Scanner;

/**
 *
 * @author minjinmin
 */
public class Gato {

 public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Jugador jugadorX = new Jugador('X');
        Jugador jugadorO = new Jugador('O');
        Jugador jugadorActual = jugadorX;
        boolean juegoTerminado = false;

        Scanner scanner = new Scanner(System.in);

        while (!juegoTerminado) {
            tablero.mostrarTablero();

            System.out.println("Turno del jugador " + jugadorActual.getSimbolo() + ". Ingrese la fila (0-2) y columna (0-2):");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            if (tablero.realizarJugada(fila, columna, jugadorActual)) {
                juegoTerminado = tablero.verificarGanador(jugadorActual) || tablero.tableroLleno();

                jugadorActual = (jugadorActual == jugadorX) ? jugadorO : jugadorX;
            } else {
                System.out.println("Movimiento no válido. Inténtelo de nuevo.");
            }
        }

        tablero.mostrarTablero();
        if (tablero.verificarGanador(jugadorX)) {
            System.out.println("¡El jugador X ha ganado!");
        } else if (tablero.verificarGanador(jugadorO)) {
            System.out.println("¡El jugador O ha ganado!");
        } else {
            System.out.println("¡Empate!");
        }

        scanner.close();
    }
}