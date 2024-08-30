package laboratori01;
import java.util.PriorityQueue;
public class tarea {


    // Clase Tarea que implementa Comparable para ser utilizada en PriorityQueue
    class Tarea implements Comparable<Tarea> {
        private String descripcion;
        private int prioridad; // Cuanto menor sea el número, mayor será la prioridad

        // Constructor
        public Tarea(String descripcion, int prioridad) {
            this.descripcion = descripcion;
            this.prioridad = prioridad;
        }

        // Getters
        public String getDescripcion() {
            return descripcion;
        }

        public int getPrioridad() {
            return prioridad;
        }

        // Implementar el método compareTo para definir el orden en la PriorityQueue
        @Override
        public int compareTo(Tarea otraTarea) {
            // La prioridad más alta es la que tiene el número más bajo
            return Integer.compare(this.prioridad, otraTarea.getPrioridad());
        }

        // Sobrescribir el método toString para facilitar la impresión del objeto
        @Override
        public String toString() {
            return "Tarea{descripcion='" + descripcion + "', prioridad=" + prioridad + "}";
        }
    }

}
