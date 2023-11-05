package ls;

public class LS {

    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.agregarNodoFinalMejorado(new Nodo(100));
        lista1.agregarNodoFinalMejorado(new Nodo(150));
        lista1.agregarNodoFinalMejorado(new Nodo(200));

        if (lista1.verificarLista()) {
            System.out.println("Lista Vacía");
        } else {
            System.out.println("Lista Ocupada");
        }

        System.out.println("Nodos de la lista: " + lista1.getIndex());
        lista1.imprimirPrimerNodo();
        lista1.imprimirUltimoNodo();
        System.out.println("Lista 1: ");
        lista1.imprimirLista();

        lista1.eliminarUltimoNodo();
        System.out.println("\nEliminando el ultimo nodo: ");
        lista1.imprimirLista();

        lista1.eliminarPrimerNodo();
        System.out.println("\nEliminando el primer nodo: ");
        lista1.imprimirLista();

        Lista lista2 = new Lista();
        lista2.agregarNodoFinalMejorado(new Nodo(500));
        lista2.agregarNodoFinalMejorado(new Nodo(1000));
        lista2.agregarNodoFinalMejorado(new Nodo(1500));
        lista2.agregarNodoFinalMejorado(new Nodo(2000));
        lista2.agregarNodoFinalMejorado(new Nodo(2500));
        lista2.agregarNodoFinalMejorado(new Nodo(3000));
        lista2.agregarNodoFinalMejorado(new Nodo(3500));
        lista2.agregarNodoFinalMejorado(new Nodo(4000));
        lista2.agregarNodoFinalMejorado(new Nodo(4500));
        

        System.out.println(": ");
        System.out.println("Lista 2: ");
        lista2.imprimirLista();

        lista2.eliminarPrimerNodo();
        System.out.println("\nEliminando el primer nodo: ");
        lista2.imprimirLista();

        lista2.eliminarPrimerNodo();
        System.out.println("\nEliminando el primer nodo: ");
        lista2.imprimirLista();
        
              lista2.eliminarMedioNodo();
        System.out.println("\nEliminando el nodo del numero 3: ");
        lista2.imprimirLista();
        

        Lista lista2nueva = new Lista();
        
        int indice1=lista2.getIndex();
        lista2nueva.agregarNodoFinalMejorado(lista2.dividirLista(3));
        lista2nueva.setIndex(indice1-lista2.getIndex());
        
        System.out.println("\n nueva lista 1: ");
        lista2.imprimirLista();
        
        System.out.println("\n nueva lista 2: ");
        lista2nueva.imprimirLista();        
    }
}