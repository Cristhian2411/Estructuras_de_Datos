package laboratori01;

import java.util.PriorityQueue;

// Clase Tarea que implementa Comparable para ser utilizada en PriorityQueue
class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int prioridad;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tarea otraTarea) {
        return Integer.compare(this.prioridad, otraTarea.getPrioridad());
    }

    @Override
    public String toString() {
        return "Tarea{descripcion='" + descripcion + "', prioridad=" + prioridad + "}";
    }
}

public class Ejercicio6 {

    private PriorityQueue<Tarea> colaDeTareas;

    public Ejercicio6() {
        colaDeTareas = new PriorityQueue<>();
    }

    public void agregarTarea(Tarea tarea) {
        colaDeTareas.add(tarea);
    }

    public Tarea procesarTarea() {
        return colaDeTareas.poll();
    }

    public Tarea verSiguienteTarea() {
        return colaDeTareas.peek();
    }

    public boolean isEmpty() {
        return colaDeTareas.isEmpty();
    }

    public static void main(String[] args) {
        Ejercicio6 gestorDeTareas = new Ejercicio6();

        gestorDeTareas.agregarTarea(new Tarea("Tarea 1 - Baja prioridad", 5));
        gestorDeTareas.agregarTarea(new Tarea("Tarea 2 - Alta prioridad", 1));
        gestorDeTareas.agregarTarea(new Tarea("Tarea 3 - Prioridad media", 3));

        while (!gestorDeTareas.isEmpty()) {
            Tarea tarea = gestorDeTareas.procesarTarea();
            System.out.println("Procesando: " + tarea);
        }
    }
}
