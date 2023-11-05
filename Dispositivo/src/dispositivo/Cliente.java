
package dispositivo;

/**
 *
 * @author minjinmin
 */
public class Cliente {
    private int rut;
    private Dispositivo articulo;
    private boolean atendido;
    private boolean devuelto;

    public Cliente(int rut, Dispositivo articulo) {
        this.rut = rut;
        this.articulo = articulo;
        this.atendido = false;
        this.devuelto = false;
    }

    public int getRut() {
        return rut;
    }

    public Dispositivo getArticulo() {
        return articulo;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }
}
