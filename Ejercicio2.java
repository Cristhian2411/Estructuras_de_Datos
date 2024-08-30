package laboratori01;

import javax.swing.JOptionPane;
import java.util.TreeSet;

public class Ejercicio2 {
    // Clase Producto
    public static class Producto implements Comparable<Producto> {
        private int codigo;
        private String nombre;
        private double precio;

        public Producto(int codigo, String nombre, double precio) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        @Override
        public int compareTo(Producto otroProducto) {
            return Integer.compare(this.codigo, otroProducto.getCodigo());
        }

        @Override
        public String toString() {
            return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
        }
    }

    // Clase Empresa
    public static class Empresa {
        private TreeSet<Producto> productos;

        public Empresa() {
            this.productos = new TreeSet<>();
        }

        public void agregarProducto(Producto producto) {
            productos.add(producto);
        }

        public Producto buscarProductoPorCodigo(int codigo) {
            for (Producto producto : productos) {
                if (producto.getCodigo() == codigo) {
                    return producto;
                }
            }
            return null; // Retorna null si no encuentra el producto
        }
    }

    // Clase principal con el método main
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Agregar productos
        empresa.agregarProducto(new Producto(1, "Producto A", 100.0));
        empresa.agregarProducto(new Producto(2, "Producto B", 150.0));
        empresa.agregarProducto(new Producto(3, "Producto C", 200.0));

        // Solicitar código del producto para buscar y comparar
        String codigoIngresadoStr = JOptionPane.showInputDialog("Ingrese el código del producto que desea buscar:");

        int codigoIngresado = Integer.parseInt(codigoIngresadoStr);

        // Buscar el producto
        Producto encontrado = empresa.buscarProductoPorCodigo(codigoIngresado);
        if (encontrado != null) {
            JOptionPane.showMessageDialog(null, "Producto encontrado: " + encontrado);
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }
}
