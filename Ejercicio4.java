package laboratori01;

import java.util.Stack;

public class Ejercicio4 {

    private Stack<Object> stack;

    // Constructor
    public Ejercicio4() {
        stack = new Stack<>();
    }

    // Método para empujar un elemento a la pila
    public void push(Object elemento) {
        // Si la pila está vacía, simplemente empuja el elemento
        if (stack.isEmpty()) {
            stack.push(elemento);
        } else {
            // Si la pila no está vacía, verifica el tipo del elemento en la cima
            Object topElement = stack.peek();
            if (topElement.getClass().equals(elemento.getClass())) {
                stack.push(elemento);
            } else {
                throw new IllegalArgumentException("El tipo del elemento no coincide con el tipo en la cima de la pila.");
            }
        }
    }

    // Método para sacar un elemento de la pila
    public Object pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return stack.pop();
    }

    // Método para ver el elemento en la cima de la pila
    public Object peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return stack.peek();
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Método para obtener el tamaño de la pila
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        Ejercicio4 pila = new Ejercicio4();

        // Pushing integers
        pila.push(10);
        pila.push(20);

        // Pushing another type (String), this will throw an exception
        try {
            pila.push("Hello");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Expected: El tipo del elemento no coincide con el tipo en la cima de la pila.
        }

        // Pop and display the top element
        System.out.println(pila.pop()); // Outputs: 20

        // Pushing strings after clearing the stack
        pila.push("Hello");
        pila.push("World");

        // Peek the top element
        System.out.println(pila.peek()); // Outputs: World
    }
}
