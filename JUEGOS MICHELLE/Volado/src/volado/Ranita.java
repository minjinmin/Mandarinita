package volado;

public class Ranita {
    private int saldo;

    public Ranita() {
        this.saldo = 1000;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de la Ranita: $ " + this.saldo);
    }

    public void masMoney(int valor) {
        this.saldo += valor;
    }

    public void menosMoney(int valor) {
        this.saldo -= valor;
    }

    public void setSaldo(int valor) {
        this.saldo = valor;
    }

    public int getSaldo() { 
        return this.saldo;
    }
}
