package laboratori01;



import java.util.ArrayList;
import java.util.List;

class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int item) {
        valor = item;
        izquierdo = derecho = null;
    }
}

public class Ejercicio12 {
    Nodo raiz;

    public Ejercicio12() {
        raiz = null;
    }

    // Método para agregar un nuevo nodo en el árbol
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    // Método recursivo para insertar un nuevo nodo
    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }
        return raiz;
    }

    // Método que devuelve una lista con los elementos del árbol en orden ascendente
    public List<Integer> obtenerElementosEnOrden() {
        List<Integer> elementos = new ArrayList<>();
        obtenerElementosEnOrdenRec(raiz, elementos);
        return elementos;
    }

    // Método recursivo para hacer el recorrido in-order
    private void obtenerElementosEnOrdenRec(Nodo nodo, List<Integer> elementos) {
        if (nodo != null) {
            obtenerElementosEnOrdenRec(nodo.izquierdo, elementos); // Recorre el subárbol izquierdo
            elementos.add(nodo.valor); // Agrega el valor del nodo
            obtenerElementosEnOrdenRec(nodo.derecho, elementos); // Recorre el subárbol derecho
        }
    }

    // Método main para probar la funcionalidad
    public static void main(String[] args) {
        Ejercicio12 arbol = new Ejercicio12();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        List<Integer> elementosEnOrden = arbol.obtenerElementosEnOrden();
        System.out.println("Elementos del árbol en orden ascendente: " + elementosEnOrden);
    }
}

