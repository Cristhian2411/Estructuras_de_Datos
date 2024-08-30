package laboratori01;


import java.util.Stack;
import java.util.function.Predicate;

public class Ejercicio16 {

    // Función recursiva que filtra la pila según la condición dada
    public static <T> Stack<T> filtrarPila(Stack<T> pilaOriginal, Predicate<T> condicion) {
        Stack<T> pilaFiltrada = new Stack<>();
        filtrarPilaRecursivo(pilaOriginal, pilaFiltrada, condicion);
        return pilaFiltrada;
    }

    // Función recursiva auxiliar
    private static <T> void filtrarPilaRecursivo(Stack<T> pilaOriginal, Stack<T> pilaFiltrada, Predicate<T> condicion) {
        if (pilaOriginal.isEmpty()) {
            return; // Caso base: la pila original está vacía
        }

        // Extraer el elemento en la parte superior de la pila original
        T elemento = pilaOriginal.pop();

        // Llamada recursiva antes de procesar el elemento actual
        filtrarPilaRecursivo(pilaOriginal, pilaFiltrada, condicion);

        // Aplicar la condición y agregar el elemento a la pila filtrada si cumple
        if (condicion.test(elemento)) {
            pilaFiltrada.push(elemento);
        }

        // Volver a colocar el elemento en la pila original para mantener su orden
        pilaOriginal.push(elemento);
    }

    public static void main(String[] args) {
        // Crear una pila de ejemplo
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        // Definir la condición (ejemplo: solo valores mayores que 2)
        Predicate<Integer> condicion = valor -> valor > 2;

        // Filtrar la pila según la condición
        Stack<Integer> pilaFiltrada = filtrarPila(pila, condicion);

        // Imprimir la pila filtrada
        System.out.println("Pila filtrada: " + pilaFiltrada);
    }
}
