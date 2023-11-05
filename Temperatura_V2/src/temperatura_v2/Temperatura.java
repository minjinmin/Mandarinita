package temperatura_v2;

public class Temperatura {
    private float maxima;
    private float minima;

    public Temperatura(float maxima, float minima) {
        this.maxima = maxima;
        this.minima = minima;
    }

    public Temperatura() {

    }

    public float getMaxima() {
        return maxima;
    }

    public void setMaxima(float maxima) {
        this.maxima = maxima;
    }

    public float getMinima() {
        return minima;
    }

    public void setMinima(float minima) {
        this.minima = minima;
    }
}
