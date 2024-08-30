package laboratori01;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio7 {


    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 17, "Masculino"));
        personas.add(new Persona("Ana", 22, "Femenino"));
        personas.add(new Persona("Carlos", 15, "Masculino"));
        personas.add(new Persona("María", 19, "Femenino"));

        List<Persona> mayoresDeEdad = filtrarMayoresDeEdad(personas);

        System.out.println("Personas mayores de edad:");
        for (Persona persona : mayoresDeEdad) {
            System.out.println(persona);
        }
    }


    public static List<Persona> filtrarMayoresDeEdad(List<Persona> personas) {
        // Caso base: si la lista está vacía, retornar una nueva lista vacía
        if (personas.isEmpty()) {
            return new ArrayList<>();
        }

        // Obtener la primera persona de la lista
        Persona primeraPersona = personas.get(0);

        // Crear una nueva lista para almacenar las personas filtradas
        List<Persona> personasFiltradas = filtrarMayoresDeEdad(personas.subList(1, personas.size()));

        // Si la primera persona es mayor de edad, añadirla a la lista filtrada
        if (primeraPersona.getEdad() >= 18) {
            personasFiltradas.add(0, primeraPersona);
        }

        return personasFiltradas;
    }
}
