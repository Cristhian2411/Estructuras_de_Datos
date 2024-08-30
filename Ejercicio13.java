package laboratori01;


import java.util.HashSet;
import java.util.Set;

public class Ejercicio13 {

    // Función recursiva que filtra el conjunto para obtener solo los números pares
    public static Set<Integer> filtrarPares(Set<Integer> conjuntoOriginal) {
        Set<Integer> conjuntoFiltrado = new HashSet<>();
        filtrarParesRecursivo(conjuntoOriginal, conjuntoFiltrado);
        return conjuntoFiltrado;
    }

    // Función recursiva auxiliar
    private static void filtrarParesRecursivo(Set<Integer> conjuntoOriginal, Set<Integer> conjuntoFiltrado) {
        if (conjuntoOriginal.isEmpty()) {
            return; // Caso base: el conjunto original está vacío
        }

        // Obtener un elemento del conjunto original
        Integer elemento = conjuntoOriginal.iterator().next();
        conjuntoOriginal.remove(elemento);

        // Llamada recursiva antes de procesar el elemento actual
        filtrarParesRecursivo(conjuntoOriginal, conjuntoFiltrado);

        // Si el número es par, agregarlo al conjunto filtrado
        if (elemento % 2 == 0) {
            conjuntoFiltrado.add(elemento);
        }

        // Volver a colocar el elemento en el conjunto original
        conjuntoOriginal.add(elemento);
    }

    public static void main(String[] args) {
        // Crear un conjunto de números de ejemplo
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(5);
        conjunto.add(6);

        // Filtrar los números pares
        Set<Integer> conjuntoPares = filtrarPares(conjunto);

        // Imprimir el conjunto de números pares
        System.out.println("Conjunto de números pares: " + conjuntoPares);
    }
}

