package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        while (true) {
            System.out.println("\n Manejo de Inventarios");

            System.out.println("1. Crear Producto");
            System.out.println("2. Vender Producto");
            System.out.println("3. Ingresar Inventario");
            System.out.println("4. Aplicar Descuentos 2%");
            System.out.println("5. Incrementar Precios el 6%");
            System.out.println("6. Mostrar Inventario");
            System.out.println("7. Eliminar Producto");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el SKU del producto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingresa el inventario inicial del producto: ");
                    int stockrestante = scanner.nextInt();
                    inventario.agregarProducto(new Producto(codigo, nombre, precio, stockrestante));

                    /*double men="NO APTO";
                    if(precio>500 {
                        men="APTO"; */


                    break;

                case 2:
                    System.out.print("Ingresa el SKU del producto a vender: ");
                    codigo = scanner.nextLine();
                    System.out.print("Ingresa la cantidad a vender: ");
                    int cantidadVenta = scanner.nextInt();
                    Producto productoVenta = inventario.buscarProductoPorCodigo(codigo);
                    if (productoVenta != null) {
                        productoVenta.vender(cantidadVenta);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el SKU del producto a reponer: ");
                    codigo = scanner.nextLine();
                    System.out.print("Ingresa la cantidad a reponer: ");
                    int cantidadReponer = scanner.nextInt();
                    Producto productoReponer = inventario.buscarProductoPorCodigo(codigo);
                    if (productoReponer != null) {
                        productoReponer.reponer(cantidadReponer);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingresa el SKU del producto para aplicar descuento: ");
                    codigo = scanner.nextLine();
                    Producto productoDescuento = inventario.buscarProductoPorCodigo(codigo);
                    if (productoDescuento != null) {
                        productoDescuento.aplicarDescuento();
                    } else {
                        System.out.println("Producto no Existe");
                    }
                    break;

                case 5:
                    System.out.print("Ingresa el SKU del producto para aumentar el precio: ");
                    codigo = scanner.nextLine();
                    Producto productoAumento = inventario.buscarProductoPorCodigo(codigo);
                    if (productoAumento != null) {
                        productoAumento.aumentarPrecio();
                    } else {
                        System.out.println("Sku Producto no encontrado");
                    }
                    break;

                case 6:
                    inventario.mostrarInventario();
                    break;

                case 7:
                    System.out.print("Ingresa el SKU del producto a eliminar: ");
                    codigo = scanner.nextLine();
                    inventario.eliminarProducto(codigo);
                    break;

                case 8:
                    System.out.println("Salir");
                    scanner.close();
                    return;
                default:

                    System.out.println("Opcion no valida");
            }
        }
    }
}


