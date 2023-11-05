package com.mycompany.gato2;
import java.util.Scanner;
/**
 *
 * @author juaan
 */
public class Gato2 {
public static void main(String[] args) {
        Tablero t=new Tablero();
        Scanner leer=new Scanner(System.in);
        t.imprimirTablero();
        int turno=0;
        int jugada=0;
        while(turno<9){
            System.out.println("Selecciona tu jugada");
            jugada=leer.nextInt();
            t.tirar(jugada, 'X');
            t.imprimirTablero();
            t.validarTiro();
            turno++;
            if (t.estatus) {
                turno=10;
                
            }
            if (turno<9) {
                System.out.println("Selecciona tu jugada");
                jugada=leer.nextInt();
                t.tirar(jugada, 'O');
                t.imprimirTablero();
                t.validarTiro();
                turno++;
                 if (t.estatus) {
                turno=10;
                
            }
                
                
            }
        }
        
    
}
}