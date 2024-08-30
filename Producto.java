package laboratori01;

public class Producto implements Comparable<Producto> {
    private int id;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Implementación del método compareTo para comparar productos por su precio
    @Override
    public int compareTo(Producto otroProducto) {
        return Double.compare(this.precio, otroProducto.getPrecio());
    }

    // Sobrescribir el método toString para facilitar la impresión del objeto
    @Override
    public String toString() {
        return "Producto{id=" + id + ", nombre='" + nombre + "', precio=" + precio + "}";
    }
}
