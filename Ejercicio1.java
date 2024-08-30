package laboratori01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ejercicio1 {


    public static void main(String[] args) {
        // Crear una lista de objetos Persona
        List<Persona> personas = new ArrayList<>();

        // Añadir objetos Persona a la lista
        personas.add(new Persona("Juan", 25, "Masculino"));
        personas.add(new Persona("Ana", 30, "Femenino"));
        personas.add(new Persona("Carlos", 22, "Masculino"));
        personas.add(new Persona("María", 28, "Femenino"));

        // Mostrar la lista antes de ordenar
        System.out.println("Lista antes de ordenar:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenar la lista utilizando el algoritmo QuickSort
        quickSort(personas, 0, personas.size() - 1);

        // Mostrar la lista después de ordenar
        System.out.println("\nLista después de ordenar por edad (usando QuickSort recursivo):");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }


    public static void quickSort(List<Persona> personas, int low, int high) {
        // Verificar si hay más de un elemento en la sublista
        if (low < high) {
            // Particionar la lista y obtener el índice de partición
            int pi = partition(personas, low, high);

            // Ordenar recursivamente las sublistas generadas por la partición
            quickSort(personas, low, pi - 1);
            quickSort(personas, pi + 1, high);
        }
    }


    public static int partition(List<Persona> personas, int low, int high) {
        // Elegir el último elemento como pivote
        Persona pivot = personas.get(high);
        // Índice del elemento más pequeño
        int i = low - 1;

        // Recorrer la sublista desde low hasta high - 1
        for (int j = low; j < high; j++) {
            // Comparar cada elemento con el pivote
            if (personas.get(j).compareTo(pivot) <= 0) {
                i++;

                // Si el elemento es menor o igual al pivote, intercambiarlo con el elemento en la posición i
                Persona temp = personas.get(i);
                personas.set(i, personas.get(j));
                personas.set(j, temp);
            }
        }

        // Colocar el pivote en la posición correcta, intercambiándolo con el elemento en i+1
        Persona temp = personas.get(i + 1);
        personas.set(i + 1, personas.get(high));
        personas.set(high, temp);

        // Retornar el índice del pivote
        return i + 1;
    }
}
