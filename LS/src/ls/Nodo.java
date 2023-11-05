package ls;

/**
 *
 * @author juaan
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    
    public Nodo(){
        this.valor=0;
        this.siguiente=null;
    }
    
      public void setValor( int x){
        this.valor=x;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public Nodo getSiguiente(){
        return this.siguiente;
    }
    
    public void setSiguiente(Nodo x){
        this.siguiente=x;
    } 
    
     public Nodo(int v){
        this.valor=v;
        this.siguiente=null;
    }
}