package laboratori01;


import java.util.HashMap;
import java.util.Map;

public class Ejercicio8 {

    // Función recursiva que filtra solo las claves pares
    public static Map<Integer, String> filtrarClavesPares(Map<Integer, String> mapaOriginal) {
        return filtrarClavesParesRecursivo(mapaOriginal, new HashMap<>());
    }

    // Función auxiliar recursiva
    private static Map<Integer, String> filtrarClavesParesRecursivo(Map<Integer, String> mapaOriginal, Map<Integer, String> mapaFiltrado) {
        if (mapaOriginal.isEmpty()) {
            return mapaFiltrado;
        }

        // Obtener la primera entrada del mapa
        Map.Entry<Integer, String> entrada = mapaOriginal.entrySet().iterator().next();

        // Si la clave es par, agregarla al mapa filtrado
        if (entrada.getKey() % 2 == 0) {
            mapaFiltrado.put(entrada.getKey(), entrada.getValue());
        }

        // Eliminar la entrada procesada del mapa original
        mapaOriginal.remove(entrada.getKey());

        // Llamar recursivamente a la función con el mapa actualizado
        return filtrarClavesParesRecursivo(mapaOriginal, mapaFiltrado);
    }

    public static void main(String[] args) {
        // Crear un mapa de ejemplo
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");
        mapa.put(4, "Cuatro");

        // Filtrar las claves pares
        Map<Integer, String> mapaFiltrado = filtrarClavesPares(mapa);

        // Imprimir el mapa filtrado
        System.out.println("Mapa filtrado: " + mapaFiltrado);
    }
}


