/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Josué Sánchez
 */
public class Producto {
    
    private int productoID;
    private String productoNombre;
    private double precio;
    private String tipo;

    public Producto(int productoID, String productoNombre, double precio, String tipo) {
        this.productoID = productoID;
        this.productoNombre = productoNombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getProductoID() {
        return productoID;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return productoNombre + " - \u20A1" + String.format("%.2f", precio);
    }
    
}
