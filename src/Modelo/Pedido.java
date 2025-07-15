/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 *
 * @author Josué Sánchez
 */
public class Pedido {
    
    private int pedidoID;
    private ArrayList<Producto> productos;
    private LocalDateTime fechaHora;
    private String estado; 

    public Pedido(int pedidoID) {
        this.pedidoID = pedidoID;
        this.productos = new ArrayList<>();
        this.fechaHora = LocalDateTime.now();
        this.estado = "Pediente";
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }

    public double calcularTotal() {
        return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
    }

    public int getPedidoID() {
        return pedidoID;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
