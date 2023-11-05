package bus;
/**
 *
 * @author minjinmin
 */
public class Bus {
    private int valorPasaje;
    private Persona[] clientes;

    public Bus() {
        this.clientes = new Persona[40];
    }

    public Bus(int valorPasaje) {
        this.valorPasaje = valorPasaje;
        this.clientes = new Persona[40];
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

   public void agregarPasajero(int numeroAsiento, Persona persona) {
    if (numeroAsiento >= 1 && numeroAsiento <= 40) {
        if (clientes[numeroAsiento - 1] == null) {
            clientes[numeroAsiento - 1] = persona;
            System.out.println("Pasajero agregado al asiento " + numeroAsiento);
        } else {
            System.out.println("El asiento " + numeroAsiento + " ya esta ocupado.");
        }
    } else {
        System.out.println("Numero de asiento no valido.");
    }
}


    public double verGanancia() {
        double ganancia = 0;
        for (Persona cliente : clientes) {
            if (cliente != null) {
                if (cliente.isDescuento()) {
                    ganancia += valorPasaje * 0.9; 
                } else {
                    ganancia += valorPasaje;
                }
            }
        }
        return ganancia;
    }
}
