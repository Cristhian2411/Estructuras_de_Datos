package laboratori01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercicio5 {


    public static void main(String[] args) {
        // Crear un conjunto de tipo HashSet para almacenar elementos únicos
        Set<String> conjunto = new HashSet<>();

        // Añadir elementos al conjunto
        conjunto.add("Elemento 1");
        conjunto.add("Elemento 2");
        conjunto.add("Elemento 3");
        conjunto.add("Elemento 4");
        conjunto.add("Elemento 1"); // Este elemento es un duplicado y no será añadido

        // Crear un iterador para recorrer el conjunto
        Iterator<String> iterador = conjunto.iterator();

        // Imprimir el contenido del conjunto utilizando el iterador
        System.out.println("Contenido del conjunto:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}


