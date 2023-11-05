
package dispositivo;

/**
 *
 * @author minjinmin
 */
public class Dispositivo {
    private String falla;
    private String observacion;
    private boolean reparado;

    public Dispositivo(String falla) {
        this.falla = falla;
        this.observacion = "";
        this.reparado = false;
    }

    public String getFalla() {
        return falla;
    }

    public void setFalla(String falla) {
        this.falla = falla;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public boolean isReparado() {
        return reparado;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }
}
