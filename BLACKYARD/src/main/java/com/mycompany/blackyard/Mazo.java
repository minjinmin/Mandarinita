package com.mycompany.blackyard;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<carta> mazo;
    private String tipos[] = { "CORAZONES", "TREBOLES", "DIAMANTES", "ESPADAS" };
    private String nombres[] = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "JACK", "REINA",
            "REY" };

    public Mazo() {
        this.mazo = new ArrayList<carta>(); 
        for (int i = 0; i < this.tipos.length; i++) {
            for (int j = 0; j < this.nombres.length; j++) {
                carta c = new carta((j + 1), this.tipos[i], this.nombres[j] + " DE " + this.tipos[i]);
                this.mazo.add(c);
            }
        }
    }

    public void imprimirMazo() {
        for (int i = 0; i < this.mazo.size(); i++) {
            System.out.println((i + 1) + ". " + this.mazo.get(i).getNombre());
        }
    }
    
    public void BARAJA(){
        Collections.shuffle(mazo);
    }
    
    public carta pedirCarta(){
        carta c=this.mazo.get(this.mazo.size()-1);
        this.mazo.remove(this.mazo.size()-1);
        return c;
    }    
}
