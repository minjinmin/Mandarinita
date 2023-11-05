package arboldenavidad;

/**
 *
 * @author minjinmin
 */
public class Arbol {
    private int altura;

    public Arbol(int altura) {
        this.altura = altura;
    }
    
 public void dibujarArbol() {
        dibujarParteSuperior(altura, altura - 1);
        dibujarTronco(altura);
    }
 
    private void dibujarParteSuperior(int alturaActual, int numAsteriscos) {
        if (alturaActual == 0) {
            return;
        }

        dibujarEspacios(alturaActual - 1);
        dibujarAsteriscos(numAsteriscos);
        System.out.println();

        dibujarParteSuperior(alturaActual - 1, numAsteriscos + 2);
    }

    private void dibujarTronco(int altura) {
        for (int i = 0; i < altura; i++) {
            dibujarEspacios(altura - 1);
            dibujarAsteriscos(100);
            System.out.println();
        }
    }

    private void dibujarEspacios(int numEspacios) {
        for (int i = 0; i < numEspacios; i++) {
            System.out.print(" ");
        }
    }

    private void dibujarAsteriscos(int numAsteriscos) {
        for (int i = 0; i < numAsteriscos; i++) {
            System.out.print("*");
        }
    }
}