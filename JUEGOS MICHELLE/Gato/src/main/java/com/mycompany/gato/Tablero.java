package com.mycompany.gato;
/**
 *
 * @author minjinmin
 */

public class Tablero {
    private char[][] tablero;

    public Tablero() {
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

public void mostrarTablero() {
    System.out.println("    0 | 1 | 2");
    System.out.println(" --------------");
    for (int i = 0; i < 3; i++) {
        System.out.print(i + " ");
        for (int j = 0; j < 3; j++) {
            System.out.print("| " + tablero[i][j] + " ");
        }
        System.out.println("|");
        System.out.println(" --------------");
    }
}

    public boolean realizarJugada(int fila, int columna, Jugador jugador) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
            tablero[fila][columna] = jugador.getSimbolo();
            return true;
        }
        return false;
    }

public boolean verificarGanador(Jugador jugador) {
    char simbolo = jugador.getSimbolo();

    for (int i = 0; i < 3; i++) {
        if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo) {
            return true;
        }
    }
    for (int j = 0; j < 3; j++) {
        if (tablero[0][j] == simbolo && tablero[1][j] == simbolo && tablero[2][j] == simbolo) {
            return true; 
        }
    }
    if (tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo) {
        return true; 
    }
    if (tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo) {
        return true; 
    }

    return false;
}

    public boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; 
                }
            }
        }
        return true; 
    }
}