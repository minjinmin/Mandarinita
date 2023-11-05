package com.mycompany.blackyard;

public class carta {
    private int valor;
    private String tipo;
    private String nombre;

    public carta() {

    }

    public carta(int valor, String tipo, String nombre) {
        this.valor = valor;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int v) {
        this.valor = v;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }
}
