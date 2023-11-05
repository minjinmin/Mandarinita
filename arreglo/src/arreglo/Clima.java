package arreglo;

public class Clima {
    private Temperatura[] temperaturas;

    public Clima() {
        temperaturas = new Temperatura[7];
    }

    public void agregarTemperatura(int posicion, Temperatura t) {
        temperaturas[posicion] = t;
    }

    public float verPromedioMinima() {
        float sum = 0;
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] != null) {
                sum += temperaturas[i].getMinima();
            }
        }
        return sum / 7;
    }

    public float verPromedioMaxima() {
        float sum = 0;
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] != null) {
                sum += temperaturas[i].getMaxima();
            }
        }
        return sum / 7;
    }
}
