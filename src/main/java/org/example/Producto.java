package org.example;


// Constructor
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stockrestante;

    public Producto(String codigo, String nombre, double precio, int stockrestante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stockrestante = stockrestante;
    }
// Metodo Vender Productos

    public boolean vender(int cantidad) {
        if (cantidad <= stockrestante) {
            stockrestante -= cantidad;
            System.out.println("Se Vendio la cantidad de: "+cantidad+" "+nombre);
            return true;
        } else {
            System.out.println("Inventario insuficiente");
            return false;
        }
    }


    //Metodo Reponer producto

    public void reponer(int cantidad) {
        stockrestante += cantidad;
    }

    // Metodo Descuento

    public void aplicarDescuento() {
        precio *= 0.98; //Descuento del 2%
    }

// Metodo
    public void aumentarPrecio() {
        precio *= 1.06; // Incrementa precio 6%
    }

    //
    public void mostrarInformacion() {
        System.out.println("SKU Producto: " + codigo);
        System.out.println("Nombre Producto: " + nombre);
        System.out.println("Precio Producto: " + precio);
        System.out.println("Inventario: " + stockrestante);
    }

    public double calcularValorTotal() {
        return stockrestante * precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stockrestante;
    }
}
