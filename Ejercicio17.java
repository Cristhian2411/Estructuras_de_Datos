package laboratori01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio17 {


    public static void main(String[] args) {
        // Crear un HashMap
        Map<String, Double> productosHashMap = new HashMap<>();
        productosHashMap.put("Laptop", 1000.00);
        productosHashMap.put("Smartphone", 800.00);
        productosHashMap.put("Tablet", 400.00);
        /**HashMap:

         Descripción: Un HashMap almacena los elementos en una tabla hash. No garantiza ningún orden específico de los elementos.
         Características:
         No garantiza el orden de inserción.
         Operaciones como put(), get(), y remove() son muy rápidas, generalmente en tiempo constante O(1).
         Permite un null como clave y múltiples null como valores. **/

        // Crear un LinkedHashMap
        Map<String, Double> productosLinkedHashMap = new LinkedHashMap<>();
        productosLinkedHashMap.put("Laptop", 1000.00);
        productosLinkedHashMap.put("Smartphone", 800.00);
        productosLinkedHashMap.put("Tablet", 400.00);
        /** LinkedHashMap:

         Descripción: Un LinkedHashMap es similar a un HashMap, pero mantiene un orden de inserción de los elementos.
         Características:
         Mantiene los elementos en el orden en que fueron insertados.
         Es un poco más lento que HashMap debido a la necesidad de mantener el orden de los elementos.
         También permite un null como clave y múltiples null como valores.**/
        // Crear un TreeMap
        Map<String, Double> productosTreeMap = new TreeMap<>();
        productosTreeMap.put("Laptop", 1000.00);
        productosTreeMap.put("Smartphone", 800.00);
        productosTreeMap.put("Tablet", 400.00);

        /** TreeMap:

         Descripción: Un TreeMap almacena los elementos en un árbol binario de búsqueda, lo que garantiza que los
         elementos estén ordenados según el orden natural de las claves (o un comparador definido).
         Características:
         Mantiene las claves en orden natural (alfabético, numérico, etc.) o un orden definido por un comparador.
         Las operaciones put(), get(), y remove() son más lentas en comparación con HashMap y LinkedHashMap,
         con una complejidad O(log n).
         No permite null como clave, pero permite múltiples null como valores.**/

        // Imprimir los contenidos de cada mapa
        System.out.println("Contenido de HashMap:");
        imprimirMapa(productosHashMap);

        System.out.println("\nContenido de LinkedHashMap:");
        imprimirMapa(productosLinkedHashMap);

        System.out.println("\nContenido de TreeMap:");
        imprimirMapa(productosTreeMap);
    }

    public static void imprimirMapa(Map<String, Double> mapa) {
        for (Map.Entry<String, Double> entrada : mapa.entrySet()) {
            System.out.println("Producto: " + entrada.getKey() + ", Precio: " + entrada.getValue());
        }
    }
}


