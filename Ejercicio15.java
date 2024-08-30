package laboratori01;


import java.util.HashMap;
import java.util.Map;

public class Ejercicio15 {

    // Función recursiva que filtra el mapa
    public static Map<String, Integer> filtrarMapa(Map<String, Integer> mapaOriginal) {
        Map<String, Integer> mapaFiltrado = new HashMap<>();
        filtrarMapaRecursivo(mapaOriginal, mapaFiltrado);
        return mapaFiltrado;
    }

    // Función recursiva auxiliar
    private static void filtrarMapaRecursivo(Map<String, Integer> mapaOriginal, Map<String, Integer> mapaFiltrado) {
        if (mapaOriginal.isEmpty()) {
            return; // Caso base: el mapa original está vacío
        }

        // Obtener una clave cualquiera del mapa original
        String clave = mapaOriginal.keySet().iterator().next();
        Integer valor = mapaOriginal.remove(clave);

        // Si la clave comienza con una letra minúscula, agregarla al mapa filtrado
        if (Character.isLowerCase(clave.charAt(0))) {
            mapaFiltrado.put(clave, valor);
        }

        // Llamada recursiva para procesar el resto del mapa
        filtrarMapaRecursivo(mapaOriginal, mapaFiltrado);
    }

    public static void main(String[] args) {
        // Crear un mapa de ejemplo
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("nombre", 10);
        mapa.put("Edad", 20);
        mapa.put("apellido", 30);
        mapa.put("Direccion", 40);

        // Filtrar el mapa para obtener solo las claves que comienzan con minúscula
        Map<String, Integer> mapaFiltrado = filtrarMapa(mapa);

        // Imprimir el mapa filtrado
        System.out.println("Mapa filtrado: " + mapaFiltrado);
    }
}


