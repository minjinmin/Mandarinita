package listassimple;

/**
 *
 * @author minjinmin
 */
public class LISTASSIMPLE {

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
        lista1.inprimirLista();

        lista1.eliminarUltimoNodo();
        System.out.println("\nEliminando el ultimo nodo: ");
        lista1.inprimirLista();

        lista1.eliminarPrimerNodo();
        System.out.println("\nEliminando el primer nodo: ");
        lista1.inprimirLista();

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
        lista2.inprimirLista();

        lista2.eliminaPNodo();
        System.out.println("\nEliminando el primer nodo: ");
        lista2.inprimirLista();

        lista2.eliminaPNodo();
        System.out.println("\nEliminando el primer nodo: ");
        lista2.inprimirLista();

        lista2.eliminarMedioNodo();
        System.out.println("\nEliminando el nodo del numero 3: ");
        lista2.inprimirLista();
        
        lista2.dosListas();
        System.out.println("\nLista 2 después de dividir a partir del elemento número 3:");
        lista2.inprimirLista();


    }
}