package laboratori01;

import java.util.ArrayList;
import java.util.List;
import laboratori01.Producto;


public class Ejercicio11 {

    // Función principal para ejecutar el QuickSort
    public static void quickSort(List<Producto> productos, int low, int high) {
        if (low < high) {
            int pi = partition(productos, low, high);
            // Ordenar las dos sublistas de forma recursiva
            quickSort(productos, low, pi - 1);
            quickSort(productos, pi + 1, high);
        }
    }

    // Función de partición
    public static int partition(List<Producto> productos, int low, int high) {
        Producto pivot = productos.get(high); // Pivote
        int i = low - 1; // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el producto actual es menor o igual al pivote
            if (productos.get(j).compareTo(pivot) <= 0) {
                i++;
                // Intercambiar productos[i] y productos[j]
                Producto temp = productos.get(i);
                productos.set(i, productos.get(j));
                productos.set(j, temp);
            }
        }

        // Intercambiar productos[i + 1] con el pivote
        Producto temp = productos.get(i + 1);
        productos.set(i + 1, productos.get(high));
        productos.set(high, temp);

        return i + 1;
    }

    // Función para imprimir la lista de productos
    public static void imprimirLista(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    // Clase principal con el método main
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(3, "Producto C", 200.0));
        productos.add(new Producto(1, "Producto A", 100.0));
        productos.add(new Producto(2, "Producto B", 150.0));

        System.out.println("Lista antes de ordenar:");
        imprimirLista(productos);

        // Ordenar la lista usando QuickSort
        quickSort(productos, 0, productos.size() - 1);

        System.out.println("\nLista después de ordenar:");
        imprimirLista(productos);
    }
}
