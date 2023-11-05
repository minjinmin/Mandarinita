package listassimple;

/**
 *
 * @author minjinmin
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    
    public Nodo(){
        this.valor=0;
        this.siguiente=null;
    }
    
    public Nodo(int v){
        this.valor=v;
        this.siguiente=null;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public void setValor( int x){
        this.valor=x;
    }
    
    public Nodo getSiguiente(){
        return this.siguiente;
    }
    
    public void setSiguiente(Nodo x){
        this.siguiente=x;
    }
    
    
}
