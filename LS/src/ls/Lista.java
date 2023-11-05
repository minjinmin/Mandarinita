package ls;
/**
 *
 * @author juaan
 */
public class Lista {
    private Nodo primerNodo;
    private int index;
    private Nodo ultimoNodo;
    
    public Lista(){
        this.primerNodo=null;
        this.ultimoNodo=null;
        this.index=0;
    }
    
     public Lista(Nodo primerNodo, int index){
        this.primerNodo=primerNodo;
        this.ultimoNodo=null;
        this.index=index;
    }
    
    public int getIndex(){
        return this.index;
    }
    
    public void setIndex(int x){
    this.index=x;
    }
    
    public boolean verificarLista(){
        return this.primerNodo==null;
    }
    
    public void agregarNodoFinalMejorado(Nodo x){
        if(this.verificarLista()){    
    this.primerNodo=x;
    this.ultimoNodo=x;
    this.index++;
    }else{
        Nodo aux=this.ultimoNodo;
        this.ultimoNodo.setSiguiente(x);
        this.ultimoNodo=x;
        this.index++;
        }
    }
    
    public void imprimirPrimerNodo(){
        System.out.println("Primer nodo: " + this.primerNodo.getValor());
    }
    
    public void imprimirUltimoNodo(){
        System.out.println("Ultimo nodo: "+this.ultimoNodo.getValor());
    }
    
    public void imprimirLista(){
        Nodo aux=this.primerNodo;
        int contador=0;
        while(contador<this.index){
            System.out.print((contador+1)+".- ["+aux.getValor()+"]--> ");
            aux=aux.getSiguiente();
            contador++;
        }
        
    }
      
    public void agregarNodoFinal(Nodo x){
        if(this.verificarLista()){
            this.primerNodo=x;
            this.index++;
        }else{
            Nodo aux=this.primerNodo;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(x);
            this.index++;
        }
    }
    
    public void agregarNodo(){
        Nodo nodo = new Nodo (100);
        if(this.verificarLista()){
            this.primerNodo=nodo;
            this.index++;
        }
    }
    
    public void eliminarUltimoNodo(){
        Nodo aux=this.primerNodo;
        int contador=0;
        while(contador<index-1){
          aux=aux.getSiguiente();
          contador++;
        }
        aux.setSiguiente(null);
        this.ultimoNodo=aux;
        this.index--;
    }
    
    public void eliminarPrimerNodo(){
        if (!this.verificarLista()) {
            Nodo aux=this.primerNodo;
            this.primerNodo=aux.getSiguiente();
        
            index--;
        }       
    }
    
    public void eliminarNodo(int x){
    Nodo aux=this.primerNodo;
        int contador=0;
        while(contador<x){
            aux=aux.getSiguiente();
          contador++;
        }
        aux.setSiguiente(null);
        
        index--;
        
    }
        
  // Eliminar el nodo del nodo 3, y el nodo de la posicion 4 pase a ocupar el nodo 3.
    public void eliminarMedioNodo() {
        if (this.index >= 3) {
            int posicionObjetivo = 3;
            Nodo anterior = this.primerNodo;
            Nodo actual = this.primerNodo.getSiguiente();
            int contador = 2;
            while (actual != null) {
                if (contador == posicionObjetivo) {
                    anterior.setSiguiente(actual.getSiguiente());
                    this.index--;
                    break;
                }
                anterior = actual;
                actual = actual.getSiguiente();
                contador++;
            }
        }
    }
    
    public Nodo dividirLista(int x){
        Nodo aux=this.primerNodo;
        int c=1;
        while(c<x-1){
            aux=aux.getSiguiente();
            c++;
        }
        this.ultimoNodo=aux;
        this.index=c;
            return aux.getSiguiente();
        }
}