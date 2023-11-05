package com.mycompany.gato2;

/**
 *
 * @author juaan
 */
public class Tablero {
    private char[][] valor=new char[3][3];
    public boolean estatus=false;
   
    public Tablero(){
        valor[0][0]='1';
        valor[0][1]='2';
        valor[0][2]='3';
        valor[1][0]='4';
        valor[1][1]='5';
        valor[1][2]='6';
        valor[2][0]='7';
        valor[2][1]='8';
        valor[2][2]='9';
    }
   
    public void  validarTiro(){
        if(this.valor[0][0]==this.valor[0][1] && this.valor[0][0]==this.valor[0][2]){
            System.out.println("Felicidades el jugador "+this.valor[0][0]+" ha ganado.");
            this.estatus=true;
        }
        if(this.valor[1][0]==this.valor[1][1] && this.valor[1][0]==this.valor[1][2]){
            System.out.println("Felicidades el jugador "+this.valor[1][0]+" ha ganado.");
            this.estatus=true;
        }
        if(this.valor[2][0]==this.valor[2][1] && this.valor[2][0]==this.valor[2][2]){
            System.out.println("Felicidades el jugador "+this.valor[2][0]+" ha ganado.");
            this.estatus=true;
        }
        if(this.valor[0][0]==this.valor[0][1] && this.valor[0][0]==this.valor[0][2]){
            System.out.println("Felicidades el jugador "+this.valor[0][0]+" ha ganado.");
            this.estatus=true;
        }
        //--------------Validad jugadas verticales---------------------
        if(this.valor[0][0]==this.valor[1][0] && this.valor[0][0]==this.valor[2][0]){
            System.out.println("Felicidades el jugador "+this.valor[0][0]+" ha ganado.");
            this.estatus=true;
        }
        if(this.valor[0][1]==this.valor[1][1] && this.valor[0][1]==this.valor[2][1]){
            System.out.println("Felicidades el jugador "+this.valor[0][1]+" ha ganado.");
            this.estatus=true;
        }
        if(this.valor[0][2]==this.valor[1][2] && this.valor[0][2]==this.valor[2][2]){
            System.out.println("Felicidades el jugador "+this.valor[0][2]+" ha ganado.");
            this.estatus=true;
        }
    }
    public void tirar(int coordenada, char jugador) {
        switch(coordenada){
            case 1:
                if(this.valor[0][0]=='1'){
                    this.valor[0][0]=jugador;
                }
                break;
            case 2:
               if(this.valor[0][1]=='2'){
                    this.valor[0][1]=jugador;
                }
                break;
            case 3:
                if(this.valor[0][2]=='3'){
                    this.valor[0][2]=jugador;
                }
                break;
            case 4:
                if(this.valor[1][0]=='4'){
                    this.valor[1][0]=jugador;
                }
                break;
            case 5:
                if(this.valor[1][1]=='5'){
                    this.valor[1][1]=jugador;
                }
                break;
            case 6:
                if(this.valor[1][2]=='6'){
                    this.valor[1][2]=jugador;
                }
                break;
            case 7:
                if(this.valor[2][0]=='7'){
                    this.valor[2][0]=jugador;
                }
                break;
            case 8:
                if(this.valor[2][1]=='8'){
                    this.valor[2][1]=jugador;
                }
                break;
            case 9:
                if(this.valor[2][2]=='9'){
                    this.valor[2][2]=jugador;
                }
                break;
        }
    }

     public void imprimirTablero(){
      for (int i=0; i<3; i++) {
          System.out.println("   |   |   ");
          String fila="";
          for (int j = 0; j < 3; j++) {
              if(j<2){
                  fila+="   "+valor[i][j]+"|";
              }
              if(j==2){
                  fila+="   "+valor[i][j];
              }
          }
           System.out.println(fila);
          if(i<2){
          System.out.println("------------------");
            }
     
        }
    }
}
