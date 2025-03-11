package org.example;

import java.util.ArrayList;
import java.util.List;


public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String codigo) {
        productos.removeIf(p -> p.getCodigo().equals(codigo));
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario esta vacio.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInformacion();
            System.out.println("--Lista Productos--");
        }
    }
}
