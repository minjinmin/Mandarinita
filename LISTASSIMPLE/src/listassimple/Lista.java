package listassimple;
/**
 *
 * @author minjinmin
 */
public class Lista {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int index;
   
    public int getIndex(){
        return this.index;
    }
   
    public Lista(){
        this.primerNodo=null;
        this.ultimoNodo=null;
        this.index=0;
    }
    
        // Elminar el ultimo nodo
     public void eliminarUltimoNodo() {
            Nodo aux = this.primerNodo;
            int contador=0;
            while (contador<index-1) {
                aux = aux.getSiguiente();
                contador++;
            }
            aux.setSiguiente(null);
            this.ultimoNodo = aux;
            this.index--;
        }
              
     //Eliminar el primer Nodo :
  public void eliminarPrimerNodo() {
    if (this.primerNodo != null) {
        this.primerNodo = this.primerNodo.getSiguiente();
        this.index--;
        if (this.index == 0) {
            this.ultimoNodo = null;
        }
      }
    }
  
  public void eliminaPNodo(){
      if(!this.verificarLista()){
          Nodo aux=this.primerNodo;
          this.primerNodo=aux.getSiguiente();
          this.index--;
      }
  }
 

     // imprimir la lista
    public void inprimirLista(){
        Nodo aux=this.primerNodo;
        int contador=0;
        while(contador<this.index){
            System.out.print((contador+1)+". ["+aux.getValor()+"]-->");
            aux=aux.getSiguiente();
            contador++;
        }
    }
   
    public void imprimirPrimerNodo(){
        System.out.println("Primer Nodo: "+this.primerNodo.getValor());
    }
   
    public void imprimirUltimoNodo(){
        System.out.println("Ultimo Nodo: "+this.ultimoNodo.getValor());
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
   
    public void imprimirNodos() {
    Nodo actual = this.primerNodo;
    while (actual != null) {
        System.out.println("Nodo: " + actual.getValor());
        actual = actual.getSiguiente();
     }
    }

    //----Agregar nodo final recorriendo con ciclo while
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
   
    //-----Agregar nodo cuando la lista esta en null
    public void agregarNodo(){
        Nodo nodo=new Nodo(100);
        if(this.verificarLista()){
            this.primerNodo=nodo;
            this.index++;
        }
    }
    
    
     //Eliminar el nodo del nodo 3, y el nodo de la posicion 4 pase a ocupar el nodo 3.


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


      //dividir la lista2 apartir de la posision del nodo del numero 3 y te muestre esa lista y la otra lista donde quedan los numeros restantes.
public void dosListas() {
    if (this.index >= 3) {
        Lista listaNueva = new Lista();
        Nodo actual = this.primerNodo;
        int contador = 1;
        while (actual != null) {
            if (contador >= 3) {
                listaNueva.agregarNodoFinalMejorado(new Nodo(actual.getValor()));
                if (contador == 3) {
                    this.primerNodo = actual.getSiguiente();
                    this.index--;
                }
            }
            actual = actual.getSiguiente();
            contador++;
        }
}
}
}
