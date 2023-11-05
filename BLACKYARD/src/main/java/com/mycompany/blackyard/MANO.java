package com.mycompany.blackyard;

import java.util.ArrayList;

public class MANO {
    private ArrayList<carta> mano=new ArrayList<carta>();
    private boolean estatus = true;
    private int puntos=0;
    
    public MANO(){
        
    }
    
    public boolean getEstatus(){
        return this.estatus;
    }
    
    public void setEstatus(boolean e){
        this.estatus=e;
    }
    
    public int getPuntos(){
        return this.puntos;
    }
    
    public void setPuntos(int p){
        this.puntos=p;
    }
    
    public void agregarCarta(carta x){
        if(estatus){
        this.mano.add(x);
        if(x.getValor()>10){
            this.puntos+=10;
        }else{
            this.puntos+=x.getValor();
        }
    }
    }
  
    public void imprimirMano(){
        System.out.println("MANO DEL JUGADOR");
        int puntos=0;
        for(int i=0;i<this.mano.size();i++){
            System.out.println((i+1) + ". "+this.mano.get(i).getNombre());
            puntos+=this.mano.get(i).getValor();
        }
        System.out.println("PUNTOS DEL JUGADOR: "+puntos);
        this.validarMano();
    }
    
    public void validarMano(){
        if(this.puntos>21){
            System.out.println("NO VAS MAS");
            this.estatus=false;
        }
    }
    
    public void imprimirMesa(){
        System.out.println("MANO DE LA MESA");
        System.out.println("1.- ??????????");
        int suma=0;
        for(int i=1;i<this.mano.size();i++){
            System.out.println((i+1) + ". "+this.mano.get(i).getNombre());
            suma+=this.mano.get(i).getValor();
        }
        System.out.println("PUNTOS DE LA MESA: "+suma);
        
        if(this.puntos>21){
            System.out.println("LA CASA PIERDE PUNTOS "+this.puntos);
        }
    }
}
