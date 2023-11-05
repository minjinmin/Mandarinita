package Ejercicio2;

/**
 *
 * @author minjinmin
 */
public class TelefonoCelular {
    private String tipo;
    private int minutosPlan;
    private float segundosPlanHablados;
    private String marca;
    private int numero;
    private int valorPorMinuto;
    private boolean habilitado;

    public TelefonoCelular(String tipo, int minutosPlan, String marca, int numero, int valorPorMinuto) {
        this.tipo = tipo;
        this.minutosPlan = minutosPlan;
        this.segundosPlanHablados = 0;
        this.marca = marca;
        this.numero = numero;
        this.valorPorMinuto = valorPorMinuto;
        this.habilitado = true;
    }

    public void realizaLLamada(float segundos) {
        if (habilitado) {
            if (segundos <= (minutosPlan * 60 - segundosPlanHablados)) {
                segundosPlanHablados += segundos;
                System.out.println("Llamada realizada conexito.");
            } else {
                System.out.println("No puedes realizar una llamada, excedes el limite de minutos.");
            }
        } else {
            System.out.println("El telefono no esta habilitado.");
        }
    }

    public void cambiarLosMinutosDelPlan(int valor) {
        if (valor > 10) {
            minutosPlan = valor;
            System.out.println("Minutos del plan actualizados a: " + minutosPlan);
        } else {
            System.out.println("El valor debe ser mayor a 10 para actualizar los minutos del plan.");
        }
    }

    public void reiniciarTiempo() {
        segundosPlanHablados = 0;
        System.out.println("Tiempo de llamadas reiniciado.");
    }

   public int verValorAPagar() {
    int minutos = (int) segundosPlanHablados / 60;
    int segundosRestantes = (int) segundosPlanHablados % 60;
    int valorAPagar = minutos * valorPorMinuto;
    if (segundosRestantes > 0) {
        valorAPagar += valorPorMinuto; 
    }
    return valorAPagar;
}

    public void habilitarTelefono(boolean habilitar) {
        habilitado = habilitar;
        if (habilitado) {
            System.out.println("Telefono habilitado.");
        } else {
            System.out.println("Telefono deshabilitado.");
        }
    }

    public static void main(String[] args) {
        TelefonoCelular miTelefono = new TelefonoCelular("Smartphone", 300, "Samsung", 123456789, 1);

        miTelefono.realizaLLamada(120); 
        miTelefono.cambiarLosMinutosDelPlan(500);
        miTelefono.reiniciarTiempo(); 
        miTelefono.habilitarTelefono(false); 
    }
}
