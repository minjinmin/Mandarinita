package volado;
import java.util.Random;

public class Moneda {

    private int cara;
    Random rand = new Random();

    public Moneda(int valor) {
        this.cara = valor;
    }

    public Moneda() {
        this.cara = 0;
    }

    public void mostrarCara() {
        if (this.cara == 0) {
            System.out.println("Moneda: Sol");
        } else {
            System.out.println("Moneda: Águila");
        }
    }

    public void lanzar() {
        this.cara = rand.nextInt(2);
    }

    public int getCara() {
        return this.cara;
    }
}
