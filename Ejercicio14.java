package laboratori01;


import java.util.ArrayList;
import java.util.List;

public class Ejercicio14 {

    // Función recursiva que filtra las cadenas que comienzan con una letra mayúscula
    public static List<String> filtrarMayusculas(List<String> listaOriginal) {
        List<String> listaFiltrada = new ArrayList<>();
        filtrarMayusculasRecursivo(listaOriginal, listaFiltrada);
        return listaFiltrada;
    }

    // Función recursiva auxiliar
    private static void filtrarMayusculasRecursivo(List<String> listaOriginal, List<String> listaFiltrada) {
        if (listaOriginal.isEmpty()) {
            return; // Caso base: la lista original está vacía
        }

        // Obtener el primer elemento de la lista original
        String cadena = listaOriginal.remove(0);

        // Llamada recursiva antes de procesar la cadena actual
        filtrarMayusculasRecursivo(listaOriginal, listaFiltrada);

        // Si la cadena comienza con una letra mayúscula, agregarla a la lista filtrada
        if (!cadena.isEmpty() && Character.isUpperCase(cadena.charAt(0))) {
            listaFiltrada.add(cadena);
        }

        // Volver a colocar la cadena en la lista original
        listaOriginal.add(0, cadena);
    }

    public static void main(String[] args) {
        // Crear una lista de cadenas de ejemplo
        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("mundo");
        lista.add("Java");
        lista.add("es");
        lista.add("Increíble");

        // Filtrar las cadenas que comienzan con una letra mayúscula
        List<String> listaMayusculas = filtrarMayusculas(lista);

        // Imprimir la lista filtrada
        System.out.println("Lista de cadenas que comienzan con mayúscula: " + listaMayusculas);
    }
}

