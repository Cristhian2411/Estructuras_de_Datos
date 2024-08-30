package laboratori01;

import java.util.HashMap;
import java.util.Map;

class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;

    // Constructor
    public Estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getMatricula() {
        return matricula;
    }

    // Sobrescribir el método toString para facilitar la impresión del objeto
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Matrícula: " + matricula;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear objetos Estudiante
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 20, "MAT001");
        Estudiante estudiante2 = new Estudiante("María López", 22, "MAT002");
        Estudiante estudiante3 = new Estudiante("Carlos García", 19, "MAT003");

        // Crear un mapa para asociar matrícula con el objeto Estudiante
        Map<String, Estudiante> mapaEstudiantes = new HashMap<>();
        mapaEstudiantes.put(estudiante1.getMatricula(), estudiante1);
        mapaEstudiantes.put(estudiante2.getMatricula(), estudiante2);
        mapaEstudiantes.put(estudiante3.getMatricula(), estudiante3);

        // Imprimir estudiantes en el mapa
        for (String matricula : mapaEstudiantes.keySet()) {
            System.out.println("Matrícula: " + matricula + ", Estudiante: " + mapaEstudiantes.get(matricula));
        }
    }
}
