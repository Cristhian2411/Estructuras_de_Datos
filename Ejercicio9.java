package laboratori01;

import java.util.Stack;

public class Ejercicio9 {

    // Función recursiva que filtra elementos basados en una condición
    public static Stack<Integer> filtrarPila(Stack<Integer> pilaOriginal) {
        // Crear una nueva pila para almacenar los elementos que cumplen con la condición
        Stack<Integer> pilaFiltrada = new Stack<>();
        // Llamar a la función recursiva con la pila original y la pila filtrada
        filtrarPilaRecursivo(pilaOriginal, pilaFiltrada);
        return pilaFiltrada;
    }

    // Función recursiva auxiliar
    private static void filtrarPilaRecursivo(Stack<Integer> pilaOriginal, Stack<Integer> pilaFiltrada) {
        if (pilaOriginal.isEmpty()) {
            return; // Caso base: la pila original está vacía
        }

        // Extraer el elemento superior de la pila original
        Integer elemento = pilaOriginal.pop();

        // Llamada recursiva antes de procesar el elemento actual
        filtrarPilaRecursivo(pilaOriginal, pilaFiltrada);

        // Aplicar la condición y agregar el elemento a la pila filtrada si cumple con la condición
        if (elemento > 5) {
            pilaFiltrada.push(elemento);
        }

        // Volver a colocar el elemento en la pila original para mantener su orden
        pilaOriginal.push(elemento);
    }

    public static void main(String[] args) {
        // Crear una pila de ejemplo
        Stack<Integer> pila = new Stack<>();
        pila.push(3);
        pila.push(7);
        pila.push(1);
        pila.push(9);
        pila.push(4);

        // Filtrar los elementos mayores que 5
        Stack<Integer> pilaFiltrada = filtrarPila(pila);

        // Imprimir la pila filtrada
        System.out.println("Pila filtrada: " + pilaFiltrada);
    }
}

