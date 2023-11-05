package temperatura_v2;

public class Clima {
    private Temperatura[] temperaturas;

    public Clima(int numDias) {
        temperaturas = new Temperatura[numDias];
    }

    public void agregarTemperatura(int posicion, Temperatura t) {
        temperaturas[posicion] = t;
    }

    public float verPromedioMinima() {
        float sum = 0;
        int contador = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] != null) {
                sum += temperaturas[i].getMinima();
                contador++;
            }
        }
        return contador > 0 ? sum / contador : 0;
    }

    public float verPromedioMaxima() {
        float sum = 0;
        int contador = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] != null) {
                sum += temperaturas[i].getMaxima();
                contador++;
            }
        }
        return contador > 0 ? sum / contador : 0;
    }

    public float verTemperaturaMaxima() {
        float maxima = Float.MIN_VALUE;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] != null && temperaturas[i].getMaxima() > maxima) {
                maxima = temperaturas[i].getMaxima();
            }
        }
        return maxima;
    }

    public float verTemperaturaMinima() {
        float minima = Float.MAX_VALUE;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] != null && temperaturas[i].getMinima() < minima) {
                minima = temperaturas[i].getMinima();
            }
        }
        return minima;
    }

    public boolean hayTemperaturasSinRegistrar() {
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] == null) {
                return true;
            }
        }
        return false;
    }
}
