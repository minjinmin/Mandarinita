package dispositivo;
import java.util.ArrayList;

/**
 *
 * @author minjinmin
 */
public class Taller {
    private ArrayList<Cliente> clientes;

    public Taller() {
        clientes = new ArrayList<>();
    }

    public Cliente buscar(int rut) {
        for (Cliente c : clientes) {
            if (c.getRut() == rut) {
                return c;
            }
        }
        return null;
    }

    public void agregar(Cliente c) {
        if (!c.isAtendido() && buscar(c.getRut()) == null) {
            clientes.add(c);
            c.setAtendido(true); 
        }
    }

    public void registrarObservacion(int rut, String detalle) {
        Cliente c = buscar(rut);
        if (c != null) {
            c.getArticulo().setObservacion(detalle);
        }
    }

  public void devolver(int rut) {
    Cliente c = buscar(rut);
    if (c != null) {
        if (!c.isDevuelto()) {
            c.setDevuelto(true);
            clientes.remove(c);
            System.out.println("Dispositivo devuelto con éxito.");
        } else {
            System.out.println("El dispositivo ya ha sido devuelto anteriormente.");
        }
    } else {
        System.out.println("Cliente no encontrado.");
    }
}
}